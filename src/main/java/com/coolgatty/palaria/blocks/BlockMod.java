package com.coolgatty.palaria.blocks;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.blocks.metahelp.ItemBlockMeta;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
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
	public static Block neliumore;
	
	//Logs and wood
	public static Block modlog;
	public static Block modplank;
	
	//Material Blocks
	public static Block sarliteblock;
	public static Block flamiteblock;
	public static Block clariteblock;
	public static Block illiwonblock;
	public static Block afnamiteblock;
	public static Block endermiteblock;
	public static Block neliumblock;
	public static Block narriteblock;
	
	
	public static void preInit()
	{
		//Ores
		sarliteore = new BlockSarliteOre();
		flamiteore = new BlockFlamiteOre();
		clariteore = new BlockClariteOre();
		illiwonore = new BlockIlliwonOre();
		afnamiteore = new BlockAfnamiteOre();
		endermiteore = new BlockEndermiteOre();
		endendermiteore = new BlockEndEndermiteOre();
		neliumore = new BlockNeliumOre();
		
		//Logs and wood
		modlog = new BlockModLog().setUnlocalizedName("modlog");
		modplank = new BlockModPlanks().setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setUnlocalizedName("modplank");
		
		//Material Blocks
		sarliteblock = new BlockModCompressed(MapColor.blueColor).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("sarliteblock");
		flamiteblock = new BlockModCompressed(MapColor.redColor).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("flamiteblock");
		clariteblock = new BlockModCompressed(MapColor.diamondColor).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("clariteblock");
		illiwonblock = new BlockModCompressed(MapColor.emeraldColor).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("illiwonblock");
		afnamiteblock = new BlockModCompressed(MapColor.brownColor).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("afnamiteblock");
		endermiteblock = new BlockModCompressed(MapColor.purpleColor).setHardness(8.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("endermiteblock");
		neliumblock = new BlockModCompressed(MapColor.pinkColor).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("neliumblock");
		narriteblock = new BlockModCompressed(MapColor.magentaColor).setHardness(6.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("narriteblock");
	}
	
	public static void registerMetaBlocks() 
	{
		RegisterHelper.registerMetaBlocks(modlog, "palaria:redwood_modlog");
		RegisterHelper.registerMetaBlocks(modplank, "palaria:redwood_modplank");
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
		RegisterHelper.registerBlock(neliumore);
		
		//Logs and wood
		RegisterHelper.registerBlock(modlog, ItemBlockMeta.class);
		RegisterHelper.registerBlock(modplank, ItemBlockMeta.class);
		
		//Material Blocks
		RegisterHelper.registerBlock(sarliteblock);
		RegisterHelper.registerBlock(flamiteblock);
		RegisterHelper.registerBlock(clariteblock);
		RegisterHelper.registerBlock(illiwonblock);
		RegisterHelper.registerBlock(afnamiteblock);
		RegisterHelper.registerBlock(endermiteblock);
		RegisterHelper.registerBlock(neliumblock);
		RegisterHelper.registerBlock(narriteblock);
	}
	
	public static void registerRenders()
	{
		//Ores
		RegisterHelper.registerRender(sarliteore);
		RegisterHelper.registerRender(flamiteore);
		RegisterHelper.registerRender(clariteore);
		RegisterHelper.registerRender(illiwonore);
		RegisterHelper.registerRender(afnamiteore);
		RegisterHelper.registerRender(endermiteore);
		RegisterHelper.registerRender(endendermiteore);
		RegisterHelper.registerRender(neliumore);
		
		//Logs and wood
		RegisterHelper.registerRender(modlog, 0, "redwood_modlog");
		RegisterHelper.registerRender(modplank, 0, "redwood_modplank");
		
		//Material Blocks
		RegisterHelper.registerRender(sarliteblock);
		RegisterHelper.registerRender(flamiteblock);
		RegisterHelper.registerRender(clariteblock);
		RegisterHelper.registerRender(illiwonblock);
		RegisterHelper.registerRender(afnamiteblock);
		RegisterHelper.registerRender(endermiteblock);
		RegisterHelper.registerRender(neliumblock);
		RegisterHelper.registerRender(narriteblock);
	}
}
