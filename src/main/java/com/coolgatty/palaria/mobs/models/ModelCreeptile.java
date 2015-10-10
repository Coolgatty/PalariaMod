package com.coolgatty.palaria.mobs.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCreeptile extends ModelBase
{
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer eye1;
    ModelRenderer eye2;
    ModelRenderer frontleftleg;
    ModelRenderer frontleftfoot;
    ModelRenderer frontrightleg;
    ModelRenderer frontrightfoot;
    ModelRenderer backleftleg;
    ModelRenderer backleftfoot;
    ModelRenderer backrightleg;
    ModelRenderer backrightfoot;
    
    public ModelCreeptile()
    {
        this(0.0F);
    }
  
    public ModelCreeptile(float par1)
    {
      textureWidth = 128;
      textureHeight = 128;
      
        body = new ModelRenderer(this, 42, 52);
        body.addBox(0F, 0F, 0F, 7, 6, 13);
        body.setRotationPoint(-3.5F, 13F, -6F);
        body.setTextureSize(128, 128);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        head = new ModelRenderer(this, 46, 18);
        head.addBox(-3.5F, -3F, -9F, 7, 5, 9);
        head.setRotationPoint(0F, 13.5F, -5F);
        head.setTextureSize(128, 128);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        tail1 = new ModelRenderer(this, 52, 78);
        tail1.addBox(-2.5F, -1F, 0F, 5, 3, 6);
        tail1.setRotationPoint(0F, 14.5F, 6F);
        tail1.setTextureSize(128, 128);
        tail1.mirror = true;
        setRotation(tail1, 0F, 0F, 0F);
        tail2 = new ModelRenderer(this, 48, 59);
        tail2.addBox(-2F, -1F, 0F, 4, 2, 10);
        tail2.setRotationPoint(0F, 15F, 7F);
        tail2.setTextureSize(128, 128);
        tail2.mirror = true;
        setRotation(tail2, 0F, 0F, 0F);
        tail3 = new ModelRenderer(this, 42, 57);
        tail3.addBox(-1.5F, -0.5F, 0F, 3, 1, 13);
        tail3.setRotationPoint(0F, 15F, 7F);
        tail3.setTextureSize(128, 128);
        tail3.mirror = true;
        setRotation(tail3, 0F, 0F, 0F);
        tail4 = new ModelRenderer(this, 45, 55);
        tail4.addBox(-0.5F, -0.5F, 0F, 1, 1, 15);
        tail4.setRotationPoint(0F, 15.5F, 7F);
        tail4.setTextureSize(128, 128);
        tail4.mirror = true;
        setRotation(tail4, 0F, 0F, 0F);
        eye1 = new ModelRenderer(this, 47, 10);
        eye1.addBox(1F, -4F, -4F, 2, 2, 2);
        eye1.setRotationPoint(0F, 13F, -5F);
        eye1.setTextureSize(128, 128);
        eye1.mirror = true;
        setRotation(eye1, 0F, 0F, 0F);
        eye2 = new ModelRenderer(this, 69, 10);
        eye2.addBox(-3F, -4F, -4F, 2, 2, 2);
        eye2.setRotationPoint(0F, 13F, -5F);
        eye2.setTextureSize(128, 128);
        eye2.mirror = true;
        setRotation(eye2, 0F, 0F, 0F);
        frontleftleg = new ModelRenderer(this, 22, 52);
        frontleftleg.addBox(0F, 0F, 0F, 4, 4, 4);
        frontleftleg.setRotationPoint(3F, 16F, -4F);
        frontleftleg.setTextureSize(128, 128);
        frontleftleg.mirror = true;
        setRotation(frontleftleg, 0F, 0F, 0F);
        frontleftfoot = new ModelRenderer(this, 11, 39);
        frontleftfoot.addBox(-2F, 0F, -2F, 4, 4, 4);
        frontleftfoot.setRotationPoint(5F, 20F, -4F);
        frontleftfoot.setTextureSize(128, 128);
        frontleftfoot.mirror = true;
        setRotation(frontleftfoot, 0F, 0F, 0F);
        frontrightleg = new ModelRenderer(this, 86, 52);
        frontrightleg.addBox(-4F, 0F, 0F, 4, 4, 4);
        frontrightleg.setRotationPoint(-3F, 16F, -4F);
        frontrightleg.setTextureSize(128, 128);
        frontrightleg.mirror = true;
        setRotation(frontrightleg, 0F, 0F, 0F);
        frontrightfoot = new ModelRenderer(this, 98, 39);
        frontrightfoot.addBox(-2F, 0F, -2F, 4, 4, 4);
        frontrightfoot.setRotationPoint(-5F, 20F, -4F);
        frontrightfoot.setTextureSize(128, 128);
        frontrightfoot.mirror = true;
        setRotation(frontrightfoot, 0F, 0F, 0F);
        backleftleg = new ModelRenderer(this, 22, 69);
        backleftleg.addBox(0F, 0F, 0F, 4, 4, 4);
        backleftleg.setRotationPoint(3F, 16F, 3F);
        backleftleg.setTextureSize(128, 128);
        backleftleg.mirror = true;
        setRotation(backleftleg, 0F, 0F, 0F);
        backleftfoot = new ModelRenderer(this, 11, 81);
        backleftfoot.addBox(-2F, 0F, -2F, 4, 4, 4);
        backleftfoot.setRotationPoint(5F, 20F, 7F);
        backleftfoot.setTextureSize(128, 128);
        backleftfoot.mirror = true;
        setRotation(backleftfoot, 0F, 0F, 0F);
        backrightleg = new ModelRenderer(this, 87, 68);
        backrightleg.addBox(-4F, 0F, 0F, 4, 4, 4);
        backrightleg.setRotationPoint(-3F, 16F, 3F);
        backrightleg.setTextureSize(128, 128);
        backrightleg.mirror = true;
        setRotation(backrightleg, 0F, 0F, 0F);
        backrightfoot = new ModelRenderer(this, 98, 80);
        backrightfoot.addBox(-2F, 0F, -2F, 4, 4, 4);
        backrightfoot.setRotationPoint(-5F, 20F, 7F);
        backrightfoot.setTextureSize(128, 128);
        backrightfoot.mirror = true;
        setRotation(backrightfoot, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
	  super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	  setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    body.render(par7);
    head.render(par7);
    tail1.render(par7);
    tail2.render(par7);
    tail3.render(par7);
    tail4.render(par7);
    eye1.render(par7);
    eye2.render(par7);
    frontleftleg.render(par7);
    frontleftfoot.render(par7);
    frontrightleg.render(par7);
    frontrightfoot.render(par7);
    backleftleg.render(par7);
    backleftfoot.render(par7);
    backrightleg.render(par7);
    backrightfoot.render(par7);
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
    head.rotateAngleY = par4 / (180F / (float)Math.PI);
    head.rotateAngleX = par5 / (180F / (float)Math.PI);
    eye1.rotateAngleY = par4 / (180F / (float)Math.PI);
    eye1.rotateAngleX = par5 / (180F / (float)Math.PI);
    eye2.rotateAngleY = par4 / (180F / (float)Math.PI);
    eye2.rotateAngleX = par5 / (180F / (float)Math.PI);
    frontleftfoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    frontrightfoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    backleftfoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    backrightfoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    tail1.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
    tail1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.1F * par2;
    tail2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.4F * par2;
    tail2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.1F * par2;
    tail3.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
    tail3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.1F * par2;
    tail4.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
    tail4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.1F * par2;
  }
}
