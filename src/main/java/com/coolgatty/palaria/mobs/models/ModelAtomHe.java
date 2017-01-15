package com.coolgatty.palaria.mobs.models;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelAtomHe extends ModelBase 
{
    public ModelRenderer proton1;
    public ModelRenderer proton2;
    public ModelRenderer neutron1;
    public ModelRenderer neutron2;
    public ModelRenderer electron1;
    public ModelRenderer electron2;

    public ModelAtomHe() 
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.neutron2 = new ModelRenderer(this, 36, 0);
        this.neutron2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neutron2.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 3, 0.0F);
        this.electron2 = new ModelRenderer(this, 21, 0);
        this.electron2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.electron2.addBox(-16.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.proton2 = new ModelRenderer(this, 12, 0);
        this.proton2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proton2.addBox(-3.0F, -1.0F, -1.0F, 3, 3, 3, 0.0F);
        this.proton1 = new ModelRenderer(this, 0, 0);
        this.proton1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proton1.addBox(0.0F, -1.0F, -1.0F, 3, 3, 3, 0.0F);
        this.electron1 = new ModelRenderer(this, 9, 0);
        this.electron1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.electron1.addBox(16.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.neutron1 = new ModelRenderer(this, 24, 0);
        this.neutron1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neutron1.addBox(-1.5F, -3.0F, -1.0F, 3, 3, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.neutron2.render(f5);
        this.proton2.render(f5);
        this.neutron1.render(f5);
        this.electron2.render(f5);
        this.proton1.render(f5);
        this.electron1.render(f5);
    }


    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
    {
        Entity entity = entitylivingbaseIn; 
        electron1.rotateAngleY = (entity.ticksExisted + entity.getEntityId())*0.6662F;
        electron2.rotateAngleZ = -(entity.ticksExisted + entity.getEntityId())*0.6662F;
        

        proton1.rotateAngleY = -(entity.ticksExisted + entity.getEntityId())*0.6662F;
        proton1.rotateAngleZ = -(entity.ticksExisted + entity.getEntityId())*0.6662F;
        

        proton2.rotateAngleY = (entity.ticksExisted + entity.getEntityId())*0.6662F;
        proton2.rotateAngleZ = (entity.ticksExisted + entity.getEntityId())*0.6662F;
        
        neutron1.rotateAngleX = -(entity.ticksExisted + entity.getEntityId())*0.6662F;

        neutron1.rotateAngleZ = -(entity.ticksExisted + entity.getEntityId())*0.6662F;
        
        neutron2.rotateAngleX = -(entity.ticksExisted + entity.getEntityId())*0.6662F;

        neutron2.rotateAngleZ = (entity.ticksExisted + entity.getEntityId())*0.6662F;



    }
}
