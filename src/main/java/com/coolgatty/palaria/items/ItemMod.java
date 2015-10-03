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
	public static Item claritegem;
	
	//Tools	
	public static Item sarliteshovel;
	public static Item sarlitepick;
	public static Item sarliteaxe;
	public static Item sarlitehoe;
	
	public static Item flamiteshovel;
	public static Item flamitepick;
	public static Item flamiteaxe;
	public static Item flamitehoe;
	
	public static Item clariteshovel;
	public static Item claritepick;
	public static Item clariteaxe;
	public static Item claritehoe;
	
	//Swords
	public static Item sarlitesword;
	public static Item flamitesword;
	public static Item claritesword;
	
	//Armor
	public static Item sarlitehelmet;
	public static Item sarlitechestplate;
	public static Item sarliteleggings;
	public static Item sarliteboots;
	
	public static Item flamitehelmet;
	public static Item flamitechestplate;
	public static Item flamiteleggings;
	public static Item flamiteboots;
	
	public static Item claritehelmet;
	public static Item claritechestplate;
	public static Item clariteleggings;
	public static Item clariteboots;
	
	//Materials
	static ToolMaterial SARLITE_TOOLS = EnumHelper.addToolMaterial("SARLITE", 4, 2432, 12.0F, 3.0F, 10);
	static ToolMaterial FLAMITE_TOOLS = EnumHelper.addToolMaterial("FLAMITE", 4, 2576, 13.0F, 3.0F, 10);
	static ToolMaterial CLARITE_TOOLS = EnumHelper.addToolMaterial("CLARITE", 3, 781, 10.0F, 3.0F, 16);
	
	static ToolMaterial SARLITE_SWORD = EnumHelper.addToolMaterial("SARLITE", 4, 2432, 12.0F, 4.0F, 10);
	static ToolMaterial FLAMITE_SWORD = EnumHelper.addToolMaterial("FLAMITE", 4, 2576, 13.0F, 5.0F, 10);
	static ToolMaterial CLARITE_SWORD = EnumHelper.addToolMaterial("CLARITE", 3, 781, 10.0F, 3.0F, 16);
	
	static ArmorMaterial SARLITE_ARMOR = EnumHelper.addArmorMaterial("SARLITE", "palaria:sarlite", 52, new int[]{4, 9, 6, 3}, 10);
	static ArmorMaterial FLAMITE_ARMOR = EnumHelper.addArmorMaterial("FLAMITE", "palaria:flamite", 60, new int[]{4, 8, 7, 4}, 10);
	static ArmorMaterial CLARITE_ARMOR = EnumHelper.addArmorMaterial("CLARITE", "palaria:clarite", 23, new int[]{3, 7, 6, 3}, 16);
	
	
	public static void init()
	{
		//Items	
		sarliteingot = new Item().setUnlocalizedName("sarliteingot").setCreativeTab(CreativeTabs.tabMaterials);
		flamiteingot = new Item().setUnlocalizedName("flamiteingot").setCreativeTab(CreativeTabs.tabMaterials);
		claritegem = new Item().setUnlocalizedName("claritegem").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Tools
		sarliteshovel = new ItemSpade(SARLITE_TOOLS).setUnlocalizedName("sarliteshovel").setCreativeTab(CreativeTabs.tabTools);
		sarlitepick = new ItemModPickaxe(SARLITE_TOOLS).setUnlocalizedName("sarlitepick").setCreativeTab(CreativeTabs.tabTools);
		sarliteaxe = new ItemModAxe(SARLITE_TOOLS).setUnlocalizedName("sarliteaxe").setCreativeTab(CreativeTabs.tabTools);
		sarlitehoe = new ItemHoe(SARLITE_TOOLS).setUnlocalizedName("sarlitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		flamiteshovel = new ItemSpade(FLAMITE_TOOLS).setUnlocalizedName("flamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		flamitepick = new ItemModPickaxe(FLAMITE_TOOLS).setUnlocalizedName("flamitepick").setCreativeTab(CreativeTabs.tabTools);
		flamiteaxe = new ItemModAxe(FLAMITE_TOOLS).setUnlocalizedName("flamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		flamitehoe = new ItemHoe(FLAMITE_TOOLS).setUnlocalizedName("flamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		clariteshovel = new ItemSpade(CLARITE_TOOLS).setUnlocalizedName("clariteshovel").setCreativeTab(CreativeTabs.tabTools);
		claritepick = new ItemModPickaxe(CLARITE_TOOLS).setUnlocalizedName("claritepick").setCreativeTab(CreativeTabs.tabTools);
		clariteaxe = new ItemModAxe(CLARITE_TOOLS).setUnlocalizedName("clariteaxe").setCreativeTab(CreativeTabs.tabTools);
		claritehoe = new ItemHoe(CLARITE_TOOLS).setUnlocalizedName("claritehoe").setCreativeTab(CreativeTabs.tabTools);
		
		//Swords
		sarlitesword = new ItemSword(SARLITE_SWORD).setUnlocalizedName("sarlitesword").setCreativeTab(CreativeTabs.tabCombat);
		flamitesword = new ItemSword(FLAMITE_SWORD).setUnlocalizedName("flamitesword").setCreativeTab(CreativeTabs.tabCombat);
		claritesword = new ItemSword(CLARITE_SWORD).setUnlocalizedName("claritesword").setCreativeTab(CreativeTabs.tabCombat);
		
		//Armors
		sarlitehelmet = new ItemArmor(SARLITE_ARMOR, 1, 0).setUnlocalizedName("sarlitehelmet").setCreativeTab(CreativeTabs.tabCombat);
		sarlitechestplate = new ItemArmor(SARLITE_ARMOR, 1, 1).setUnlocalizedName("sarlitechestplate").setCreativeTab(CreativeTabs.tabCombat);
		sarliteleggings = new ItemArmor(SARLITE_ARMOR, 2, 2).setUnlocalizedName("sarliteleggings").setCreativeTab(CreativeTabs.tabCombat);
		sarliteboots = new ItemArmor(SARLITE_ARMOR, 1, 3).setUnlocalizedName("sarliteboots").setCreativeTab(CreativeTabs.tabCombat);
		
		flamitehelmet = new ItemArmor(FLAMITE_ARMOR, 1, 0).setUnlocalizedName("flamitehelmet").setCreativeTab(CreativeTabs.tabCombat);
		flamitechestplate = new ItemArmor(FLAMITE_ARMOR, 1, 1).setUnlocalizedName("flamitechestplate").setCreativeTab(CreativeTabs.tabCombat);
		flamiteleggings = new ItemArmor(FLAMITE_ARMOR, 2, 2).setUnlocalizedName("flamiteleggings").setCreativeTab(CreativeTabs.tabCombat);
		flamiteboots = new ItemArmor(FLAMITE_ARMOR, 1, 3).setUnlocalizedName("flamiteboots").setCreativeTab(CreativeTabs.tabCombat);
		
		claritehelmet = new ItemArmor(CLARITE_ARMOR, 1, 0).setUnlocalizedName("claritehelmet").setCreativeTab(CreativeTabs.tabCombat);
		claritechestplate = new ItemArmor(CLARITE_ARMOR, 1, 1).setUnlocalizedName("claritechestplate").setCreativeTab(CreativeTabs.tabCombat);
		clariteleggings = new ItemArmor(CLARITE_ARMOR, 2, 2).setUnlocalizedName("clariteleggings").setCreativeTab(CreativeTabs.tabCombat);
		clariteboots = new ItemArmor(CLARITE_ARMOR, 1, 3).setUnlocalizedName("clariteboots").setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static void register()
	{	

		//Items
		RegisterHelper.registerItem(sarliteingot);
		RegisterHelper.registerItem(flamiteingot);
		RegisterHelper.registerItem(claritegem);
		
		//Tools
		RegisterHelper.registerItem(sarliteshovel);
		RegisterHelper.registerItem(sarlitepick);
		RegisterHelper.registerItem(sarliteaxe);
		RegisterHelper.registerItem(sarlitehoe);
		
		RegisterHelper.registerItem(flamiteshovel);
		RegisterHelper.registerItem(flamitepick);
		RegisterHelper.registerItem(flamiteaxe);
		RegisterHelper.registerItem(flamitehoe);
		
		RegisterHelper.registerItem(clariteshovel);
		RegisterHelper.registerItem(claritepick);
		RegisterHelper.registerItem(clariteaxe);
		RegisterHelper.registerItem(claritehoe);
		
		//Swords
		RegisterHelper.registerItem(sarlitesword);
		RegisterHelper.registerItem(flamitesword);
		RegisterHelper.registerItem(claritesword);
		
		//Armor
		RegisterHelper.registerItem(sarlitehelmet);
		RegisterHelper.registerItem(sarlitechestplate);
		RegisterHelper.registerItem(sarliteleggings);
		RegisterHelper.registerItem(sarliteboots);
		
		RegisterHelper.registerItem(flamitehelmet);
		RegisterHelper.registerItem(flamitechestplate);
		RegisterHelper.registerItem(flamiteleggings);
		RegisterHelper.registerItem(flamiteboots);
		
		RegisterHelper.registerItem(claritehelmet);
		RegisterHelper.registerItem(claritechestplate);
		RegisterHelper.registerItem(clariteleggings);
		RegisterHelper.registerItem(clariteboots);
		
		
		//Recipes
		/**************************************************************/
		/*Sarlite*/
		/**************************************************************/
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
		/**************************************************************/
		/*Flamite*/
		/**************************************************************/
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
		/**************************************************************/
		/*Clarite*/
		/**************************************************************/
		GameRegistry.addRecipe(new ItemStack(claritepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(clariteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(clariteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(claritehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(claritehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(clariteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(claritesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', claritegem, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(claritehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', claritegem
		});
		GameRegistry.addRecipe(new ItemStack(claritechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', claritegem
		});
		GameRegistry.addRecipe(new ItemStack(clariteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', claritegem
		});
		GameRegistry.addRecipe(new ItemStack(clariteboots), new Object []
		{
			"X X",
			"X X",
			'X', claritegem
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
		registerRender(claritegem);
		
		//Tools
		registerRender(sarliteshovel);
		registerRender(sarlitepick);
		registerRender(sarliteaxe);
		registerRender(sarlitehoe);
		
		registerRender(flamiteshovel);
		registerRender(flamitepick);
		registerRender(flamiteaxe);
		registerRender(flamitehoe);
		
		registerRender(clariteshovel);
		registerRender(claritepick);
		registerRender(clariteaxe);
		registerRender(claritehoe);
		
		//Swords
		registerRender(sarlitesword);
		registerRender(flamitesword);
		registerRender(claritesword);
		
		//Armor
		registerRender(sarlitehelmet);
		registerRender(sarlitechestplate);
		registerRender(sarliteleggings);
		registerRender(sarliteboots);
		
		registerRender(flamitehelmet);
		registerRender(flamitechestplate);
		registerRender(flamiteleggings);
		registerRender(flamiteboots);
		
		registerRender(claritehelmet);
		registerRender(claritechestplate);
		registerRender(clariteleggings);
		registerRender(clariteboots);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
