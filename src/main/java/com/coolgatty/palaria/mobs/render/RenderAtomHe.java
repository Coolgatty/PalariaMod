package com.coolgatty.palaria.mobs.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.MultiModel;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.coolgatty.palaria.mobs.EntityAtomHe;
import com.coolgatty.palaria.mobs.models.ModelAtomHe;
import com.coolgatty.palaria.mobs.models.ModelCowasaurus;

import akka.routing.RandomPool;

public class RenderAtomHe extends RenderLiving
{
	public static final ResourceLocation atom_he = new ResourceLocation("palaria:textures/mobs/AtomHe.png");
    private static final String __OBFID = "CL_00000985";
    protected Random rand;

    public RenderAtomHe()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelAtomHe(), 0.0F);
    }
    

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	public ResourceLocation bindTexture(EntityAtomHe entity)
	{
		return atom_he;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityAtomHe)entity);
	}
}
