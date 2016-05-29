package com.coolgatty.palaria.mobs.models;

import com.coolgatty.palaria.mobs.EntityCowasaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelOverlord extends ModelBase
{
  //fields
    ModelRenderer upperTorso;
    ModelRenderer midTorso;
    ModelRenderer lowerTorso;
    ModelRenderer head;
    ModelRenderer frontLeftArm1a;
    ModelRenderer frontRightArm2a;
    ModelRenderer frontLeftArm1b;
    ModelRenderer frontRightArm2b;
    ModelRenderer backLeftArm1a;
    ModelRenderer backLeftArm1b;
    ModelRenderer backRightArm2a;
    ModelRenderer backRightArm2b;
    
    int field_78163_i = 1;
  
  public ModelOverlord()
  {
    textureWidth = 128;
    textureHeight = 128;
    
    upperTorso = new ModelRenderer(this, 45, 45);
    upperTorso.addBox(-5F, 0F, -1F, 10, 8, 9);
    upperTorso.setRotationPoint(0F, 0F, 0F);
    upperTorso.setTextureSize(64, 32);
    upperTorso.mirror = true;
    setRotation(upperTorso, 0.2974289F, 0F, 0F);
    midTorso = new ModelRenderer(this, 45, 66);
    midTorso.addBox(-4F, 8F, 1F, 8, 6, 7);
    midTorso.setRotationPoint(0F, 0F, 0F);
    midTorso.setTextureSize(64, 32);
    midTorso.mirror = true;
    setRotation(midTorso, 0.1487144F, 0F, 0F);
    lowerTorso = new ModelRenderer(this, 45, 83);
    lowerTorso.addBox(-3F, 14F, 3F, 6, 5, 5);
    lowerTorso.setRotationPoint(0F, 0F, 0F);
    lowerTorso.setTextureSize(64, 32);
    lowerTorso.mirror = true;
    setRotation(lowerTorso, 0.0478158F, 0F, 0F);
    head = new ModelRenderer(this, 45, 15);
    head.addBox(-8F, -12F, -2F, 16, 12, 14);
    head.setRotationPoint(0F, 0F, 0F);
    head.setTextureSize(64, 32);
    head.mirror = true;
    setRotation(head, 0.4461433F, 0F, 0F);
    frontLeftArm1a = new ModelRenderer(this, 25, 40);
    frontLeftArm1a.addBox(0F, 0F, 0F, 3, 12, 3);
    frontLeftArm1a.setRotationPoint(5F, 0F, -1F);
    frontLeftArm1a.setTextureSize(64, 32);
    frontLeftArm1a.mirror = true;
    setRotation(frontLeftArm1a, -0.2602503F, 0.0743572F, -0.4089647F);
    frontRightArm2a = new ModelRenderer(this, 112, 40);
    frontRightArm2a.addBox(-3F, 0F, 0F, 3, 12, 3);
    frontRightArm2a.setRotationPoint(-5F, 0F, -1F);
    frontRightArm2a.setTextureSize(64, 32);
    frontRightArm2a.mirror = true;
    setRotation(frontRightArm2a, -0.260246F, -0.0827286F, 0.4089656F);
    frontLeftArm1b = new ModelRenderer(this, 29, 55);
    frontLeftArm1b.addBox(6F, 8F, 4F, 2, 12, 2);
    frontLeftArm1b.setRotationPoint(5F, 0F, -1F);
    frontLeftArm1b.setTextureSize(64, 32);
    frontLeftArm1b.mirror = true;
    setRotation(frontLeftArm1b, -0.7435722F, -0.0371786F, 0.1115358F);
    frontRightArm2b = new ModelRenderer(this, 112, 55);
    frontRightArm2b.addBox(-8F, 8F, 4F, 2, 12, 2);
    frontRightArm2b.setRotationPoint(-5F, 0F, -1F);
    frontRightArm2b.setTextureSize(64, 32);
    frontRightArm2b.mirror = true;
    setRotation(frontRightArm2b, -0.7435801F, -0.0371755F, -0.111544F);
    backLeftArm1a = new ModelRenderer(this, 10, 40);
    backLeftArm1a.addBox(-2F, 0F, -1.5F, 3, 12, 3);
    backLeftArm1a.setRotationPoint(7F, -4F, 9F);
    backLeftArm1a.setTextureSize(64, 32);
    backLeftArm1a.mirror = true;
    setRotation(backLeftArm1a, 0.0743572F, 0.2974289F, -0.669215F);
    backLeftArm1b = new ModelRenderer(this, 10, 55);
    backLeftArm1b.addBox(5.0F, 10F, -1.5F, 2, 12, 2);
    backLeftArm1b.setRotationPoint(7F, -4F, 9F);
    backLeftArm1b.setTextureSize(64, 32);
    backLeftArm1b.mirror = true;
    setRotation(backLeftArm1b, -0.557687F, -0.8922867F, 0.1115358F);
    backRightArm2a = new ModelRenderer(this, 112, 75);
    backRightArm2a.addBox(-1F, 0F, -1.5F, 3, 12, 3);
    backRightArm2a.setRotationPoint(-7F, -4F, 9F);
    backRightArm2a.setTextureSize(64, 32);
    backRightArm2a.mirror = true;
    setRotation(backRightArm2a, 0.074351F, -0.2974216F, 0.6692116F);
    backRightArm2b = new ModelRenderer(this, 112, 90);
    backRightArm2b.addBox(-7F, 10F, -1.5F, 2, 12, 2);
    backRightArm2b.setRotationPoint(-7F, -4F, 9F);
    backRightArm2b.setTextureSize(64, 32);
    backRightArm2b.mirror = true;
    setRotation(backRightArm2b, -0.557687F, 0.8922821F, -0.111544F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    upperTorso.render(f5);
    midTorso.render(f5);
    lowerTorso.render(f5);
    head.render(f5);
    frontLeftArm1a.render(f5);
    frontRightArm2a.render(f5);
    frontLeftArm1b.render(f5);
    frontRightArm2b.render(f5);
    backLeftArm1a.render(f5);
    backLeftArm1b.render(f5);
    backRightArm2a.render(f5);
    backRightArm2b.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
    this.frontLeftArm1a.rotationPointX =  5.0F;
    this.frontLeftArm1a.rotationPointY =  0.0F;
    this.frontLeftArm1a.rotationPointZ = -1.0F;

    this.frontRightArm2a.rotationPointX = -5.0F;
    this.frontRightArm2a.rotationPointY =  0.0F;
    this.frontRightArm2a.rotationPointZ = -1.0F;

    this.frontLeftArm1b.rotationPointX =  5.0F;
    this.frontLeftArm1b.rotationPointY =  0.0F;
    this.frontLeftArm1b.rotationPointZ = -1.0F;

    this.frontRightArm2b.rotationPointX = -5.0F;
    this.frontRightArm2b.rotationPointY =  0.0F;
    this.frontRightArm2b.rotationPointZ = -1.0F;

    this.backLeftArm1a.rotationPointX =  7.0F;
    this.backLeftArm1a.rotationPointY = -4.0F;
    this.backLeftArm1a.rotationPointZ =  9.0F;
    
    this.backLeftArm1b.rotationPointX =  7.0F;
    this.backLeftArm1b.rotationPointY = -4.0F;
    this.backLeftArm1b.rotationPointZ =  9.0F;
    
    this.backRightArm2a.rotationPointX = -7.0F;
    this.backRightArm2a.rotationPointY = -4.0F;
    this.backRightArm2a.rotationPointZ =  9.0F;
    
    this.backRightArm2b.rotationPointX = -7.0F;
    this.backRightArm2b.rotationPointY = -4.0F;
    this.backRightArm2b.rotationPointZ =  9.0F;
  }
  
  public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
  {
      Entity entity = entitylivingbaseIn;  
      
      this.head.rotationPointX = 0.4461433F;
      this.head.rotationPointY = 0.0F;
      this.head.rotationPointZ = 0.0F;
      
      this.upperTorso.rotationPointX = 0.2974289F;
      this.upperTorso.rotationPointY = 0.0F;
      this.upperTorso.rotationPointZ = 0.0F;
      
      this.midTorso.rotationPointX = 0.1487144F;
      this.midTorso.rotationPointY = 0.0F;
      this.midTorso.rotationPointZ = 0.0F;
      
      this.lowerTorso.rotationPointX = 0.0478158F;
      this.lowerTorso.rotationPointY = 0.0F;
      this.lowerTorso.rotationPointZ = 0.0F;

      this.frontLeftArm1a.rotationPointX = -0.2602503F;
      this.frontLeftArm1a.rotationPointY =  0.0743572F;
      this.frontLeftArm1a.rotationPointZ = -0.4089647F;

      this.frontRightArm2a.rotationPointX = -0.260246F;
      this.frontRightArm2a.rotationPointY = -0.0827286F;
      this.frontRightArm2a.rotationPointZ =  0.4089656F;

      this.frontLeftArm1b.rotationPointX = -0.7435722F;
      this.frontLeftArm1b.rotationPointY = -0.0371786F;
      this.frontLeftArm1b.rotationPointZ =  0.1115358F;

      this.frontRightArm2b.rotationPointX = -0.7435801F;
      this.frontRightArm2b.rotationPointY = -0.0371755F;
      this.frontRightArm2b.rotationPointZ = -0.111544F;

      this.backLeftArm1a.rotationPointX =  0.0743572F;
      this.backLeftArm1a.rotationPointY =  0.2974289F;
      this.backLeftArm1a.rotationPointZ = -0.669215F;
      
      this.backLeftArm1b.rotationPointX = -0.557687F;
      this.backLeftArm1b.rotationPointY = -0.8922867F;
      this.backLeftArm1b.rotationPointZ =  0.1115358F;
      
      this.backRightArm2a.rotationPointX =  0.074351F;
      this.backRightArm2a.rotationPointY = -0.2974216F;
      this.backRightArm2a.rotationPointZ =  0.6692116F;
      
      this.backRightArm2b.rotationPointX = -0.557687F;
      this.backRightArm2b.rotationPointY =  0.8922821F;
      this.backRightArm2b.rotationPointZ = -0.111544F;
      
      float bobSpeed = 0.1F;
      float bobSpeedWalking = 0.6662F;
      if (entity.isSneaking())
      {
    	  head.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.1F + this.head.rotationPointX;
    	  upperTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.3F  + this.upperTorso.rotationPointX;
    	  midTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.4F  + this.midTorso.rotationPointX;
    	  lowerTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.5F  + this.lowerTorso.rotationPointX;
    	  
    	  frontLeftArm1a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking +(float)Math.PI) * 0.2F  + this.frontLeftArm1a.rotationPointZ;
    	  frontLeftArm1b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking +(float)Math.PI) * 0.2F  + this.frontLeftArm1b.rotationPointZ;
    	  
    	  frontRightArm2a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.frontRightArm2a.rotationPointZ;
    	  frontRightArm2b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.frontRightArm2b.rotationPointZ;
    	  
    	  backLeftArm1a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking +(float)Math.PI) * 0.2F  + this.backLeftArm1a.rotationPointZ;
    	  backLeftArm1b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking +(float)Math.PI) * 0.2F  + this.backLeftArm1b.rotationPointZ;
    	  
    	  backRightArm2a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.backRightArm2a.rotationPointZ;
    	  backRightArm2b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.backRightArm2b.rotationPointZ;
    	  this.field_78163_i = 0;
      }
      else if (entity.isSprinting())
      {
    	  head.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.1F + this.head.rotationPointX;
    	  upperTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.3F  + this.upperTorso.rotationPointX;
    	  midTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.4F  + this.midTorso.rotationPointX;
    	  lowerTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.5F  + this.lowerTorso.rotationPointX;
    	  
    	  frontLeftArm1a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking+(float)Math.PI) * 0.2F  + this.frontLeftArm1a.rotationPointZ;
    	  frontLeftArm1b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking+(float)Math.PI) * 0.2F  + this.frontLeftArm1b.rotationPointZ;
    	  
    	  frontRightArm2a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.frontRightArm2a.rotationPointZ;
    	  frontRightArm2b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.frontRightArm2b.rotationPointZ;
    	  
    	  backLeftArm1a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking+(float)Math.PI) * 0.2F  + this.backLeftArm1a.rotationPointZ;
    	  backLeftArm1b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking+(float)Math.PI) * 0.2F  + this.backLeftArm1b.rotationPointZ;
    	  
    	  backRightArm2a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.backRightArm2a.rotationPointZ;
    	  backRightArm2b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeedWalking) * 0.2F  + this.backRightArm2b.rotationPointZ;
    	  this.field_78163_i = 2;
      }
      else
      {
    	  head.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.08F + this.head.rotationPointX;
          upperTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.2F  + this.upperTorso.rotationPointX;
          midTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.3F  + this.midTorso.rotationPointX;
          lowerTorso.rotateAngleX = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.4F  + this.lowerTorso.rotationPointX;
          
    	  frontLeftArm1a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed+(float)Math.PI) * 0.2F  + this.frontLeftArm1a.rotationPointZ;
    	  frontLeftArm1b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed+(float)Math.PI) * 0.2F  + this.frontLeftArm1b.rotationPointZ;
    	  
    	  frontRightArm2a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.2F  + this.frontRightArm2a.rotationPointZ;
    	  frontRightArm2b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.2F  + this.frontRightArm2b.rotationPointZ;
    	  
    	  backLeftArm1a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed+(float)Math.PI) * 0.2F  + this.backLeftArm1a.rotationPointZ;
    	  backLeftArm1b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed+(float)Math.PI) * 0.2F  + this.backLeftArm1b.rotationPointZ;
    	  
    	  backRightArm2a.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.2F  + this.backRightArm2a.rotationPointZ;
    	  backRightArm2b.rotateAngleZ = MathHelper.cos((entity.ticksExisted + entity.getEntityId()) * bobSpeed) * 0.2F  + this.backRightArm2b.rotationPointZ;
          this.field_78163_i = 1;
      }

  }

}
