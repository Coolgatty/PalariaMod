package com.coolgatty.palaria.items;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
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
	public static Item woodswordhead;
	public static Item woodaxehead;
	public static Item woodshovelhead;
	public static Item woodpickaxehead;
	
	public static Item stoneswordhead;
	public static Item stoneaxehead;
	public static Item stoneshovelhead;
	public static Item stonepickaxehead;
	
	public static Item ironswordhead;
	public static Item ironaxehead;
	public static Item ironshovelhead;
	public static Item ironpickaxehead;
	
	public static Item clariteswordhead;
	public static Item clariteaxehead;
	public static Item clariteshovelhead;
	public static Item claritepickaxehead;
	
	public static Item diamondswordhead;
	public static Item diamondaxehead;
	public static Item diamondshovelhead;
	public static Item diamondpickaxehead;
	
	public static Item goldswordhead;
	public static Item goldaxehead;
	public static Item goldshovelhead;
	public static Item goldpickaxehead;
	
	public static Item sarliteswordhead;
	public static Item sarliteaxehead;
	public static Item sarliteshovelhead;
	public static Item sarlitepickaxehead;
	
	public static Item flamiteswordhead;
	public static Item flamiteaxehead;
	public static Item flamiteshovelhead;
	public static Item flamitepickaxehead;
	
	public static Item illiwonswordhead;
	public static Item illiwonaxehead;
	public static Item illiwonshovelhead;
	public static Item illiwonpickaxehead;
	
	public static Item afnamiteswordhead;
	public static Item afnamiteaxehead;
	public static Item afnamiteshovelhead;
	public static Item afnamitepickaxehead;
	
	public static Item endermiteswordhead;
	public static Item endermiteaxehead;
	public static Item endermiteshovelhead;
	public static Item endermitepickaxehead;
	
	//Other
	public static Item flitherclock;
	
	/**Drops & their derivatives**/
	public static Item raptorclaw;
	public static Item creeptileeye;
	public static Item stickyraptorclaw;
	
	//Materials
	public static Item sarliteingot;
	public static Item flamiteingot;
	public static Item claritegem;
	public static Item illiwongem;
	public static Item afnamitegem;
	public static Item endermiteingot;
	
	public static Item narriteingot;
	
	public static Item rawcrawmite;
	public static Item crawmite;
	
	public static Item endermiteshard;
	public static Item endermitechunk;
	public static Item refinedendermitechunk;
	public static Item endermitequartz;
	public static Item refinedendermitequartz;
	public static Item endermitegem;
	public static Item refinedendermitegem;
	public static Item enderrite;
	
	//Classic Tools	
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
	
	public static Item endermiteshovel;
	public static Item endermitepick;
	public static Item endermiteaxe;
	public static Item endermitehoe;
	
	//Other Tools
	public static Item woodshick;
	public static Item stoneshick;
	public static Item ironshick;
	public static Item clariteshick;
	public static Item diamondshick;
	public static Item goldshick;
	public static Item sarliteshick;
	public static Item flamiteshick;
	public static Item illiwonshick;
	public static Item afnamiteshick;
	public static Item endermiteshick;
	
	//Swords
	public static Item sarlitesword;
	public static Item flamitesword;
	public static Item claritesword;
	public static Item illiwonsword;
	public static Item afnamitesword;
	public static Item endermitesword;
	
	public static Item crawmitesword;
	public static Item doomspoon;
	public static Item refinedendermitesword;
	public static Item enderlitesword;
	public static Item enderritesword;
	
	//Scythe Blades
	public static Item woodblade;
	public static Item stoneblade;
	public static Item ironblade;
	public static Item diamondblade;
	public static Item goldblade;
	public static Item sarliteblade;
	public static Item flamiteblade;
	public static Item clariteblade;
	public static Item illiwonblade;
	public static Item afnamiteblade;
	public static Item endermiteblade;
	
	//Stealth Daggers
	public static Item woodstealth;
	public static Item stonestealth;
	public static Item ironstealth;
	public static Item diamondstealth;
	public static Item goldstealth;
	public static Item sarlitestealth;
	public static Item flamitestealth;
	public static Item claritestealth;
	public static Item illiwonstealth;
	public static Item afnamitestealth;
	public static Item endermitestealth;
	
	//Falkions
	public static Item woodfalkion;
	public static Item stonefalkion;
	public static Item ironfalkion;
	public static Item diamondfalkion;
	public static Item goldfalkion;
	public static Item sarlitefalkion;
	public static Item flamitefalkion;
	public static Item claritefalkion;
	public static Item illiwonfalkion;
	public static Item afnamitefalkion;
	public static Item endermitefalkion;
	
	//Battle Axes
	public static Item woodbattleaxe;
	public static Item stonebattleaxe;
	public static Item ironbattleaxe;
	public static Item claritebattleaxe;
	public static Item diamondbattleaxe;
	public static Item goldbattleaxe;
	public static Item sarlitebattleaxe;
	public static Item flamitebattleaxe;
	public static Item illiwonbattleaxe;
	public static Item afnamitebattleaxe;
	public static Item endermitebattleaxe;
	
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
	
	public static Item endermitehelmet;
	public static Item endermitechestplate;
	public static Item endermiteleggings;
	public static Item endermiteboots;
	
	//Materials

	static ToolMaterial SARLITE = EnumHelper.addToolMaterial("SARLITE", 4, 2432, 12.0F, 4.0F, 10);
	static ToolMaterial FLAMITE = EnumHelper.addToolMaterial("FLAMITE", 4, 2576, 13.0F, 5.0F, 10);
	static ToolMaterial CLARITE = EnumHelper.addToolMaterial("CLARITE", 2, 781, 10.0F, 3.0F, 16);
	static ToolMaterial ILLIWON = EnumHelper.addToolMaterial("ILLIWON", 5, 3122, 16.0F, 6.0F, 9);
	static ToolMaterial AFNAMITE = EnumHelper.addToolMaterial("AFNAMITE", 6, 4996, 20.0F, 7.0F, 8);
	static ToolMaterial ENDERMITE = EnumHelper.addToolMaterial("ENDERMITE", 7, 12354, 24.0F, 10.0F, 6);
	
	static ArmorMaterial SARLITE_ARMOR = EnumHelper.addArmorMaterial("SARLITE", "palaria:sarlite", 52, new int[]{4, 9, 6, 3}, 10);
	static ArmorMaterial FLAMITE_ARMOR = EnumHelper.addArmorMaterial("FLAMITE", "palaria:flamite", 60, new int[]{4, 8, 7, 4}, 10);
	static ArmorMaterial CLARITE_ARMOR = EnumHelper.addArmorMaterial("CLARITE", "palaria:clarite", 23, new int[]{3, 6, 6, 3}, 16);
	static ArmorMaterial ILLIWON_ARMOR = EnumHelper.addArmorMaterial("ILLIWON", "palaria:illiwon", 66, new int[]{5, 10, 8, 5}, 9);
	static ArmorMaterial AFNAMITE_ARMOR = EnumHelper.addArmorMaterial("AFNAMITE", "palaria:afnamite", 105, new int[]{6, 11, 9, 6}, 8);
	static ArmorMaterial ENDERMITE_ARMOR = EnumHelper.addArmorMaterial("ENDERMITE", "palaria:ender", 126, new int[]{8, 12, 10, 8}, 8);
	
	//Special Materials
	static ToolMaterial CrawmiteSword = EnumHelper.addToolMaterial("CRAWMITE", 3, 8241, 40.0F, 16, 10);
	static ToolMaterial DoomSpoonSword = EnumHelper.addToolMaterial("DOOMSPOON", 3, 10044, 49.0F, 20, 9);
	static ToolMaterial RefinedEndermiteSword = EnumHelper.addToolMaterial("ENDERMITE", 3, 15643, 54.0F, 24, 6);
	static ToolMaterial EnderliteSword = EnumHelper.addToolMaterial("ENDERLITE", 3, 10000, 250.0F, 32, 5);
	static ToolMaterial EnderriteSword = EnumHelper.addToolMaterial("ENDERRITE", 3, 8000, 1250.0F, 40, 3);
	
	
	public static void init()
	{
		
		//Items
		woodswordhead = new Item().setUnlocalizedName("woodswordhead").setCreativeTab(CreativeTabs.tabTools);
		woodaxehead = new Item().setUnlocalizedName("woodaxehead").setCreativeTab(CreativeTabs.tabTools);
		woodshovelhead = new Item().setUnlocalizedName("woodshovelhead").setCreativeTab(CreativeTabs.tabTools);
		woodpickaxehead = new Item().setUnlocalizedName("woodpickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		stoneswordhead = new Item().setUnlocalizedName("stoneswordhead").setCreativeTab(CreativeTabs.tabTools);
		stoneaxehead = new Item().setUnlocalizedName("stoneaxehead").setCreativeTab(CreativeTabs.tabTools);
		stoneshovelhead = new Item().setUnlocalizedName("stoneshovelhead").setCreativeTab(CreativeTabs.tabTools);
		stonepickaxehead = new Item().setUnlocalizedName("stonepickaxehead").setCreativeTab(CreativeTabs.tabTools);

		ironswordhead = new Item().setUnlocalizedName("ironswordhead").setCreativeTab(CreativeTabs.tabTools);
		ironaxehead = new Item().setUnlocalizedName("ironaxehead").setCreativeTab(CreativeTabs.tabTools);
		ironshovelhead = new Item().setUnlocalizedName("ironshovelhead").setCreativeTab(CreativeTabs.tabTools);
		ironpickaxehead = new Item().setUnlocalizedName("ironpickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		clariteswordhead = new Item().setUnlocalizedName("clariteswordhead").setCreativeTab(CreativeTabs.tabTools);
		clariteaxehead = new Item().setUnlocalizedName("clariteaxehead").setCreativeTab(CreativeTabs.tabTools);
		clariteshovelhead = new Item().setUnlocalizedName("clariteshovelhead").setCreativeTab(CreativeTabs.tabTools);
		claritepickaxehead = new Item().setUnlocalizedName("claritepickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		diamondswordhead = new Item().setUnlocalizedName("diamondswordhead").setCreativeTab(CreativeTabs.tabTools);
		diamondaxehead = new Item().setUnlocalizedName("diamondaxehead").setCreativeTab(CreativeTabs.tabTools);
		diamondshovelhead = new Item().setUnlocalizedName("diamondshovelhead").setCreativeTab(CreativeTabs.tabTools);
		diamondpickaxehead = new Item().setUnlocalizedName("diamondpickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		goldswordhead = new Item().setUnlocalizedName("goldswordhead").setCreativeTab(CreativeTabs.tabTools);
		goldaxehead = new Item().setUnlocalizedName("goldaxehead").setCreativeTab(CreativeTabs.tabTools);
		goldshovelhead = new Item().setUnlocalizedName("goldshovelhead").setCreativeTab(CreativeTabs.tabTools);
		goldpickaxehead = new Item().setUnlocalizedName("goldpickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		sarliteswordhead = new Item().setUnlocalizedName("sarliteswordhead").setCreativeTab(CreativeTabs.tabTools);
		sarliteaxehead = new Item().setUnlocalizedName("sarliteaxehead").setCreativeTab(CreativeTabs.tabTools);
		sarliteshovelhead = new Item().setUnlocalizedName("sarliteshovelhead").setCreativeTab(CreativeTabs.tabTools);
		sarlitepickaxehead = new Item().setUnlocalizedName("sarlitepickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		flamiteswordhead = new Item().setUnlocalizedName("flamiteswordhead").setCreativeTab(CreativeTabs.tabTools);
		flamiteaxehead = new Item().setUnlocalizedName("flamiteaxehead").setCreativeTab(CreativeTabs.tabTools);
		flamiteshovelhead = new Item().setUnlocalizedName("flamiteshovelhead").setCreativeTab(CreativeTabs.tabTools);
		flamitepickaxehead = new Item().setUnlocalizedName("flamitepickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		illiwonswordhead = new Item().setUnlocalizedName("illiwonswordhead").setCreativeTab(CreativeTabs.tabTools);
		illiwonaxehead = new Item().setUnlocalizedName("illiwonaxehead").setCreativeTab(CreativeTabs.tabTools);
		illiwonshovelhead = new Item().setUnlocalizedName("illiwonshovelhead").setCreativeTab(CreativeTabs.tabTools);
		illiwonpickaxehead = new Item().setUnlocalizedName("illiwonpickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		afnamiteswordhead = new Item().setUnlocalizedName("afnamiteswordhead").setCreativeTab(CreativeTabs.tabTools);
		afnamiteaxehead = new Item().setUnlocalizedName("afnamiteaxehead").setCreativeTab(CreativeTabs.tabTools);
		afnamiteshovelhead = new Item().setUnlocalizedName("afnamiteshovelhead").setCreativeTab(CreativeTabs.tabTools);
		afnamitepickaxehead = new Item().setUnlocalizedName("afnamitepickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		endermiteswordhead = new Item().setUnlocalizedName("endermiteswordhead").setCreativeTab(CreativeTabs.tabTools);
		endermiteaxehead = new Item().setUnlocalizedName("endermiteaxehead").setCreativeTab(CreativeTabs.tabTools);
		endermiteshovelhead = new Item().setUnlocalizedName("endermiteshovelhead").setCreativeTab(CreativeTabs.tabTools);
		endermitepickaxehead = new Item().setUnlocalizedName("endermitepickaxehead").setCreativeTab(CreativeTabs.tabTools);
		
		//Other
		flitherclock = new Item().setUnlocalizedName("flitherclock").setCreativeTab(CreativeTabs.tabTools);
		
		/*Drops & their derivatives*/
		raptorclaw = new Item().setUnlocalizedName("raptorclaw").setCreativeTab(CreativeTabs.tabMaterials);
		stickyraptorclaw = new Item().setUnlocalizedName("stickyraptorclaw").setCreativeTab(CreativeTabs.tabMaterials);
		creeptileeye = new Item().setUnlocalizedName("creeptileeye").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Materials
		sarliteingot = new Item().setUnlocalizedName("sarliteingot").setCreativeTab(CreativeTabs.tabMaterials);
		flamiteingot = new Item().setUnlocalizedName("flamiteingot").setCreativeTab(CreativeTabs.tabMaterials);
		claritegem = new Item().setUnlocalizedName("claritegem").setCreativeTab(CreativeTabs.tabMaterials);
		illiwongem = new Item().setUnlocalizedName("illiwongem").setCreativeTab(CreativeTabs.tabMaterials);
		afnamitegem = new Item().setUnlocalizedName("afnamitegem").setCreativeTab(CreativeTabs.tabMaterials);
		endermiteingot = new Item().setUnlocalizedName("endermiteingot").setCreativeTab(CreativeTabs.tabMaterials);
		
		narriteingot = new Item().setUnlocalizedName("narriteingot").setCreativeTab(CreativeTabs.tabMaterials);
		
		endermiteshard = new Item().setUnlocalizedName("endermiteshard").setCreativeTab(CreativeTabs.tabMaterials);
		endermitechunk = new Item().setUnlocalizedName("endermitechunk").setCreativeTab(CreativeTabs.tabMaterials);
		refinedendermitechunk = new Item().setUnlocalizedName("refinedendermitechunk").setCreativeTab(CreativeTabs.tabMaterials);
		endermitequartz = new Item().setUnlocalizedName("endermitequartz").setCreativeTab(CreativeTabs.tabMaterials);
		refinedendermitequartz = new Item().setUnlocalizedName("refinedendermitequartz").setCreativeTab(CreativeTabs.tabMaterials);
		rawcrawmite = new Item().setUnlocalizedName("rawcrawmite").setCreativeTab(CreativeTabs.tabMaterials);	
		crawmite = new Item().setUnlocalizedName("crawmite").setCreativeTab(CreativeTabs.tabMaterials);
		endermitegem = new Item().setUnlocalizedName("endermitegem").setCreativeTab(CreativeTabs.tabMaterials);
		refinedendermitegem = new Item().setUnlocalizedName("refinedendermitegem").setCreativeTab(CreativeTabs.tabMaterials);
		enderrite = new Item().setUnlocalizedName("enderrite").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Tools
		sarliteshovel = new ItemModSpade(SARLITE, sarliteingot).setUnlocalizedName("sarliteshovel").setCreativeTab(CreativeTabs.tabTools);
		sarlitepick = new ItemModPickaxe(SARLITE, sarliteingot).setUnlocalizedName("sarlitepick").setCreativeTab(CreativeTabs.tabTools);
		sarliteaxe = new ItemModAxe(SARLITE, sarliteingot).setUnlocalizedName("sarliteaxe").setCreativeTab(CreativeTabs.tabTools);
		sarlitehoe = new ItemHoe(SARLITE).setUnlocalizedName("sarlitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		flamiteshovel = new ItemModSpade(FLAMITE, flamiteingot).setUnlocalizedName("flamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		flamitepick = new ItemModPickaxe(FLAMITE, flamiteingot).setUnlocalizedName("flamitepick").setCreativeTab(CreativeTabs.tabTools);
		flamiteaxe = new ItemModAxe(FLAMITE, flamiteingot).setUnlocalizedName("flamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		flamitehoe = new ItemHoe(FLAMITE).setUnlocalizedName("flamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		clariteshovel = new ItemModSpade(CLARITE, claritegem).setUnlocalizedName("clariteshovel").setCreativeTab(CreativeTabs.tabTools);
		claritepick = new ItemModPickaxe(CLARITE, claritegem).setUnlocalizedName("claritepick").setCreativeTab(CreativeTabs.tabTools);
		clariteaxe = new ItemModAxe(CLARITE, claritegem).setUnlocalizedName("clariteaxe").setCreativeTab(CreativeTabs.tabTools);
		claritehoe = new ItemHoe(CLARITE).setUnlocalizedName("claritehoe").setCreativeTab(CreativeTabs.tabTools);
		
		illiwonshovel = new ItemModSpade(ILLIWON, illiwongem).setUnlocalizedName("illiwonshovel").setCreativeTab(CreativeTabs.tabTools);
		illiwonpick = new ItemModPickaxe(ILLIWON, illiwongem).setUnlocalizedName("illiwonpick").setCreativeTab(CreativeTabs.tabTools);
		illiwonaxe = new ItemModAxe(ILLIWON, illiwongem).setUnlocalizedName("illiwonaxe").setCreativeTab(CreativeTabs.tabTools);
		illiwonhoe = new ItemHoe(ILLIWON).setUnlocalizedName("illiwonhoe").setCreativeTab(CreativeTabs.tabTools);
		
		afnamiteshovel = new ItemModSpade(AFNAMITE, afnamitegem).setUnlocalizedName("afnamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		afnamitepick = new ItemModPickaxe(AFNAMITE, afnamitegem).setUnlocalizedName("afnamitepick").setCreativeTab(CreativeTabs.tabTools);
		afnamiteaxe = new ItemModAxe(AFNAMITE, afnamitegem).setUnlocalizedName("afnamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		afnamitehoe = new ItemHoe(AFNAMITE).setUnlocalizedName("afnamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		endermiteshovel = new ItemModSpade(ENDERMITE, endermiteingot).setUnlocalizedName("endermiteshovel").setCreativeTab(CreativeTabs.tabTools);
		endermitepick = new ItemModPickaxe(ENDERMITE, endermiteingot).setUnlocalizedName("endermitepick").setCreativeTab(CreativeTabs.tabTools);
		endermiteaxe = new ItemModAxe(ENDERMITE, endermiteingot).setUnlocalizedName("endermiteaxe").setCreativeTab(CreativeTabs.tabTools);
		endermitehoe = new ItemHoe(ENDERMITE).setUnlocalizedName("endermitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		//Swords
		sarlitesword = new ItemModSword(SARLITE, sarliteingot).setUnlocalizedName("sarlitesword").setCreativeTab(CreativeTabs.tabCombat);
		flamitesword = new ItemModSword(FLAMITE, flamiteingot).setUnlocalizedName("flamitesword").setCreativeTab(CreativeTabs.tabCombat);
		claritesword = new ItemModSword(CLARITE, claritegem).setUnlocalizedName("claritesword").setCreativeTab(CreativeTabs.tabCombat);
		illiwonsword = new ItemModSword(ILLIWON, illiwongem).setUnlocalizedName("illiwonsword").setCreativeTab(CreativeTabs.tabCombat);
		afnamitesword = new ItemModSword(AFNAMITE, afnamitegem).setUnlocalizedName("afnamitesword").setCreativeTab(CreativeTabs.tabCombat);
		endermitesword = new ItemModSword(ENDERMITE, endermiteingot).setUnlocalizedName("endermitesword").setCreativeTab(CreativeTabs.tabCombat);
		
		crawmitesword = new ItemModSword(CrawmiteSword, crawmite).setUnlocalizedName("crawmitesword").setCreativeTab(CreativeTabs.tabCombat);
		doomspoon = new ItemModSword(DoomSpoonSword, crawmite, afnamitegem).setUnlocalizedName("doomspoon").setCreativeTab(CreativeTabs.tabCombat);
		refinedendermitesword = new ItemModSword(RefinedEndermiteSword).setUnlocalizedName("refinedendermitesword").setCreativeTab(CreativeTabs.tabCombat);
		enderlitesword = new ItemModSword(EnderliteSword).setUnlocalizedName("enderlitesword").setCreativeTab(CreativeTabs.tabCombat);
		enderritesword = new ItemModSword(EnderriteSword).setUnlocalizedName("enderritesword").setCreativeTab(CreativeTabs.tabCombat);
		
		//Scythe Blades
		woodblade = new ItemScytheBlade(ToolMaterial.WOOD, Item.getItemFromBlock(Blocks.planks)).setUnlocalizedName("woodblade").setCreativeTab(CreativeTabs.tabCombat);
		stoneblade = new ItemScytheBlade(ToolMaterial.STONE, Item.getItemFromBlock(Blocks.cobblestone)).setUnlocalizedName("stoneblade").setCreativeTab(CreativeTabs.tabCombat);
		ironblade = new ItemScytheBlade(ToolMaterial.IRON, Items.iron_ingot).setUnlocalizedName("ironblade").setCreativeTab(CreativeTabs.tabCombat);
		diamondblade = new ItemScytheBlade(ToolMaterial.EMERALD, Items.diamond).setUnlocalizedName("diamondblade").setCreativeTab(CreativeTabs.tabCombat);
		goldblade = new ItemScytheBlade(ToolMaterial.GOLD, Items.gold_ingot).setUnlocalizedName("goldblade").setCreativeTab(CreativeTabs.tabCombat);
		sarliteblade = new ItemScytheBlade(SARLITE, sarliteingot).setUnlocalizedName("sarliteblade").setCreativeTab(CreativeTabs.tabCombat);
		flamiteblade = new ItemScytheBlade(FLAMITE, flamiteingot).setUnlocalizedName("flamiteblade").setCreativeTab(CreativeTabs.tabCombat);
		clariteblade = new ItemScytheBlade(CLARITE, claritegem).setUnlocalizedName("clariteblade").setCreativeTab(CreativeTabs.tabCombat);
		illiwonblade = new ItemScytheBlade(ILLIWON, illiwongem).setUnlocalizedName("illiwonblade").setCreativeTab(CreativeTabs.tabCombat);
		afnamiteblade = new ItemScytheBlade(AFNAMITE, afnamitegem).setUnlocalizedName("afnamiteblade").setCreativeTab(CreativeTabs.tabCombat);
		endermiteblade = new ItemScytheBlade(ENDERMITE, endermiteingot).setUnlocalizedName("endermiteblade").setCreativeTab(CreativeTabs.tabCombat);
		
		//Stealth Daggers
		woodstealth = new ItemStealthDagger(ToolMaterial.WOOD, Item.getItemFromBlock(Blocks.planks)).setUnlocalizedName("woodstealth").setCreativeTab(CreativeTabs.tabCombat);
		stonestealth = new ItemStealthDagger(ToolMaterial.STONE, Item.getItemFromBlock(Blocks.cobblestone)).setUnlocalizedName("stonestealth").setCreativeTab(CreativeTabs.tabCombat);
		ironstealth = new ItemStealthDagger(ToolMaterial.IRON, Items.iron_ingot).setUnlocalizedName("ironstealth").setCreativeTab(CreativeTabs.tabCombat);
		diamondstealth = new ItemStealthDagger(ToolMaterial.EMERALD, Items.diamond).setUnlocalizedName("diamondstealth").setCreativeTab(CreativeTabs.tabCombat);
		goldstealth = new ItemStealthDagger(ToolMaterial.GOLD, Items.gold_ingot).setUnlocalizedName("goldstealth").setCreativeTab(CreativeTabs.tabCombat);
		sarlitestealth = new ItemStealthDagger(SARLITE, sarliteingot).setUnlocalizedName("sarlitestealth").setCreativeTab(CreativeTabs.tabCombat);
		flamitestealth = new ItemStealthDagger(FLAMITE, flamiteingot).setUnlocalizedName("flamitestealth").setCreativeTab(CreativeTabs.tabCombat);
		claritestealth = new ItemStealthDagger(CLARITE, claritegem).setUnlocalizedName("claritestealth").setCreativeTab(CreativeTabs.tabCombat);
		illiwonstealth = new ItemStealthDagger(ILLIWON, illiwongem).setUnlocalizedName("illiwonstealth").setCreativeTab(CreativeTabs.tabCombat);
		afnamitestealth = new ItemStealthDagger(AFNAMITE, afnamitegem).setUnlocalizedName("afnamitestealth").setCreativeTab(CreativeTabs.tabCombat);
		endermitestealth = new ItemStealthDagger(ENDERMITE, endermiteingot).setUnlocalizedName("endermitestealth").setCreativeTab(CreativeTabs.tabCombat);
		
		//Falkions
		woodfalkion = new ItemFalkion(ToolMaterial.WOOD, Item.getItemFromBlock(Blocks.planks)).setUnlocalizedName("woodfalkion").setCreativeTab(CreativeTabs.tabCombat);
		stonefalkion = new ItemFalkion(ToolMaterial.STONE, Item.getItemFromBlock(Blocks.cobblestone)).setUnlocalizedName("stonefalkion").setCreativeTab(CreativeTabs.tabCombat);
		ironfalkion = new ItemFalkion(ToolMaterial.IRON, Items.iron_ingot).setUnlocalizedName("ironfalkion").setCreativeTab(CreativeTabs.tabCombat);
		diamondfalkion = new ItemFalkion(ToolMaterial.EMERALD, Items.diamond).setUnlocalizedName("diamondfalkion").setCreativeTab(CreativeTabs.tabCombat);
		goldfalkion = new ItemFalkion(ToolMaterial.GOLD, Items.gold_ingot).setUnlocalizedName("goldfalkion").setCreativeTab(CreativeTabs.tabCombat);
		sarlitefalkion = new ItemFalkion(SARLITE, sarliteingot).setUnlocalizedName("sarlitefalkion").setCreativeTab(CreativeTabs.tabCombat);
		flamitefalkion = new ItemFalkion(FLAMITE, flamiteingot).setUnlocalizedName("flamitefalkion").setCreativeTab(CreativeTabs.tabCombat);
		claritefalkion = new ItemFalkion(CLARITE, claritegem).setUnlocalizedName("claritefalkion").setCreativeTab(CreativeTabs.tabCombat);
		illiwonfalkion = new ItemFalkion(ILLIWON, illiwongem).setUnlocalizedName("illiwonfalkion").setCreativeTab(CreativeTabs.tabCombat);
		afnamitefalkion = new ItemFalkion(AFNAMITE, afnamitegem).setUnlocalizedName("afnamitefalkion").setCreativeTab(CreativeTabs.tabCombat);
		endermitefalkion = new ItemFalkion(ENDERMITE, endermiteingot).setUnlocalizedName("endermitefalkion").setCreativeTab(CreativeTabs.tabCombat);
		
		//Battle Axes
		woodbattleaxe = new ItemBattleAxe(ToolMaterial.WOOD, Item.getItemFromBlock(Blocks.planks)).setUnlocalizedName("woodbattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		stonebattleaxe = new ItemBattleAxe(ToolMaterial.STONE, Item.getItemFromBlock(Blocks.cobblestone)).setUnlocalizedName("stonebattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		ironbattleaxe = new ItemBattleAxe(ToolMaterial.IRON, Items.iron_ingot).setUnlocalizedName("ironbattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		diamondbattleaxe = new ItemBattleAxe(ToolMaterial.EMERALD, Items.diamond).setUnlocalizedName("diamondbattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		goldbattleaxe = new ItemBattleAxe(ToolMaterial.GOLD, Items.gold_ingot).setUnlocalizedName("goldbattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		sarlitebattleaxe = new ItemBattleAxe(SARLITE, sarliteingot).setUnlocalizedName("sarlitebattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		flamitebattleaxe = new ItemBattleAxe(FLAMITE, flamiteingot).setUnlocalizedName("flamitebattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		claritebattleaxe = new ItemBattleAxe(CLARITE, claritegem).setUnlocalizedName("claritebattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		illiwonbattleaxe = new ItemBattleAxe(ILLIWON, illiwongem).setUnlocalizedName("illiwonbattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		afnamitebattleaxe = new ItemBattleAxe(AFNAMITE, afnamitegem).setUnlocalizedName("afnamitebattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		endermitebattleaxe = new ItemBattleAxe(ENDERMITE, endermiteingot).setUnlocalizedName("endermitebattleaxe").setCreativeTab(CreativeTabs.tabCombat);
		
		//Shicks
		woodshick = new ItemShick(ToolMaterial.WOOD, Item.getItemFromBlock(Blocks.planks)).setUnlocalizedName("woodshick").setCreativeTab(CreativeTabs.tabTools);
		stoneshick = new ItemShick(ToolMaterial.STONE, Item.getItemFromBlock(Blocks.cobblestone)).setUnlocalizedName("stoneshick").setCreativeTab(CreativeTabs.tabTools);
		ironshick = new ItemShick(ToolMaterial.IRON, Items.iron_ingot).setUnlocalizedName("ironshick").setCreativeTab(CreativeTabs.tabTools);
		diamondshick = new ItemShick(ToolMaterial.EMERALD, Items.diamond).setUnlocalizedName("diamondshick").setCreativeTab(CreativeTabs.tabTools);
		goldshick = new ItemShick(ToolMaterial.GOLD, Items.gold_ingot).setUnlocalizedName("goldshick").setCreativeTab(CreativeTabs.tabTools);
		sarliteshick = new ItemShick(SARLITE, sarliteingot).setUnlocalizedName("sarliteshick").setCreativeTab(CreativeTabs.tabTools);
		flamiteshick = new ItemShick(FLAMITE, flamiteingot).setUnlocalizedName("flamiteshick").setCreativeTab(CreativeTabs.tabTools);
		clariteshick = new ItemShick(CLARITE, claritegem).setUnlocalizedName("clariteshick").setCreativeTab(CreativeTabs.tabTools);
		illiwonshick = new ItemShick(ILLIWON, illiwongem).setUnlocalizedName("illiwonshick").setCreativeTab(CreativeTabs.tabTools);
		afnamiteshick = new ItemShick(AFNAMITE, afnamitegem).setUnlocalizedName("afnamiteshick").setCreativeTab(CreativeTabs.tabTools);
		endermiteshick = new ItemShick(ENDERMITE, endermiteingot).setUnlocalizedName("endermiteshick").setCreativeTab(CreativeTabs.tabTools);
		
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
		
		endermitehelmet = new ItemArmor(ENDERMITE_ARMOR, 1, 0).setUnlocalizedName("endermitehelmet").setCreativeTab(CreativeTabs.tabCombat);
		endermitechestplate = new ItemArmor(ENDERMITE_ARMOR, 1, 1).setUnlocalizedName("endermitechestplate").setCreativeTab(CreativeTabs.tabCombat);
		endermiteleggings = new ItemArmor(ENDERMITE_ARMOR, 2, 2).setUnlocalizedName("endermiteleggings").setCreativeTab(CreativeTabs.tabCombat);
		endermiteboots = new ItemArmor(ENDERMITE_ARMOR, 1, 3).setUnlocalizedName("endermiteboots").setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static void register()
	{	

		//Items
		RegisterHelper.registerItem(woodswordhead);
		RegisterHelper.registerItem(woodaxehead);
		RegisterHelper.registerItem(woodshovelhead);
		RegisterHelper.registerItem(woodpickaxehead);
		
		RegisterHelper.registerItem(stoneswordhead);
		RegisterHelper.registerItem(stoneaxehead);
		RegisterHelper.registerItem(stoneshovelhead);
		RegisterHelper.registerItem(stonepickaxehead);
		
		RegisterHelper.registerItem(ironswordhead);
		RegisterHelper.registerItem(ironaxehead);
		RegisterHelper.registerItem(ironshovelhead);
		RegisterHelper.registerItem(ironpickaxehead);
		
		RegisterHelper.registerItem(clariteswordhead);
		RegisterHelper.registerItem(clariteaxehead);
		RegisterHelper.registerItem(clariteshovelhead);
		RegisterHelper.registerItem(claritepickaxehead);
		
		RegisterHelper.registerItem(diamondswordhead);
		RegisterHelper.registerItem(diamondaxehead);
		RegisterHelper.registerItem(diamondshovelhead);
		RegisterHelper.registerItem(diamondpickaxehead);
		
		RegisterHelper.registerItem(goldswordhead);
		RegisterHelper.registerItem(goldaxehead);
		RegisterHelper.registerItem(goldshovelhead);
		RegisterHelper.registerItem(goldpickaxehead);
		
		RegisterHelper.registerItem(sarliteswordhead);
		RegisterHelper.registerItem(sarliteaxehead);
		RegisterHelper.registerItem(sarliteshovelhead);
		RegisterHelper.registerItem(sarlitepickaxehead);
		
		RegisterHelper.registerItem(flamiteswordhead);
		RegisterHelper.registerItem(flamiteaxehead);
		RegisterHelper.registerItem(flamiteshovelhead);
		RegisterHelper.registerItem(flamitepickaxehead);
		
		RegisterHelper.registerItem(illiwonswordhead);
		RegisterHelper.registerItem(illiwonaxehead);
		RegisterHelper.registerItem(illiwonshovelhead);
		RegisterHelper.registerItem(illiwonpickaxehead);
		
		RegisterHelper.registerItem(afnamiteswordhead);
		RegisterHelper.registerItem(afnamiteaxehead);
		RegisterHelper.registerItem(afnamiteshovelhead);
		RegisterHelper.registerItem(afnamitepickaxehead);
		
		RegisterHelper.registerItem(endermiteswordhead);
		RegisterHelper.registerItem(endermiteaxehead);
		RegisterHelper.registerItem(endermiteshovelhead);
		RegisterHelper.registerItem(endermitepickaxehead);
		
		//Other
		RegisterHelper.registerItem(flitherclock);
		
		/**Drops & their derivatives**/
		RegisterHelper.registerItem(raptorclaw);
		RegisterHelper.registerItem(stickyraptorclaw);
		RegisterHelper.registerItem(creeptileeye);
		
		//Materials
		RegisterHelper.registerItem(sarliteingot);
		RegisterHelper.registerItem(flamiteingot);
		RegisterHelper.registerItem(claritegem);
		RegisterHelper.registerItem(illiwongem);
		RegisterHelper.registerItem(afnamitegem);
		RegisterHelper.registerItem(endermiteingot);
		
		RegisterHelper.registerItem(narriteingot);
		
		RegisterHelper.registerItem(rawcrawmite);
		RegisterHelper.registerItem(crawmite);
		
		RegisterHelper.registerItem(endermiteshard);
		RegisterHelper.registerItem(endermitechunk);
		RegisterHelper.registerItem(refinedendermitechunk);
		RegisterHelper.registerItem(endermitequartz);
		RegisterHelper.registerItem(refinedendermitequartz);
		RegisterHelper.registerItem(endermitegem);
		RegisterHelper.registerItem(refinedendermitegem);
		RegisterHelper.registerItem(enderrite);
		
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
		
		RegisterHelper.registerItem(endermiteshovel);
		RegisterHelper.registerItem(endermitepick);
		RegisterHelper.registerItem(endermiteaxe);
		RegisterHelper.registerItem(endermitehoe);
		
		//Swords
		RegisterHelper.registerItem(sarlitesword);
		RegisterHelper.registerItem(flamitesword);
		RegisterHelper.registerItem(claritesword);
		RegisterHelper.registerItem(illiwonsword);
		RegisterHelper.registerItem(afnamitesword);
		RegisterHelper.registerItem(endermitesword);
		
		/**Specials**/
		RegisterHelper.registerItem(crawmitesword);
		RegisterHelper.registerItem(doomspoon);
		
		RegisterHelper.registerItem(refinedendermitesword);
		RegisterHelper.registerItem(enderlitesword);
		RegisterHelper.registerItem(enderritesword);
		
		//Scythe Blades
		RegisterHelper.registerItem(woodblade);
		RegisterHelper.registerItem(stoneblade);
		RegisterHelper.registerItem(ironblade);
		RegisterHelper.registerItem(diamondblade);
		RegisterHelper.registerItem(goldblade);
		RegisterHelper.registerItem(sarliteblade);
		RegisterHelper.registerItem(flamiteblade);
		RegisterHelper.registerItem(clariteblade);
		RegisterHelper.registerItem(illiwonblade);
		RegisterHelper.registerItem(afnamiteblade);
		RegisterHelper.registerItem(endermiteblade);
		
		//Stealth Daggers
		RegisterHelper.registerItem(woodstealth);
		RegisterHelper.registerItem(stonestealth);
		RegisterHelper.registerItem(ironstealth);
		RegisterHelper.registerItem(diamondstealth);
		RegisterHelper.registerItem(goldstealth);
		RegisterHelper.registerItem(sarlitestealth);
		RegisterHelper.registerItem(flamitestealth);
		RegisterHelper.registerItem(claritestealth);
		RegisterHelper.registerItem(illiwonstealth);
		RegisterHelper.registerItem(afnamitestealth);
		RegisterHelper.registerItem(endermitestealth);
		
		//Falkions
		RegisterHelper.registerItem(woodfalkion);
		RegisterHelper.registerItem(stonefalkion);
		RegisterHelper.registerItem(ironfalkion);
		RegisterHelper.registerItem(diamondfalkion);
		RegisterHelper.registerItem(goldfalkion);
		RegisterHelper.registerItem(sarlitefalkion);
		RegisterHelper.registerItem(flamitefalkion);
		RegisterHelper.registerItem(claritefalkion);
		RegisterHelper.registerItem(illiwonfalkion);
		RegisterHelper.registerItem(afnamitefalkion);
		RegisterHelper.registerItem(endermitefalkion);
		
		//Battle Axes
		RegisterHelper.registerItem(woodbattleaxe);
		RegisterHelper.registerItem(stonebattleaxe);
		RegisterHelper.registerItem(ironbattleaxe);
		RegisterHelper.registerItem(diamondbattleaxe);
		RegisterHelper.registerItem(goldbattleaxe);
		RegisterHelper.registerItem(sarlitebattleaxe);
		RegisterHelper.registerItem(flamitebattleaxe);
		RegisterHelper.registerItem(claritebattleaxe);
		RegisterHelper.registerItem(illiwonbattleaxe);
		RegisterHelper.registerItem(afnamitebattleaxe);
		RegisterHelper.registerItem(endermitebattleaxe);
		
		//Shicks
		RegisterHelper.registerItem(woodshick);
		RegisterHelper.registerItem(stoneshick);
		RegisterHelper.registerItem(ironshick);
		RegisterHelper.registerItem(diamondshick);
		RegisterHelper.registerItem(goldshick);
		RegisterHelper.registerItem(sarliteshick);
		RegisterHelper.registerItem(flamiteshick);
		RegisterHelper.registerItem(clariteshick);
		RegisterHelper.registerItem(illiwonshick);
		RegisterHelper.registerItem(afnamiteshick);
		RegisterHelper.registerItem(endermiteshick);
		
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
		
		RegisterHelper.registerItem(endermitehelmet);
		RegisterHelper.registerItem(endermitechestplate);
		RegisterHelper.registerItem(endermiteleggings);
		RegisterHelper.registerItem(endermiteboots);
	}
	
	public static void registerRenders ()
	{
		
		//Items
		registerRender(woodswordhead);
		registerRender(woodaxehead);
		registerRender(woodshovelhead);
		registerRender(woodpickaxehead);
		
		registerRender(stoneswordhead);
		registerRender(stoneaxehead);
		registerRender(stoneshovelhead);
		registerRender(stonepickaxehead);
		
		registerRender(ironswordhead);
		registerRender(ironaxehead);
		registerRender(ironshovelhead);
		registerRender(ironpickaxehead);
		
		registerRender(clariteswordhead);
		registerRender(clariteaxehead);
		registerRender(clariteshovelhead);
		registerRender(claritepickaxehead);
		
		registerRender(diamondswordhead);
		registerRender(diamondaxehead);
		registerRender(diamondshovelhead);
		registerRender(diamondpickaxehead);
		
		registerRender(goldswordhead);
		registerRender(goldaxehead);
		registerRender(goldshovelhead);
		registerRender(goldpickaxehead);
		
		registerRender(sarliteswordhead);
		registerRender(sarliteaxehead);
		registerRender(sarliteshovelhead);
		registerRender(sarlitepickaxehead);
		
		registerRender(flamiteswordhead);
		registerRender(flamiteaxehead);
		registerRender(flamiteshovelhead);
		registerRender(flamitepickaxehead);
		
		registerRender(illiwonswordhead);
		registerRender(illiwonaxehead);
		registerRender(illiwonshovelhead);
		registerRender(illiwonpickaxehead);
		
		registerRender(afnamiteswordhead);
		registerRender(afnamiteaxehead);
		registerRender(afnamiteshovelhead);
		registerRender(afnamitepickaxehead);
		
		registerRender(endermiteswordhead);
		registerRender(endermiteaxehead);
		registerRender(endermiteshovelhead);
		registerRender(endermitepickaxehead);
		
		//Other
		registerRender(flitherclock);
		
		/**Drops & their derivatives**/
		registerRender(raptorclaw);
		registerRender(stickyraptorclaw);
		registerRender(creeptileeye);
		
		//Materials
		registerRender(sarliteingot);
		registerRender(flamiteingot);
		registerRender(claritegem);
		registerRender(illiwongem);
		registerRender(afnamitegem);
		registerRender(endermiteingot);
		
		registerRender(narriteingot);
		
		registerRender(endermiteshard);
		registerRender(endermitechunk);
		registerRender(refinedendermitechunk);
		registerRender(endermitequartz);
		registerRender(refinedendermitequartz);
		registerRender(rawcrawmite);
		registerRender(crawmite);
		registerRender(endermitegem);
		registerRender(refinedendermitegem);
		registerRender(enderrite);
		
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
		
		registerRender(endermiteshovel);
		registerRender(endermitepick);
		registerRender(endermiteaxe);
		registerRender(endermitehoe);
		
		//Swords
		registerRender(sarlitesword);
		registerRender(flamitesword);
		registerRender(claritesword);
		registerRender(illiwonsword);
		registerRender(afnamitesword);
		registerRender(endermitesword);
		
		/**Specials**/
		registerRender(crawmitesword);
		registerRender(doomspoon);
		
		registerRender(refinedendermitesword);
		registerRender(enderlitesword);
		registerRender(enderritesword);
		
		//Scythe Blades
		registerRender(woodblade);
		registerRender(stoneblade);
		registerRender(ironblade);
		registerRender(diamondblade);
		registerRender(goldblade);
		registerRender(sarliteblade);
		registerRender(flamiteblade);
		registerRender(clariteblade);
		registerRender(illiwonblade);
		registerRender(afnamiteblade);
		registerRender(endermiteblade);
		
		//Stealth Daggers
		registerRender(woodstealth);
		registerRender(stonestealth);
		registerRender(ironstealth);
		registerRender(diamondstealth);
		registerRender(goldstealth);
		registerRender(sarlitestealth);
		registerRender(flamitestealth);
		registerRender(claritestealth);
		registerRender(illiwonstealth);
		registerRender(afnamitestealth);
		registerRender(endermitestealth);
		
		//Falkions
		registerRender(woodfalkion);
		registerRender(stonefalkion);
		registerRender(ironfalkion);
		registerRender(diamondfalkion);
		registerRender(goldfalkion);
		registerRender(sarlitefalkion);
		registerRender(flamitefalkion);
		registerRender(claritefalkion);
		registerRender(illiwonfalkion);
		registerRender(afnamitefalkion);
		registerRender(endermitefalkion);
		
		//Battle Axes
		registerRender(woodbattleaxe);
		registerRender(stonebattleaxe);
		registerRender(ironbattleaxe);
		registerRender(diamondbattleaxe);
		registerRender(goldbattleaxe);
		registerRender(sarlitebattleaxe);
		registerRender(flamitebattleaxe);
		registerRender(claritebattleaxe);
		registerRender(illiwonbattleaxe);
		registerRender(afnamitebattleaxe);
		registerRender(endermitebattleaxe);
		
		//Shicks
		registerRender(woodshick);
		registerRender(stoneshick);
		registerRender(ironshick);
		registerRender(diamondshick);
		registerRender(goldshick);
		registerRender(sarliteshick);
		registerRender(flamiteshick);
		registerRender(clariteshick);
		registerRender(illiwonshick);
		registerRender(afnamiteshick);
		registerRender(endermiteshick);
		
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
		
		registerRender(endermitehelmet);
		registerRender(endermitechestplate);
		registerRender(endermiteleggings);
		registerRender(endermiteboots);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
