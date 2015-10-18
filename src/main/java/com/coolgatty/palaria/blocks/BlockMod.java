package com.coolgatty.palaria.blocks;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMod 
{
	//Ores
	public static Block sarliteore;
	public static Block flamiteore;
	public static Block clariteore;
	public static Block illiwonore;
	public static Block afnamiteore;
	public static Block endermiteore;
	public static Block endendermiteore;
	
	public static void init()
	{
		//Ores
		sarliteore = new BlockSarliteOre();
		flamiteore = new BlockFlamiteOre();
		clariteore = new BlockClariteOre();
		illiwonore = new BlockIlliwonOre();
		afnamiteore = new BlockAfnamiteOre();
		endermiteore = new BlockEndermiteOre();
		endendermiteore = new BlockEndEndermiteOre();
	}
	
	public static void register()
	{
		//Ores
		RegisterHelper.registerBlock(sarliteore);
		RegisterHelper.registerBlock(flamiteore);
		RegisterHelper.registerBlock(clariteore);
		RegisterHelper.registerBlock(illiwonore);
		RegisterHelper.registerBlock(afnamiteore);
		RegisterHelper.registerBlock(endermiteore);
		RegisterHelper.registerBlock(endendermiteore);
	}
	
	public static void registerRenders ()
	{
		registerRender(sarliteore);
		registerRender(flamiteore);
		registerRender(clariteore);
		registerRender(illiwonore);
		registerRender(afnamiteore);
		registerRender(endermiteore);
		registerRender(endendermiteore);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
