package com.coolgatty.palaria.mobs.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.client.renderer.entity.layers.LayerSlimeGel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

import org.lwjgl.opengl.GL11;
import com.coolgatty.palaria.mobs.EntityMagmaOverlord;
import com.coolgatty.palaria.mobs.models.ModelOverlord;

public class RenderMagmaOverlord extends RenderLiving
{
	public static final ResourceLocation MagmaOverlord = new ResourceLocation("palaria:textures/mobs/MagmaOverlord.png");
    
    public RenderMagmaOverlord()
    {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelOverlord(), 0.0F);
    }
    
     
	public ResourceLocation bindTexture(EntityMagmaOverlord entity)
	{
		return MagmaOverlord;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityMagmaOverlord)entity);
	}
}
