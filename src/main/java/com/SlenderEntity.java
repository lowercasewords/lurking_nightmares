package com;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class SlenderEntity extends PathAwareEntity {

    public SlenderEntity(EntityType<SlenderEntity> entityType, World world)
    {
        super(entityType, world);
    }
}
