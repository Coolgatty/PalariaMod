package com.coolgatty.palaria.mobs.render;

import com.coolgatty.palaria.mobs.EntityEnderWalker;
import com.coolgatty.palaria.mobs.models.ModelEnderWalker;
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
public class RenderEnderWalker extends RenderLiving
{
	public static final ResourceLocation enderwalker = new ResourceLocation("palaria:textures/mobs/EnderWalker.png");

    public RenderEnderWalker()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelEnderWalker(), 0.0F);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityEnderWalker)entity);
	}
    
    public ResourceLocation bindTexture(EntityEnderWalker entity)
	{
		return enderwalker;
	}
}