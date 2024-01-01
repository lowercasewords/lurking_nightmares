package com;

import net.minecraft.client.render.entity.EntityRendererFactory.Context;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
/* Class for rendering the Slender Model */
public class SlenderEntityRenderer extends MobEntityRenderer<SlenderEntity, SlenderEntityModel> {

    public SlenderEntityRenderer(Context context)
    {
        super(context, new SlenderEntityModel(context.getPart(SlenderModInitializerClient.MODEL_SLENDER_LAYER)), 0.5f);
    }
    
    @Override
    public Identifier getTexture(SlenderEntity var1) {
        // TODO Auto-generated method stub
        var stub =  new Identifier(SlenderModInitializer.PROJECT_NAMESPACE, "textures/slendertexture.png");
        return stub;
        // Mess stub.getPath();
    }

}