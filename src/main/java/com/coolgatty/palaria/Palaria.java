package com.coolgatty.palaria;

import java.util.logging.Level;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;
import com.coolgatty.palaria.items.ItemMod;
import com.coolgatty.palaria.items.RecipesMod;
import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.MobRegistry;
import com.coolgatty.palaria.proxy.CommonProxy;
import com.coolgatty.palaria.world.WorldGenOres;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Palaria 
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static int creeptileID;
	public static int cowasaurusID;
	public static int raptorchickenID;
	public static int magmaraptorchickenID;
	public static int enderraptorchickenID;
	public static int stoneendermiteID;
	public static int endendermiteID;
	public static int enderwalkerID;
	public static int nimatinID;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		try 
		{
			config.load();
			creeptileID = config.get("Entity", "Creeptile", 901).getInt();
			cowasaurusID = config.get("Entity", "Cowasaurus", 902).getInt();
			raptorchickenID = config.get("Entity", "Raptor Chicken", 903).getInt();
			magmaraptorchickenID = config.get("Entity", "Magma Raptor Chicken", 904).getInt();
			enderraptorchickenID = config.get("Entity", "Ender Raptor Chicken", 905).getInt();
			stoneendermiteID = config.get("Entity", "Stone Endermite", 906).getInt();
			endendermiteID = config.get("Entity", "End Endermite", 907).getInt();
			enderwalkerID = config.get("Entity", "Ender Walker", 908).getInt();
			nimatinID = config.get("Entity", "Nimatin", 909).getInt();
			config.save();
		} finally
		{
			if(config.hasChanged())
			{
				config.save();
			}
		}
		
		//World
        WorldGenOres.init();
        
        //Blocks
		BlockMod.init();		
		BlockMod.register();
		
		//Items
		ItemMod.init();
		ItemMod.register();
		
		//Mobs
		MobRegistry.registerEntity();
		
		//Recipes
		RecipesMod.addRecipes();
		
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
