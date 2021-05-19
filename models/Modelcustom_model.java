// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_wing;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 0.0F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		rotation.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
		rotation.setTextureOffset(28, 22).addBox(-4.0F, 7.0F, 0.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		rotation.setTextureOffset(19, 9).addBox(-3.0F, -4.0F, 3.0F, 6.0F, 8.0F, 5.0F, 0.0F, false);
		rotation.setTextureOffset(0, 0).addBox(-3.0F, 4.0F, -8.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		rotation.setTextureOffset(0, 0).addBox(0.0F, 4.0F, -8.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 19.0F, 1.0F);
		right_leg.setTextureOffset(14, 22).addBox(-2.0F, 0.0F, -5.0F, 3.0F, 5.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.0F, 19.0F, 1.0F);
		left_leg.setTextureOffset(14, 22).addBox(-2.0F, 0.0F, -5.0F, 3.0F, 5.0F, 8.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(4.0F, 13.0F, 0.0F);
		right_wing.setTextureOffset(0, 14).addBox(-8.0F, 0.0F, -3.0F, 1.0F, 4.0F, 10.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-4.0F, 13.0F, 0.0F);
		left_wing.setTextureOffset(0, 14).addBox(7.0F, 0.0F, -3.0F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		left_wing.setTextureOffset(24, 0).addBox(2.0F, -6.0F, -3.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);
		left_wing.setTextureOffset(0, 29).addBox(3.0F, -7.0F, -2.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}