package com.coolgatty.palaria.mobs;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.mobs.render.RenderCowasaurus;
import com.coolgatty.palaria.mobs.render.RenderCreeptile;
import com.coolgatty.palaria.mobs.render.RenderEndEndermite;
import com.coolgatty.palaria.mobs.render.RenderEnderRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderEnderWalker;
import com.coolgatty.palaria.mobs.render.RenderMagmaRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderNimatin;
import com.coolgatty.palaria.mobs.render.RenderRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderStoneEndermite;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	public static void registerEntity()
	{
		//Creeptile
		EntityRegistry.registerModEntity(EntityCreeptile.class, "Creeptile", Palaria.creeptileID, Reference.MODID, 80, 3, true);
				EntityRegistry.addSpawn(EntityCreeptile.class, 10, 2, 3, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills);
		EntityList.addMapping(EntityCreeptile.class, "Creeptile", Palaria.creeptileID, 0x23DE55, 0x000000);
		
		//Cowasaurus
		EntityRegistry.registerModEntity(EntityCowasaurus.class, "Cowasaurus", Palaria.cowasaurusID, Reference.MODID, 100, 3, true);
				EntityRegistry.addSpawn(EntityCowasaurus.class, 5, 2, 3, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach,
				BiomeGenBase.forest,
				BiomeGenBase.jungle,
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga);
		EntityList.addMapping(EntityCowasaurus.class, "Cowasaurus", Palaria.cowasaurusID, 0x4F3D2B, 0x8C8282);
		
		//Raptor Chicken
		EntityRegistry.registerModEntity(EntityRaptorChicken.class, "RaptorChicken", Palaria.raptorchickenID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityRaptorChicken.class, 12, 4, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills);
		EntityList.addMapping(EntityRaptorChicken.class, "RaptorChicken", Palaria.raptorchickenID, 0xCFB8B8, 0xD11515);
		
		//Magma Raptor Chicken
		EntityRegistry.registerModEntity(EntityMagmaRaptorChicken.class, "MagmaRaptorChicken", Palaria.magmaraptorchickenID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityMagmaRaptorChicken.class, 5, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.hell);
		EntityList.addMapping(EntityMagmaRaptorChicken.class, "MagmaRaptorChicken", Palaria.magmaraptorchickenID, 0xFFD000, 0xD60400);
		
		//Ender Raptor Chicken
		EntityRegistry.registerModEntity(EntityEnderRaptorChicken.class, "EnderRaptorChicken", Palaria.enderraptorchickenID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityEnderRaptorChicken.class, 3, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		EntityList.addMapping(EntityEnderRaptorChicken.class, "EnderRaptorChicken", Palaria.enderraptorchickenID, 0x000000, 0xD11515);
		
		//Stone Endermite
		EntityRegistry.registerModEntity(EntityStoneEndermite.class, "StoneEndermite", Palaria.stoneendermiteID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityStoneEndermite.class, 2, 1, 2, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills);
		EntityList.addMapping(EntityStoneEndermite.class, "StoneEndermite", Palaria.stoneendermiteID, 0x000000, 0xBABABA);
		
		//End Endermite
		EntityRegistry.registerModEntity(EntityEndEndermite.class, "EndEndermite", Palaria.endendermiteID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityEndEndermite.class, 2, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		EntityList.addMapping(EntityEndEndermite.class, "EndEndermite", Palaria.endendermiteID, 0x000000, 0xD4D40F);
		
		//Ender Walker
		EntityRegistry.registerModEntity(EntityEnderWalker.class, "EnderWalker", Palaria.enderwalkerID, Reference.MODID, 50, 5, true);
		EntityRegistry.addSpawn(EntityEnderWalker.class, 2, 1, 2, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills,
				BiomeGenBase.sky);
		EntityList.addMapping(EntityEnderWalker.class, "EnderWalker", Palaria.enderwalkerID, 0x000000, 0xA00000);
		
		//Nimatin
		EntityRegistry.registerModEntity(EntityNimatin.class, "Nimatin", Palaria.nimatinID, Reference.MODID, 100, 3, true);
		/**		EntityRegistry.addSpawn(EntityNimatin.class, 1, 1, 1, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills);				**/
		EntityList.addMapping(EntityNimatin.class, "Nimatin", Palaria.nimatinID, 0xD1AB00, 0x6E6E6E);
	}
}
