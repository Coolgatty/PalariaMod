package com.coolgatty.palaria.mobs.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.models.ModelCreeptile;

public class RenderCreeptile extends RenderLiving
{
	public static final ResourceLocation creeptile = new ResourceLocation("palaria:textures/mobs/Creeptile.png");
    private static final String __OBFID = "CL_00000985";

    public RenderCreeptile()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelCreeptile(), 0.0F);
        this.addLayer(new LayerCreeptileCharge(this));
    }


    protected void func_180570_a(EntityCreeptile p_180570_1_, float p_180570_2_)
    {
        float f1 = p_180570_1_.getCreeptileFlashIntensity(p_180570_2_);
        float f2 = 1.0F + MathHelper.sin(f1 * 100.0F) * f1 * 0.01F;
        f1 = MathHelper.clamp_float(f1, 0.0F, 1.0F);
        f1 *= f1;
        f1 *= f1;
        float f3 = (1.0F + f1 * 0.4F) * f2;
        float f4 = (1.0F + f1 * 0.1F) / f2;
        GlStateManager.scale(f3, f4, f3);
    }

    protected int func_180571_a(EntityCreeptile p_180571_1_, float p_180571_2_, float p_180571_3_)
    {
        float f2 = p_180571_1_.getCreeptileFlashIntensity(p_180571_3_);

        if ((int)(f2 * 10.0F) % 2 == 0)
        {
            return 0;
        }
        else
        {
            int i = (int)(f2 * 0.2F * 255.0F);
            i = MathHelper.clamp_int(i, 0, 255);
            return i << 24 | 16777215;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	public ResourceLocation bindTexture(EntityCreeptile entity)
	{
		return creeptile;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityCreeptile)entity);
	}

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
        this.func_180570_a((EntityCreeptile)p_77041_1_, p_77041_2_);
    }

    /**
     * Returns an ARGB int color back. Args: entityLiving, lightBrightness, partialTickTime
     */
    protected int getColorMultiplier(EntityLivingBase p_77030_1_, float p_77030_2_, float p_77030_3_)
    {
        return this.func_180571_a((EntityCreeptile)p_77030_1_, p_77030_2_, p_77030_3_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */

}
