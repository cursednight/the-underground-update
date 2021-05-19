// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelhoglin extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer right_ear;
	private final ModelRenderer left_ear;
	private final ModelRenderer leg_back_right;
	private final ModelRenderer leg_back_left;
	private final ModelRenderer leg_front_right;
	private final ModelRenderer leg_front_left;

	public Modelhoglin() {
		textureWidth = 128;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, -3.0F);
		body.setTextureOffset(1, 1).addBox(-8.0F, -6.0F, -4.0F, 16.0F, 14.0F, 26.0F, 0.02F, false);
		body.setTextureOffset(90, 33).addBox(0.0F, -13.0F, -7.0F, 0.0F, 10.0F, 19.0F, 0.02F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, -2.0F);
		body.addChild(head);
		setRotationAngle(head, 0.8727F, 0.0F, 0.0F);
		head.setTextureOffset(61, 1).addBox(-7.0F, -5.0F, -19.0F, 14.0F, 6.0F, 19.0F, 0.0F, false);
		head.setTextureOffset(1, 13).addBox(-8.0F, -11.0F, -14.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(1, 13).addBox(6.0F, -11.0F, -14.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-7.0F, -5.0F, -2.0F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, 0.0F, 0.0F, -0.8727F);
		right_ear.setTextureOffset(1, 1).addBox(-6.0F, 0.0F, -3.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(7.0F, -5.0F, -2.0F);
		head.addChild(left_ear);
		setRotationAngle(left_ear, 0.0F, 0.0F, 0.8727F);
		left_ear.setTextureOffset(1, 6).addBox(0.0F, 0.0F, -3.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		leg_back_right = new ModelRenderer(this);
		leg_back_right.setRotationPoint(6.0F, 16.0F, 17.0F);
		leg_back_right.setTextureOffset(21, 45).addBox(-14.0F, -3.0F, -4.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		leg_back_left = new ModelRenderer(this);
		leg_back_left.setRotationPoint(-6.0F, 16.0F, 17.0F);
		leg_back_left.setTextureOffset(0, 45).addBox(9.0F, -3.0F, -4.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		leg_front_right = new ModelRenderer(this);
		leg_front_right.setRotationPoint(-6.0F, 12.0F, -3.0F);
		leg_front_right.setTextureOffset(66, 42).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		leg_front_left = new ModelRenderer(this);
		leg_front_left.setRotationPoint(6.0F, 12.0F, -3.0F);
		leg_front_left.setTextureOffset(41, 42).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);
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
		leg_back_right.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_back_left.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_front_right.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_front_left.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}