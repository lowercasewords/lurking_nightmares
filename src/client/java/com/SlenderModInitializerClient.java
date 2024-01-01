package com;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;


@Environment(EnvType.CLIENT)
public class SlenderModInitializerClient implements ClientModInitializer {

    
    public static final EntityModelLayer MODEL_SLENDER_LAYER = new EntityModelLayer(
        new Identifier(SlenderModInitializer.PROJECT_NAMESPACE, "slender"), "main");

    @Override
    public void onInitializeClient() {
        
        EntityRendererRegistry.register(SlenderModInitializer.SLENDER, (context) -> {
            return new SlenderEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_SLENDER_LAYER, SlenderEntityModel::getTexturedModelData);
    }
}
