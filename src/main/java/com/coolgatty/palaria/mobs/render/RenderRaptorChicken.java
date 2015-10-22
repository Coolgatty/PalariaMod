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

    protected float func_180569_a(EntityRaptorChicken p_180569_1_, float p_180569_2_)
    {
        float f1 = p_180569_1_.field_70888_h + (p_180569_1_.field_70886_e - p_180569_1_.field_70888_h) * p_180569_2_;
        float f2 = p_180569_1_.field_70884_g + (p_180569_1_.destPos - p_180569_1_.field_70884_g) * p_180569_2_;
        return (MathHelper.sin(f1) + 1.0F) * f2;
    }
    
    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.func_180569_a((EntityRaptorChicken)p_77044_1_, p_77044_2_);
    }    
    
    public ResourceLocation bindTexture(EntityRaptorChicken entity)
	{
		return raptorchicken;
	}
}