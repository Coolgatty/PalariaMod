package com.coolgatty.palaria;

import java.util.logging.Level;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.PalariaEventHandler;
import com.coolgatty.palaria.help.PalariaFuelHandler;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;
import com.coolgatty.palaria.help.VersionChecker;
import com.coolgatty.palaria.items.ItemMod;
import com.coolgatty.palaria.items.RecipesMod;
import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.MobRegistry;
import com.coolgatty.palaria.proxy.CommonProxy;
import com.coolgatty.palaria.world.BiomeRegistry;
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
import net.minecraftforge.fml.common.FMLCommonHandler;
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
	@Instance(Reference.MODID)
	public static Palaria instance;
	
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
	public static int magmaoverlordID;
	public static int slimeoverlordID;
	public static int agonizingentID;
	
	public static int skyforestID;
	public static int bloodforestID;
	
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;
	
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
			magmaoverlordID = config.get("Entity", "Magma Overlord", 909).getInt();
			slimeoverlordID = config.get("Entity", "Slime Overlord", 910).getInt();
			agonizingentID = config.get("Entity", "Agonizing Ent", 911).getInt();
			
			skyforestID = config.get("Biome", "Sky Forest", 137).getInt();
			bloodforestID = config.get("Biome", "Blood Forest", 138).getInt();
			config.save();
		} finally
		{
			if(config.hasChanged())
			{
				config.save();
			}
		}
		
		//World
        WorldGenOres.preInit();
        
        //Blocks
		BlockMod.preInit();		
		BlockMod.register();
        
		/**Biomes**/
        BiomeRegistry.preInit();
        
		//Items
		ItemMod.preInit();
		ItemMod.register();
		
		//Mobs
		MobRegistry.registerEntity();
		
		//Recipes
		RecipesMod.addRecipes();
		
		//Handlers
		GameRegistry.registerFuelHandler(new PalariaFuelHandler());
		
	}
	 
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
	    System.out.println("Registering event listeners");

	   /*inecraftForge.EVENT_BUS.register(new PalariaEventHandler());
	   /* MinecraftForge.TERRAIN_GEN_BUS.register(new PalariaTerrainGenEventHandler());
	    MinecraftForge.ORE_GEN_BUS.register(new PalariaOreGenEventHandler());*/
	    // some events, especially tick, are handled on FML bus
	    FMLCommonHandler.instance().bus().register(new PalariaEventHandler());
	    proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.versionChecker();
	}
}
