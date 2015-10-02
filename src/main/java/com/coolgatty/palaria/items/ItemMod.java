package com.coolgatty.palaria.items;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMod 
{	
	//Items
	public static Item sarliteingot;
	public static Item flamiteingot;
	
	//Tools	
	public static Item sarliteshovel;
	public static Item sarlitepick;
	public static Item sarliteaxe;
	public static Item sarlitehoe;
	
	public static Item flamiteshovel;
	public static Item flamitepick;
	public static Item flamiteaxe;
	public static Item flamitehoe;
	
	//Swords
	public static Item sarlitesword;
	public static Item flamitesword;
	
	//Armor
	public static Item sarlitehelmet;
	public static Item sarlitechestplate;
	public static Item sarliteleggings;
	public static Item sarliteboots;
	
	public static Item flamitehelmet;
	public static Item flamitechestplate;
	public static Item flamiteleggings;
	public static Item flamiteboots;
	
	//Materials
	static ToolMaterial SARLITE_TOOLS = EnumHelper.addToolMaterial("SARLITE_TOOLS", 4, 2432, 8.5F, 3.0F, 10);
	static ToolMaterial FLAMITE_TOOLS = EnumHelper.addToolMaterial("FLAMITE_TOOLS", 4, 2576, 9.0F, 3.0F, 10);
	
	static ToolMaterial SARLITE_SWORD = EnumHelper.addToolMaterial("SARLITE_SWORD", 4, 2432, 8.5F, 4.0F, 10);
	static ToolMaterial FLAMITE_SWORD = EnumHelper.addToolMaterial("FLAMITE_SWORD", 4, 2576, 9.0F, 5.0F, 10);
	
	static ArmorMaterial SARLITE_ARMOR = EnumHelper.addArmorMaterial("SARLITE_ARMOR", "palaria:sarlite", 52, new int[]{4, 9, 6, 3}, 10);
	static ArmorMaterial FLAMITE_ARMOR = EnumHelper.addArmorMaterial("FLAMITE_ARMOR", "palaria:flamite", 60, new int[]{4, 8, 7, 4}, 10);
	
	
	public static void init()
	{
		//Items	
		sarliteingot = new Item().setUnlocalizedName("sarliteingot").setCreativeTab(CreativeTabs.tabMaterials);
		flamiteingot = new Item().setUnlocalizedName("flamiteingot").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Tools
		sarliteshovel = new ItemSpade(SARLITE_TOOLS).setUnlocalizedName("sarliteshovel").setCreativeTab(CreativeTabs.tabTools);
		sarlitepick = new ItemModPickaxe(SARLITE_TOOLS).setUnlocalizedName("sarlitepick").setCreativeTab(CreativeTabs.tabTools);
		sarliteaxe = new ItemModAxe(SARLITE_TOOLS).setUnlocalizedName("sarliteaxe").setCreativeTab(CreativeTabs.tabTools);
		sarlitehoe = new ItemHoe(SARLITE_TOOLS).setUnlocalizedName("sarlitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		flamiteshovel = new ItemSpade(FLAMITE_TOOLS).setUnlocalizedName("flamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		flamitepick = new ItemModPickaxe(FLAMITE_TOOLS).setUnlocalizedName("flamitepick").setCreativeTab(CreativeTabs.tabTools);
		flamiteaxe = new ItemModAxe(FLAMITE_TOOLS).setUnlocalizedName("flamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		flamitehoe = new ItemHoe(FLAMITE_TOOLS).setUnlocalizedName("flamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		//Swords
		sarlitesword = new ItemSword(SARLITE_SWORD).setUnlocalizedName("sarlitesword").setCreativeTab(CreativeTabs.tabCombat);
		flamitesword = new ItemSword(FLAMITE_SWORD).setUnlocalizedName("flamitesword").setCreativeTab(CreativeTabs.tabCombat);
		
		//Armors
		sarlitehelmet = new ItemArmor(SARLITE_ARMOR, 1, 0).setUnlocalizedName("sarlitehelmet").setCreativeTab(CreativeTabs.tabCombat);
		sarlitechestplate = new ItemArmor(SARLITE_ARMOR, 1, 1).setUnlocalizedName("sarlitechestplate").setCreativeTab(CreativeTabs.tabCombat);
		sarliteleggings = new ItemArmor(SARLITE_ARMOR, 2, 2).setUnlocalizedName("sarliteleggings").setCreativeTab(CreativeTabs.tabCombat);
		sarliteboots = new ItemArmor(SARLITE_ARMOR, 1, 3).setUnlocalizedName("sarliteboots").setCreativeTab(CreativeTabs.tabCombat);
		
		flamitehelmet = new ItemArmor(FLAMITE_ARMOR, 1, 0).setUnlocalizedName("flamitehelmet").setCreativeTab(CreativeTabs.tabCombat);
		flamitechestplate = new ItemArmor(FLAMITE_ARMOR, 1, 1).setUnlocalizedName("flamitechestplate").setCreativeTab(CreativeTabs.tabCombat);
		flamiteleggings = new ItemArmor(FLAMITE_ARMOR, 2, 2).setUnlocalizedName("flamiteleggings").setCreativeTab(CreativeTabs.tabCombat);
		flamiteboots = new ItemArmor(FLAMITE_ARMOR, 1, 3).setUnlocalizedName("flamiteboots").setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static void register()
	{	

		//Items
		RegisterHelper.registerItem(sarliteingot);
		RegisterHelper.registerItem(flamiteingot);
		
		//Tools
		RegisterHelper.registerItem(sarliteshovel);
		RegisterHelper.registerItem(sarlitepick);
		RegisterHelper.registerItem(sarliteaxe);
		RegisterHelper.registerItem(sarlitehoe);
		
		RegisterHelper.registerItem(flamiteshovel);
		RegisterHelper.registerItem(flamitepick);
		RegisterHelper.registerItem(flamiteaxe);
		RegisterHelper.registerItem(flamitehoe);
		
		//Swords
		RegisterHelper.registerItem(sarlitesword);
		RegisterHelper.registerItem(flamitesword);
		
		//Armor
		RegisterHelper.registerItem(sarlitehelmet);
		RegisterHelper.registerItem(sarlitechestplate);
		RegisterHelper.registerItem(sarliteleggings);
		RegisterHelper.registerItem(sarliteboots);
		
		RegisterHelper.registerItem(flamitehelmet);
		RegisterHelper.registerItem(flamitechestplate);
		RegisterHelper.registerItem(flamiteleggings);
		RegisterHelper.registerItem(flamiteboots);
		
		
		//Recipes
		/*Sarlite*/
		GameRegistry.addRecipe(new ItemStack(sarlitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarliteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarliteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarlitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarlitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarliteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarlitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(sarlitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(sarlitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(sarliteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(sarliteboots), new Object []
		{
			"X X",
			"X X",
			'X', sarliteingot
		});
		
		/*Flamite*/
		
		GameRegistry.addRecipe(new ItemStack(flamitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamiteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamiteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamiteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(flamitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(flamitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(flamiteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(flamiteboots), new Object []
		{
			"X X",
			"X X",
			'X', flamiteingot
		});
		
		
		
		//Smelting
		GameRegistry.addSmelting(BlockMod.sarliteore, new ItemStack(sarliteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.flamiteore, new ItemStack(flamiteingot), 5.0F);
	}
	
	public static void registerRenders ()
	{
		//Items
		registerRender(sarliteingot);
		registerRender(flamiteingot);
		
		//Tools
		registerRender(sarliteshovel);
		registerRender(sarlitepick);
		registerRender(sarliteaxe);
		registerRender(sarlitehoe);
		
		registerRender(flamiteshovel);
		registerRender(flamitepick);
		registerRender(flamiteaxe);
		registerRender(flamitehoe);
		
		//Swords
		registerRender(sarlitesword);
		registerRender(flamitesword);
		
		//Armor
		registerRender(sarlitehelmet);
		registerRender(sarlitechestplate);
		registerRender(sarliteleggings);
		registerRender(sarliteboots);
		
		registerRender(flamitehelmet);
		registerRender(flamitechestplate);
		registerRender(flamiteleggings);
		registerRender(flamiteboots);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
