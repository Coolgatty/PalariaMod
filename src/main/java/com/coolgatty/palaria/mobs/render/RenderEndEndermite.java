package com.coolgatty.palaria.mobs.render;

import com.coolgatty.palaria.mobs.EntityEndEndermite;
import com.coolgatty.palaria.mobs.models.ModelBlockMob;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderEndEndermite extends RenderLiving
{
	public static final ResourceLocation endendermite = new ResourceLocation("palaria:textures/mobs/EndEndermite.png");

    public RenderEndEndermite()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelBlockMob(), 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call R.bindEntityTexture.
     */
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityEndEndermite)entity);
	}
    
    public ResourceLocation bindTexture(EntityEndEndermite entity)
	{
		return endendermite;
	}
}