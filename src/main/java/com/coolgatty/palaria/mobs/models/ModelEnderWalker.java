package com.coolgatty.palaria.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEnderWalker extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer rightfrontleg1;
    ModelRenderer leftfrontleg1;
    ModelRenderer rightbackleg1;
    ModelRenderer leftbackleg1;
    ModelRenderer rightfrontleg2;
    ModelRenderer leftfrontleg2;
    ModelRenderer leftbackleg2;
    ModelRenderer rightbackleg2;
    ModelRenderer something;
  
  public ModelEnderWalker()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      body = new ModelRenderer(this, 22, 6);
      body.addBox(-3F, -3F, -3F, 6, 6, 6);
      body.setRotationPoint(0F, 17F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightfrontleg1 = new ModelRenderer(this, 10, 10);
      rightfrontleg1.addBox(-0.5F, -8F, -0.5F, 1, 8, 1);
      rightfrontleg1.setRotationPoint(-2.5F, 15F, -2F);
      rightfrontleg1.setTextureSize(64, 64);
      rightfrontleg1.mirror = true;
      setRotation(rightfrontleg1, 0.3490659F, 0F, -0.6108652F);
      leftfrontleg1 = new ModelRenderer(this, 10, 10);
      leftfrontleg1.addBox(-0.5F, -8F, -0.5F, 1, 8, 1);
      leftfrontleg1.setRotationPoint(2.5F, 15F, -2F);
      leftfrontleg1.setTextureSize(64, 64);
      leftfrontleg1.mirror = true;
      setRotation(leftfrontleg1, 0.3490659F, 0F, 0.6108652F);
      rightbackleg1 = new ModelRenderer(this, 10, 10);
      rightbackleg1.addBox(-0.5F, -8F, -0.5F, 1, 8, 1);
      rightbackleg1.setRotationPoint(-2.5F, 15F, 2F);
      rightbackleg1.setTextureSize(64, 64);
      rightbackleg1.mirror = true;
      setRotation(rightbackleg1, -0.3490659F, 0F, -0.6108652F);
      leftbackleg1 = new ModelRenderer(this, 10, 10);
      leftbackleg1.addBox(-0.5333334F, -8F, -0.4666667F, 1, 8, 1);
      leftbackleg1.setRotationPoint(2.5F, 15F, 2F);
      leftbackleg1.setTextureSize(64, 64);
      leftbackleg1.mirror = true;
      setRotation(leftbackleg1, -0.3490659F, 0F, 0.6108652F);
      rightfrontleg2 = new ModelRenderer(this, 10, 10);
      rightfrontleg2.addBox(-7F, -1F, -4F, 1, 22, 1);
      rightfrontleg2.setRotationPoint(-2.5F, 15F, -2F);
      rightfrontleg2.setTextureSize(64, 64);
      rightfrontleg2.mirror = true;
      setRotation(rightfrontleg2, -0.6108652F, 0F, 0.6108652F);
      leftfrontleg2 = new ModelRenderer(this, 10, 10);
      leftfrontleg2.addBox(6F, -1F, -4F, 1, 22, 1);
      leftfrontleg2.setRotationPoint(2.5F, 15F, -2F);
      leftfrontleg2.setTextureSize(64, 64);
      leftfrontleg2.mirror = true;
      setRotation(leftfrontleg2, -0.6108652F, 0F, -0.6108652F);
      leftbackleg2 = new ModelRenderer(this, 10, 10);
      leftbackleg2.addBox(6F, -1F, 3F, 1, 22, 1);
      leftbackleg2.setRotationPoint(2.5F, 15F, 2F);
      leftbackleg2.setTextureSize(64, 64);
      leftbackleg2.mirror = true;
      setRotation(leftbackleg2, 0.6108652F, 0F, -0.6108652F);
      rightbackleg2 = new ModelRenderer(this, 10, 10);
      rightbackleg2.addBox(-7F, -1F, 3F, 1, 22, 1);
      rightbackleg2.setRotationPoint(-2.5F, 15F, 2F);
      rightbackleg2.setTextureSize(64, 64);
      rightbackleg2.mirror = true;
      setRotation(rightbackleg2, 0.6108652F, 0F, 0.6108652F);
      something = new ModelRenderer(this, 30, 22);
      something.addBox(-1F, 3F, -1F, 2, 2, 2);
      something.setRotationPoint(0F, 17F, 0F);
      something.setTextureSize(64, 64);
      something.mirror = true;
      setRotation(something, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
	super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    body.render(par7);
    rightfrontleg1.render(par7);
    leftfrontleg1.render(par7);
    rightbackleg1.render(par7);
    leftbackleg1.render(par7);
    rightfrontleg2.render(par7);
    leftfrontleg2.render(par7);
    leftbackleg2.render(par7);
    rightbackleg2.render(par7);
    something.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    rightfrontleg2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
    leftfrontleg2.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.5F * par2;
    leftbackleg2.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.5F * par2;
    rightbackleg2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
  }

}
