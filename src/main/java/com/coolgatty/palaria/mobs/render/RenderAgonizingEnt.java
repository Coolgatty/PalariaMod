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

import com.coolgatty.palaria.mobs.EntityAgonizingEnt;
import com.coolgatty.palaria.mobs.models.ModelAgonizingEnt;



public class RenderAgonizingEnt extends RenderLiving
{
	public static final ResourceLocation agonizing_ent = new ResourceLocation("palaria:textures/mobs/AgonizingEnt.png");
    private static final String __OBFID = "CL_00000985";

    public RenderAgonizingEnt()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelAgonizingEnt(), 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	public ResourceLocation bindTexture(EntityAgonizingEnt entity)
	{
		return agonizing_ent;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityAgonizingEnt)entity);
	}
}
