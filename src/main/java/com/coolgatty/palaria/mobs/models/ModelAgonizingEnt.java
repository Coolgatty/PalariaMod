package com.coolgatty.palaria.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAgonizingEnt extends ModelBase {
    public ModelRenderer twig1;
    public ModelRenderer twig2;
    public ModelRenderer twig3;
    public ModelRenderer twig4;
    public ModelRenderer torso;
    public ModelRenderer twig5;
    public ModelRenderer twig6;
    public ModelRenderer twig7;
    public ModelRenderer twig8;
    public ModelRenderer twig9;
    public ModelRenderer twig10;
    public ModelRenderer twig11;
    public ModelRenderer twig12;
    public ModelRenderer twig13;
    public ModelRenderer twig14;
    public ModelRenderer armRight;
    public ModelRenderer armRight_1;
    public ModelRenderer frontLeftLeg;
    public ModelRenderer frontRightLeg;
    public ModelRenderer backLeftLeg;
    public ModelRenderer backRightLeg;

    public ModelAgonizingEnt() {
        this.textureWidth = 126;
        this.textureHeight = 128;
        this.torso = new ModelRenderer(this, 35, 32);
        this.torso.setRotationPoint(-1.0F, 2.0F, -1.0F);
        this.torso.addBox(-4.0F, 0.0F, 0.0F, 8, 21, 9, 0.0F);
        this.twig10 = new ModelRenderer(this, 0, 0);
        this.twig10.setRotationPoint(3.0F, -2.0F, 0.0F);
        this.twig10.addBox(0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F);
        this.twig3 = new ModelRenderer(this, 0, 0);
        this.twig3.setRotationPoint(-2.0F, -1.0F, -1.0F);
        this.twig3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F);
        this.twig1 = new ModelRenderer(this, 0, 0);
        this.twig1.setRotationPoint(-5.0F, -1.0F, -1.0F);
        this.twig1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F);
        this.twig4 = new ModelRenderer(this, 0, 0);
        this.twig4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.twig4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.twig6 = new ModelRenderer(this, 0, 0);
        this.twig6.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.twig6.addBox(0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F);
        this.twig12 = new ModelRenderer(this, 0, 0);
        this.twig12.setRotationPoint(3.0F, 0.0F, 4.0F);
        this.twig12.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.twig11 = new ModelRenderer(this, 0, 0);
        this.twig11.setRotationPoint(3.0F, -1.0F, 1.0F);
        this.twig11.addBox(0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F);
        this.backLeftLeg = new ModelRenderer(this, 94, 0);
        this.backLeftLeg.setRotationPoint(1.0F, 22.0F, 7.0F);
        this.backLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.17453292519943295F, 0.3141592653589793F, 0.08726646259971647F);
        this.twig8 = new ModelRenderer(this, 0, 0);
        this.twig8.setRotationPoint(-5.0F, -2.0F, 7.0F);
        this.twig8.addBox(0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F);
        this.twig7 = new ModelRenderer(this, 0, 0);
        this.twig7.setRotationPoint(-5.0F, 1.0F, 2.0F);
        this.twig7.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
        this.twig9 = new ModelRenderer(this, 0, 0);
        this.twig9.setRotationPoint(-5.0F, 0.0F, 6.0F);
        this.twig9.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.armRight_1 = new ModelRenderer(this, 50, 0);
        this.armRight_1.setRotationPoint(2.0F, 3.0F, 3.0F);
        this.armRight_1.addBox(0.0F, 0.0F, 0.0F, 2, 18, 2, 0.0F);
        this.setRotateAngle(armRight_1, -0.3490658503988659F, -0.3490658503988659F, -0.04363323129985824F);
        this.frontLeftLeg = new ModelRenderer(this, 40, 11);
        this.frontLeftLeg.setRotationPoint(1.0F, 22.0F, 1.0F);
        this.frontLeftLeg.addBox(-1.0F, 0.0F, -8.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.17453292519943295F, -0.3141592653589793F, 0.08726646259971647F);
        this.frontRightLeg = new ModelRenderer(this, 40, 11);
        this.frontRightLeg.setRotationPoint(-3.0F, 22.0F, 1.0F);
        this.frontRightLeg.addBox(-2.0F, 0.0F, -8.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(frontRightLeg, 0.20943951023931953F, 0.2617993877991494F, -0.08726646259971647F);
        this.twig13 = new ModelRenderer(this, 0, 0);
        this.twig13.setRotationPoint(3.0F, -2.0F, 5.0F);
        this.twig13.addBox(0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F);
        this.backRightLeg = new ModelRenderer(this, 57, 3);
        this.backRightLeg.setRotationPoint(-3.0F, 22.0F, 7.0F);
        this.backRightLeg.addBox(-2.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(backRightLeg, -0.20943951023931953F, -0.2617993877991494F, 0.08726646259971647F);
        this.twig5 = new ModelRenderer(this, 0, 0);
        this.twig5.setRotationPoint(-5.0F, -2.0F, -1.0F);
        this.twig5.addBox(0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F);
        this.twig14 = new ModelRenderer(this, 0, 0);
        this.twig14.setRotationPoint(3.0F, 0.0F, 6.0F);
        this.twig14.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.twig2 = new ModelRenderer(this, 0, 0);
        this.twig2.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.twig2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.armRight = new ModelRenderer(this, 40, 0);
        this.armRight.setRotationPoint(-4.0F, 3.0F, 3.0F);
        this.armRight.addBox(-2.0F, 0.0F, 0.0F, 2, 18, 2, 0.0F);
        this.setRotateAngle(armRight, -0.3490658503988659F, 0.3490658503988659F, 0.04363323129985824F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.torso.render(f5);
        this.twig10.render(f5);
        this.twig3.render(f5);
        this.twig1.render(f5);
        this.twig4.render(f5);
        this.twig6.render(f5);
        this.twig12.render(f5);
        this.twig11.render(f5);
        this.backLeftLeg.render(f5);
        this.twig8.render(f5);
        this.twig7.render(f5);
        this.twig9.render(f5);
        this.armRight_1.render(f5);
        this.frontLeftLeg.render(f5);
        this.frontRightLeg.render(f5);
        this.twig13.render(f5);
        this.backRightLeg.render(f5);
        this.twig5.render(f5);
        this.twig14.render(f5);
        this.twig2.render(f5);
        this.armRight.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
