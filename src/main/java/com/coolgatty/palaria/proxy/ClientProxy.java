package com.coolgatty.palaria.proxy;

import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.items.ItemMod;
import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.MobMod;
import com.coolgatty.palaria.mobs.render.RenderCreeptile;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		ItemMod.registerRenders();
		BlockMod.registerRenders();
		MobMod.registerRenders();
	}
	
	@Override
    public void preInit(FMLPreInitializationEvent event) 
    {

    }

	@Override
    public void init(FMLInitializationEvent event) 
    {

    }

	@Override
    public void postInit(FMLPostInitializationEvent event) 
    {

    }
}
