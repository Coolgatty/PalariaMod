package com.coolgatty.palaria.mobs.render;

import com.coolgatty.palaria.mobs.EntityNimatin;
import com.coolgatty.palaria.mobs.models.ModelCowasaurus;
import com.coolgatty.palaria.mobs.models.ModelNimatin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNimatin extends RenderLiving
{
    private static final ResourceLocation nimatinTextures = new ResourceLocation("palaria:textures/mobs/Nimatin.png");
    private static final ResourceLocation tamedNimatinTextures = new ResourceLocation("palaria:textures/mobs/Nimatin_tame.png");
    private static final ResourceLocation anrgyNimatinTextures = new ResourceLocation("palaria:textures/mobs/Nimatin_angry.png");
    private static final String __OBFID = "CL_00001036";

    public RenderNimatin()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelNimatin(), 0.0F);
        this.addLayer(new LayerNimatinCollar(this));
    }

    protected float func_180593_a(EntityNimatin p_180593_1_, float p_180593_2_)
    {
        return p_180593_1_.getTailRotation();
    }

    public void func_177135_a(EntityNimatin p_177135_1_, double p_177135_2_, double p_177135_4_, double p_177135_6_, float p_177135_8_, float p_177135_9_)
    {
        if (p_177135_1_.isNimatinWet())
        {
            float f2 = p_177135_1_.getBrightness(p_177135_9_) * p_177135_1_.getShadingWhileWet(p_177135_9_);
            GlStateManager.color(f2, f2, f2);
        }

        super.doRender((EntityLiving)p_177135_1_, p_177135_2_, p_177135_4_, p_177135_6_, p_177135_8_, p_177135_9_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityNimatin entity)
    {
        return entity.isTamed() ? tamedNimatinTextures : (entity.isAngry() ? anrgyNimatinTextures : nimatinTextures);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(EntityLiving entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.func_177135_a((EntityNimatin)entity, x, y, z, p_76986_8_, partialTicks);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.func_180593_a((EntityNimatin)p_77044_1_, p_77044_2_);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(EntityLivingBase entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.func_177135_a((EntityNimatin)entity, x, y, z, p_76986_8_, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((EntityNimatin)entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.func_177135_a((EntityNimatin)entity, x, y, z, p_76986_8_, partialTicks);
    }
}