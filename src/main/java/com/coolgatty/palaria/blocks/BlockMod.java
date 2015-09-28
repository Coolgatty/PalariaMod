package com.coolgatty.palaria.blocks;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMod 
{
	//Ores
	public static Block sarliteore;
	public static Block flamiteore;
	
	
	public static void init()
	{
		//Ores
		sarliteore = new BlockSarliteOre();
		flamiteore = new BlockFlamiteOre();
	}
	
	public static void register()
	{
		//Ores
		RegisterHelper.regsiterBlock(sarliteore);
		RegisterHelper.regsiterBlock(flamiteore);
	}
	
	public static void registerRenders ()
	{
		registerRender(sarliteore);
		registerRender(flamiteore);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
