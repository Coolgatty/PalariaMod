package com.palaria.palariamod;

import com.palaria.palariamod.init.Items;
import com.palaria.palariamod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class PalariaMod 
{
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
			Items.init();
			Items.register();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
		
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
