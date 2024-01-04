package com;

import java.security.PublicKey;
import java.util.Random;

import com.entityai.slenderai.SlenderStalking;
import com.entityai.slenderai.SlenderStates;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.command.argument.EntityAnchorArgumentType.EntityAnchor;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class SlenderEntity extends PathAwareEntity {
    
    public static final double MAX_TARGET_DISTANCE = 100;

    /** Maximum number of tics to end stalking phase */
    private static final int MAX_STALKING_TIMER = 6000;
    
    /** The player that is targeted by the Slender */
    private PlayerEntity targetPlayer = null;
    
    private SlenderStates currentState = null;

    /** Stores amount of tics made in the current state */
    private int tickCounter  = 0;
    
    public SlenderEntity(EntityType<SlenderEntity> entityType, World world)
    {   
        super(entityType, world);
        currentState = SlenderStates.SLENDER_STALKING;

        ServerTickEvents.START_WORLD_TICK.register(new ServerTickEvents.StartWorldTick() {
            
            @Override
            public void onStartTick(ServerWorld world) {
                SlenderEntity.this.tickUpdate(world);
        }});
        
    }
    
    public PlayerEntity getTargetPlayer()
    {
        return targetPlayer;
    }

    public void setTargetPlayer(PlayerEntity player)
    {
        this.targetPlayer = player;
    }

    /**
     *  Method running every world tick for each instance of slender entity separately
     * @param server The world in which the ticking is occuring
    */
    private void tickUpdate(ServerWorld world)
    {
        /* Don't be active if Slender is dead */
        if(this.isDead())
            return;

        System.out.println(this.currentState);

        /* Makes Slender look at its target */
        targetPlayer = world.getClosestPlayer(this, MAX_TARGET_DISTANCE);
        if(targetPlayer != null) {
            this.lookAt(EntityAnchor.EYES, targetPlayer.getEyePos());
        }
        
        if(this.currentState == SlenderStates.SLENDER_STALKING)
        {
            if(tickCounter == SlenderStalking.TELEPORT_TIC_COOLDOWN)
            {
                SlenderStalking.sneakyTeleport(this);
                tickCounter = 0;
            }
        }
        ++tickCounter;
    }
    
}
