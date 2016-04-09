package com.coolgatty.palaria.mobs.render;

import com.coolgatty.palaria.mobs.EntityCowasaurus;
import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.EntityEndEndermite;
import com.coolgatty.palaria.mobs.EntityEnderRaptorChicken;
import com.coolgatty.palaria.mobs.EntityEnderWalker;
import com.coolgatty.palaria.mobs.EntityMagmaRaptorChicken;
import com.coolgatty.palaria.mobs.EntityRaptorChicken;
import com.coolgatty.palaria.mobs.EntityStoneEndermite;
import com.coolgatty.palaria.mobs.EntityWIP_1;

import net.minecraft.client.renderer.entity.Render;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistry 
{
	public static void registerRenders() 
	{
		registerRender(EntityCreeptile.class, new RenderCreeptile());
		registerRender(EntityCowasaurus.class, new RenderCowasaurus());
		registerRender(EntityRaptorChicken.class, new RenderRaptorChicken());
		registerRender(EntityMagmaRaptorChicken.class, new RenderMagmaRaptorChicken());
		registerRender(EntityEnderRaptorChicken.class, new RenderEnderRaptorChicken());
		registerRender(EntityStoneEndermite.class, new RenderStoneEndermite());
		registerRender(EntityEndEndermite.class, new RenderEndEndermite());
		registerRender(EntityEnderWalker.class, new RenderEnderWalker());
		registerRender(EntityWIP_1.class, new RenderWIP_1());
	}

	private static void registerRender(Class entityClass, Render renderClass) 
	{
		RenderingRegistry.registerEntityRenderingHandler(entityClass, renderClass);
	}
}
