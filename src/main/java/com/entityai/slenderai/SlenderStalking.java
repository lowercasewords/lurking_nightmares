package com.entityai.slenderai;

import java.util.Random;

import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.Callback;

import com.SlenderEntity;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class SlenderStalking {
    
    /**
     * Maximum teleportation distance from the player
     */
    private static final double MAX_SPAWN_DISTANCE = SlenderEntity.MAX_TARGET_DISTANCE;

    /**
     * Minimum teleportation distance from the player
     */
    private static final double MIN_SPAWN_DISTANCE = MAX_SPAWN_DISTANCE/2;
    
    private static final Random R = new Random();

    public static final int TELEPORT_TIC_COOLDOWN = 20*5;

    public static void sneakyTeleport(SlenderEntity entity)
    {
        /**
         * Targeted player
         */
        PlayerEntity target;
        double x;
        double y;
        double z;
        
        target = entity.getTargetPlayer();

        if(target == null)
            return;
        
        x = MIN_SPAWN_DISTANCE + (MAX_SPAWN_DISTANCE - MIN_SPAWN_DISTANCE) * R.nextDouble();
        y = target.getY();
        z = MIN_SPAWN_DISTANCE + (MAX_SPAWN_DISTANCE - MIN_SPAWN_DISTANCE) * R.nextDouble();

        entity.teleport(x, y, z);
    }
    
}
