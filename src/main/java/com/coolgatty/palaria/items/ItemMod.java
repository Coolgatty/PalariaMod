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
	public static Item illiwongem;
	public static Item afnamitegem;
	
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
	
	public static Item illiwonshovel;
	public static Item illiwonpick;
	public static Item illiwonaxe;
	public static Item illiwonhoe;
	
	public static Item afnamiteshovel;
	public static Item afnamitepick;
	public static Item afnamiteaxe;
	public static Item afnamitehoe;
	
	//Swords
	public static Item sarlitesword;
	public static Item flamitesword;
	public static Item claritesword;
	public static Item illiwonsword;
	public static Item afnamitesword;
	
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
	
	public static Item illiwonhelmet;
	public static Item illiwonchestplate;
	public static Item illiwonleggings;
	public static Item illiwonboots;
	
	public static Item afnamitehelmet;
	public static Item afnamitechestplate;
	public static Item afnamiteleggings;
	public static Item afnamiteboots;
	
	//Materials

	static ToolMaterial SARLITE = EnumHelper.addToolMaterial("SARLITE", 4, 2432, 12.0F, 4.0F, 10);
	static ToolMaterial FLAMITE = EnumHelper.addToolMaterial("FLAMITE", 4, 2576, 13.0F, 5.0F, 10);
	static ToolMaterial CLARITE = EnumHelper.addToolMaterial("CLARITE", 2, 781, 10.0F, 3.0F, 16);
	static ToolMaterial ILLIWON = EnumHelper.addToolMaterial("ILLIWON", 5, 3122, 16.0F, 6.0F, 9);
	static ToolMaterial AFNAMITE = EnumHelper.addToolMaterial("AFNAMITE", 6, 4996, 20.0F, 7.0F, 8);
	
	static ArmorMaterial SARLITE_ARMOR = EnumHelper.addArmorMaterial("SARLITE", "palaria:sarlite", 52, new int[]{4, 9, 6, 3}, 10);
	static ArmorMaterial FLAMITE_ARMOR = EnumHelper.addArmorMaterial("FLAMITE", "palaria:flamite", 60, new int[]{4, 8, 7, 4}, 10);
	static ArmorMaterial CLARITE_ARMOR = EnumHelper.addArmorMaterial("CLARITE", "palaria:clarite", 23, new int[]{3, 6, 6, 3}, 16);
	static ArmorMaterial ILLIWON_ARMOR = EnumHelper.addArmorMaterial("ILLIWON", "palaria:illiwon", 66, new int[]{5, 10, 8, 5}, 9);
	static ArmorMaterial AFNAMITE_ARMOR = EnumHelper.addArmorMaterial("AFNAMITE", "palaria:afnamite", 105, new int[]{6, 11, 9, 6}, 8);
	
	
	public static void init()
	{
		//Items	
		sarliteingot = new Item().setUnlocalizedName("sarliteingot").setCreativeTab(CreativeTabs.tabMaterials);
		flamiteingot = new Item().setUnlocalizedName("flamiteingot").setCreativeTab(CreativeTabs.tabMaterials);
		claritegem = new Item().setUnlocalizedName("claritegem").setCreativeTab(CreativeTabs.tabMaterials);
		illiwongem = new Item().setUnlocalizedName("illiwongem").setCreativeTab(CreativeTabs.tabMaterials);
		afnamitegem = new Item().setUnlocalizedName("afnamitegem").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Tools
		sarliteshovel = new ItemModSpade(SARLITE).setUnlocalizedName("sarliteshovel").setCreativeTab(CreativeTabs.tabTools);
		sarlitepick = new ItemModPickaxe(SARLITE).setUnlocalizedName("sarlitepick").setCreativeTab(CreativeTabs.tabTools);
		sarliteaxe = new ItemModAxe(SARLITE).setUnlocalizedName("sarliteaxe").setCreativeTab(CreativeTabs.tabTools);
		sarlitehoe = new ItemHoe(SARLITE).setUnlocalizedName("sarlitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		flamiteshovel = new ItemModSpade(FLAMITE).setUnlocalizedName("flamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		flamitepick = new ItemModPickaxe(FLAMITE).setUnlocalizedName("flamitepick").setCreativeTab(CreativeTabs.tabTools);
		flamiteaxe = new ItemModAxe(FLAMITE).setUnlocalizedName("flamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		flamitehoe = new ItemHoe(FLAMITE).setUnlocalizedName("flamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		clariteshovel = new ItemModSpade(CLARITE).setUnlocalizedName("clariteshovel").setCreativeTab(CreativeTabs.tabTools);
		claritepick = new ItemModPickaxe(CLARITE).setUnlocalizedName("claritepick").setCreativeTab(CreativeTabs.tabTools);
		clariteaxe = new ItemModAxe(CLARITE).setUnlocalizedName("clariteaxe").setCreativeTab(CreativeTabs.tabTools);
		claritehoe = new ItemHoe(CLARITE).setUnlocalizedName("claritehoe").setCreativeTab(CreativeTabs.tabTools);
		
		illiwonshovel = new ItemModSpade(ILLIWON).setUnlocalizedName("illiwonshovel").setCreativeTab(CreativeTabs.tabTools);
		illiwonpick = new ItemModPickaxe(ILLIWON).setUnlocalizedName("illiwonpick").setCreativeTab(CreativeTabs.tabTools);
		illiwonaxe = new ItemModAxe(ILLIWON).setUnlocalizedName("illiwonaxe").setCreativeTab(CreativeTabs.tabTools);
		illiwonhoe = new ItemHoe(ILLIWON).setUnlocalizedName("illiwonhoe").setCreativeTab(CreativeTabs.tabTools);
		
		afnamiteshovel = new ItemModSpade(AFNAMITE).setUnlocalizedName("afnamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		afnamitepick = new ItemModPickaxe(AFNAMITE).setUnlocalizedName("afnamitepick").setCreativeTab(CreativeTabs.tabTools);
		afnamiteaxe = new ItemModAxe(AFNAMITE).setUnlocalizedName("afnamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		afnamitehoe = new ItemHoe(AFNAMITE).setUnlocalizedName("afnamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		//Swords
		sarlitesword = new ItemSword(SARLITE).setUnlocalizedName("sarlitesword").setCreativeTab(CreativeTabs.tabCombat);
		flamitesword = new ItemSword(FLAMITE).setUnlocalizedName("flamitesword").setCreativeTab(CreativeTabs.tabCombat);
		claritesword = new ItemSword(CLARITE).setUnlocalizedName("claritesword").setCreativeTab(CreativeTabs.tabCombat);
		illiwonsword = new ItemSword(ILLIWON).setUnlocalizedName("illiwonsword").setCreativeTab(CreativeTabs.tabCombat);
		afnamitesword = new ItemSword(AFNAMITE).setUnlocalizedName("afnamitesword").setCreativeTab(CreativeTabs.tabCombat);
		
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
		
		illiwonhelmet = new ItemArmor(ILLIWON_ARMOR, 1, 0).setUnlocalizedName("illiwonhelmet").setCreativeTab(CreativeTabs.tabCombat);
		illiwonchestplate = new ItemArmor(ILLIWON_ARMOR, 1, 1).setUnlocalizedName("illiwonchestplate").setCreativeTab(CreativeTabs.tabCombat);
		illiwonleggings = new ItemArmor(ILLIWON_ARMOR, 2, 2).setUnlocalizedName("illiwonleggings").setCreativeTab(CreativeTabs.tabCombat);
		illiwonboots = new ItemArmor(ILLIWON_ARMOR, 1, 3).setUnlocalizedName("illiwonboots").setCreativeTab(CreativeTabs.tabCombat);
		
		afnamitehelmet = new ItemArmor(AFNAMITE_ARMOR, 1, 0).setUnlocalizedName("afnamitehelmet").setCreativeTab(CreativeTabs.tabCombat);
		afnamitechestplate = new ItemArmor(AFNAMITE_ARMOR, 1, 1).setUnlocalizedName("afnamitechestplate").setCreativeTab(CreativeTabs.tabCombat);
		afnamiteleggings = new ItemArmor(AFNAMITE_ARMOR, 2, 2).setUnlocalizedName("afnamiteleggings").setCreativeTab(CreativeTabs.tabCombat);
		afnamiteboots = new ItemArmor(AFNAMITE_ARMOR, 1, 3).setUnlocalizedName("afnamiteboots").setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static void register()
	{	

		//Items
		RegisterHelper.registerItem(sarliteingot);
		RegisterHelper.registerItem(flamiteingot);
		RegisterHelper.registerItem(claritegem);
		RegisterHelper.registerItem(illiwongem);
		RegisterHelper.registerItem(afnamitegem);
		
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
		
		RegisterHelper.registerItem(illiwonshovel);
		RegisterHelper.registerItem(illiwonpick);
		RegisterHelper.registerItem(illiwonaxe);
		RegisterHelper.registerItem(illiwonhoe);
		
		RegisterHelper.registerItem(afnamiteshovel);
		RegisterHelper.registerItem(afnamitepick);
		RegisterHelper.registerItem(afnamiteaxe);
		RegisterHelper.registerItem(afnamitehoe);
		
		//Swords
		RegisterHelper.registerItem(sarlitesword);
		RegisterHelper.registerItem(flamitesword);
		RegisterHelper.registerItem(claritesword);
		RegisterHelper.registerItem(illiwonsword);
		RegisterHelper.registerItem(afnamitesword);
		
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
		
		RegisterHelper.registerItem(illiwonhelmet);
		RegisterHelper.registerItem(illiwonchestplate);
		RegisterHelper.registerItem(illiwonleggings);
		RegisterHelper.registerItem(illiwonboots);
		
		RegisterHelper.registerItem(afnamitehelmet);
		RegisterHelper.registerItem(afnamitechestplate);
		RegisterHelper.registerItem(afnamiteleggings);
		RegisterHelper.registerItem(afnamiteboots);
		
		
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
		/**************************************************************/
		/*Illiwon*/
		/**************************************************************/
		GameRegistry.addRecipe(new ItemStack(illiwonpick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(illiwonaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(illiwonaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(illiwonhoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(illiwonhoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(illiwonshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(illiwonsword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', illiwongem, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(illiwonhelmet), new Object []
		{
			"XXX",
			"X X",
			'X', illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(illiwonchestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(illiwonleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(illiwonboots), new Object []
		{
			"X X",
			"X X",
			'X', illiwongem
		});
		/**************************************************************/
		/*Afnamite*/
		/**************************************************************/
		GameRegistry.addRecipe(new ItemStack(afnamitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(afnamiteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(afnamiteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(afnamitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(afnamitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(afnamiteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(afnamitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', afnamitegem, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(afnamitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(afnamitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(afnamiteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(afnamiteboots), new Object []
		{
			"X X",
			"X X",
			'X', afnamitegem
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
		registerRender(illiwongem);
		registerRender(afnamitegem);
		
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
		
		registerRender(illiwonshovel);
		registerRender(illiwonpick);
		registerRender(illiwonaxe);
		registerRender(illiwonhoe);
		
		registerRender(afnamiteshovel);
		registerRender(afnamitepick);
		registerRender(afnamiteaxe);
		registerRender(afnamitehoe);
		
		//Swords
		registerRender(sarlitesword);
		registerRender(flamitesword);
		registerRender(claritesword);
		registerRender(illiwonsword);
		registerRender(afnamitesword);
		
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
		
		registerRender(illiwonhelmet);
		registerRender(illiwonchestplate);
		registerRender(illiwonleggings);
		registerRender(illiwonboots);
		
		registerRender(afnamitehelmet);
		registerRender(afnamitechestplate);
		registerRender(afnamiteleggings);
		registerRender(afnamiteboots);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
