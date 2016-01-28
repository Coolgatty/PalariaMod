package com.coolgatty.palaria.mobs.render;

import com.coolgatty.palaria.mobs.EntityRaptorChicken;
import com.coolgatty.palaria.mobs.models.ModelRaptorChicken;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRaptorChicken extends RenderLiving
{
	public static final ResourceLocation raptorchicken = new ResourceLocation("palaria:textures/mobs/RaptorChicken.png");

    public RenderRaptorChicken()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelRaptorChicken(), 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityRaptorChicken)entity);
	}

    protected float handleRotationFloat(EntityRaptorChicken livingBase, float partialTicks)
    {
        float f = livingBase.field_70888_h + (livingBase.wingRotation - livingBase.field_70888_h) * partialTicks;
        float f1 = livingBase.field_70884_g + (livingBase.destPos - livingBase.field_70884_g) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
    
    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.handleRotationFloat((EntityRaptorChicken)p_77044_1_, p_77044_2_);
    }    
    
    public ResourceLocation bindTexture(EntityRaptorChicken entity)
	{
		return raptorchicken;
	}
}