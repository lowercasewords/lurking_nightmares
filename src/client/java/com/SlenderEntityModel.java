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
	private final ModelPart Torso;
	private ModelPart torso_r1;
	private ModelPart Arms;
	private ModelPart LeftArm;
	private ModelPart LeftUpperLimb;
	private ModelPart LeftLowerLimb;
	private ModelPart RightArm;
	private ModelPart RightUpperLimb;
	private ModelPart RightLowerLimb;
	private ModelPart cube_r1;
	private ModelPart Legs;
	private ModelPart LeftLeg;
	private ModelPart LeftUpperLeg;
	private ModelPart LeftLowerLeg;
	private ModelPart RightLeg;
	private ModelPart RightUpperLeg;
	private ModelPart RightLowerLeg;
	private ModelPart Head;
	private ModelPart head_r1;

	public SlenderEntityModel(ModelPart root) {
		this.Torso = root.getChild("Torso");
	}
	
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Torso = modelPartData.addChild("Torso", ModelPartBuilder.create(), ModelTransform.of(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData torso_r1 = Torso.addChild("torso_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -11.0F, -2.0F, 8.0F, 11.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData Arms = Torso.addChild("Arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 26.0F, 0.0F));

		ModelPartData LeftArm = Arms.addChild("LeftArm", ModelPartBuilder.create(), ModelTransform.of(3.0F, -36.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		ModelPartData LeftUpperLimb = LeftArm.addChild("LeftUpperLimb", ModelPartBuilder.create().uv(10, 32).cuboid(4.0F, -36.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 36.0F, 0.0F));

		ModelPartData LeftLowerLimb = LeftUpperLimb.addChild("LeftLowerLimb", ModelPartBuilder.create().uv(10, 32).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData RightArm = Arms.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.of(-4.0F, -35.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData RightUpperLimb = RightArm.addChild("RightUpperLimb", ModelPartBuilder.create().uv(10, 32).mirrored().cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData RightLowerLimb = RightUpperLimb.addChild("RightLowerLimb", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 11.0F, 0.0F));

		ModelPartData cube_r1 = RightLowerLimb.addChild("cube_r1", ModelPartBuilder.create().uv(10, 32).mirrored().cuboid(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.6972F, 8.9696F, 0.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData Legs = Torso.addChild("Legs", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData LeftLeg = Legs.addChild("LeftLeg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 26.0F, 0.0F));

		ModelPartData LeftUpperLeg = LeftLeg.addChild("LeftUpperLeg", ModelPartBuilder.create().uv(26, 16).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -26.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData LeftLowerLeg = LeftUpperLeg.addChild("LeftLowerLeg", ModelPartBuilder.create().uv(26, 16).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 17.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData RightLeg = Legs.addChild("RightLeg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 26.0F, 0.0F));

		ModelPartData RightUpperLeg = RightLeg.addChild("RightUpperLeg", ModelPartBuilder.create().uv(26, 16).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.0F, -26.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData RightLowerLeg = RightUpperLeg.addChild("RightLowerLeg", ModelPartBuilder.create().uv(26, 16).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 17.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create(), ModelTransform.of(1.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData head_r1 = Head.addChild("head_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SlenderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Torso.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}