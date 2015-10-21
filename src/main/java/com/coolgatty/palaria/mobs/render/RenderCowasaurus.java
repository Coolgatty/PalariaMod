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

import com.coolgatty.palaria.mobs.EntityCowasaurus;
import com.coolgatty.palaria.mobs.models.ModelCowasaurus;

public class RenderCowasaurus extends RenderLiving
{
	public static final ResourceLocation cowasaurus = new ResourceLocation("palaria:textures/mobs/Cowasaurus.png");
    private static final String __OBFID = "CL_00000985";

    public RenderCowasaurus()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelCowasaurus(), 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	public ResourceLocation bindTexture(EntityCowasaurus entity)
	{
		return cowasaurus;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityCowasaurus)entity);
	}
}
