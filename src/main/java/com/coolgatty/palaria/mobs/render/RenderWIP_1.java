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
import com.coolgatty.palaria.mobs.EntityWIP_1;
import com.coolgatty.palaria.mobs.models.ModelWIP_1;

public class RenderWIP_1 extends RenderLiving
{
	public static final ResourceLocation WIP_1 = new ResourceLocation("palaria:textures/mobs/WIP_1.png");

    public RenderWIP_1()
    {
    	super(Minecraft.getMinecraft().getRenderManager(), new ModelWIP_1(), 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	public ResourceLocation bindTexture(EntityWIP_1 entity)
	{
		return WIP_1;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return bindTexture((EntityWIP_1)entity);
	}
}
