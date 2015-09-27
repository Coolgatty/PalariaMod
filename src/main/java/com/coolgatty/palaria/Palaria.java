package com.coolgatty.palaria;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;
import com.coolgatty.palaria.items.ItemFlamiteIngot;
import com.coolgatty.palaria.items.ItemSarliteIngot;
import com.coolgatty.palaria.items.ItemSarlitePick;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Palaria 
{
	//Blocks
	public static Block sarliteore;
	public static Block flamiteore;
	
	//Items
	public static Item sarliteingot;
	public static Item flamiteingot;
	
	//Tools
	public static Item sarlitepick;
	
	//Materials
	static ToolMaterial sarlite = EnumHelper.addToolMaterial("sarlite", 4, 2432, 8.0F, 3.0F, 10);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		sarliteore = new BlockSarliteOre();
		flamiteore = new BlockFlamiteOre();
		
		RegisterHelper.regsiterBlock(sarliteore);
		RegisterHelper.regsiterBlock(flamiteore);
		
		//Items	
		sarliteingot = new ItemSarliteIngot();
		flamiteingot = new ItemFlamiteIngot();
		
		RegisterHelper.registerItem(sarliteingot);
		RegisterHelper.registerItem(flamiteingot);
		
		//Tools
		sarlitepick = new ItemSarlitePick(sarlite);
		
		RegisterHelper.registerItem(sarlitepick);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
