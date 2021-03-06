package com.coolgatty.palaria.proxy;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.help.VersionChecker;
import com.coolgatty.palaria.items.ItemMod;
import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.render.RenderCreeptile;
import com.coolgatty.palaria.mobs.render.RenderRegistry;

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
		RenderRegistry.registerRenders();
		BlockMod.registerMetaBlocks();
	}
	
	@Override
	public void versionChecker()
	{
		Palaria.versionChecker = new VersionChecker();
		Thread versionCheckThread = new Thread(Palaria.versionChecker, "Version Check");
		versionCheckThread.start();
	}
}
