package com;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SlenderModInitializer implements ModInitializer {

    public static final String PROJECT_NAMESPACE = "lurking_nightmares";
    public static final String SLENDER_PATH_NAME = "slender";
    /* 
     * Registers and builds Slender Enitity with dimensions
    */
    public static final EntityType<SlenderEntity> SLENDER = Registry.register(
        Registries.ENTITY_TYPE, 
        new Identifier(PROJECT_NAMESPACE, SLENDER_PATH_NAME), 
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SlenderEntity::new)
            .dimensions(EntityDimensions.fixed(0.6f, 2.9f)).build());
    

    @Override
    public void onInitialize() {
        //Dictates the default slender mob attributes 
        FabricDefaultAttributeRegistry.register(SLENDER, SlenderEntity.createMobAttributes());
    }
}
