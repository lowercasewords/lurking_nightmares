package com;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class SlenderEntityModel extends EntityModel<SlenderEntity> {
	private final ModelPart Arms;
	private final ModelPart Legs;
	private final ModelPart bb_main;
	public SlenderEntityModel(ModelPart root) {
		this.Arms = root.getChild("Arms");
		this.Legs = root.getChild("Legs");
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Arms = modelPartData.addChild("Arms", ModelPartBuilder.create().uv(18, 32).cuboid(-6.0F, -36.0F, -1.0F, 2.0F, 19.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 32).cuboid(4.0F, -36.0F, -1.0F, 2.0F, 19.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Legs = modelPartData.addChild("Legs", ModelPartBuilder.create().uv(26, 16).cuboid(1.0F, -27.0F, -1.0F, 2.0F, 27.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-3.0F, -27.0F, -1.0F, 2.0F, 27.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -45.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-4.0F, -37.0F, -2.0F, 8.0F, 11.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SlenderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Arms.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Legs.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	
}