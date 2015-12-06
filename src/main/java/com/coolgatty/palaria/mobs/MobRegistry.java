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
import com.coolgatty.palaria.world.BiomeRegistry;

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
		EntityRegistry.registerModEntity(EntityCreeptile.class, "Creeptile", Palaria.creeptileID, Reference.MODID, 80, 3, true, 0x23DE55, 0x000000);
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
				BiomeGenBase.taigaHills,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//Cowasaurus
		EntityRegistry.registerModEntity(EntityCowasaurus.class, "Cowasaurus", Palaria.cowasaurusID, Reference.MODID, 100, 3, true, 0x4F3D2B, 0x8C8282);
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
				BiomeGenBase.taiga,
				BiomeRegistry.bloodforest);
		
		//Raptor Chicken
		EntityRegistry.registerModEntity(EntityRaptorChicken.class, "RaptorChicken", Palaria.raptorchickenID, Reference.MODID, 100, 3, true, 0xCFB8B8, 0xD11515);
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
				BiomeGenBase.taigaHills,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//Magma Raptor Chicken
		EntityRegistry.registerModEntity(EntityMagmaRaptorChicken.class, "MagmaRaptorChicken", Palaria.magmaraptorchickenID, Reference.MODID, 100, 3, true, 0xFFD000, 0xD60400);
		EntityRegistry.addSpawn(EntityMagmaRaptorChicken.class, 5, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.hell);
		
		//Ender Raptor Chicken
		EntityRegistry.registerModEntity(EntityEnderRaptorChicken.class, "EnderRaptorChicken", Palaria.enderraptorchickenID, Reference.MODID, 100, 3, true, 0x000000, 0xD11515);
		EntityRegistry.addSpawn(EntityEnderRaptorChicken.class, 3, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		
		//Stone Endermite
		EntityRegistry.registerModEntity(EntityStoneEndermite.class, "StoneEndermite", Palaria.stoneendermiteID, Reference.MODID, 100, 3, true, 0x000000, 0xBABABA);
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
				BiomeGenBase.taigaHills,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//End Endermite
		EntityRegistry.registerModEntity(EntityEndEndermite.class, "EndEndermite", Palaria.endendermiteID, Reference.MODID, 100, 3, true, 0x000000, 0xD4D40F);
		EntityRegistry.addSpawn(EntityEndEndermite.class, 2, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		
		//Ender Walker
		EntityRegistry.registerModEntity(EntityEnderWalker.class, "EnderWalker", Palaria.enderwalkerID, Reference.MODID, 50, 5, true, 0x000000, 0xA00000);
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
				BiomeGenBase.sky,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//Nimatin
		EntityRegistry.registerModEntity(EntityNimatin.class, "Nimatin", Palaria.nimatinID, Reference.MODID, 100, 3, true, 0xD1AB00, 0x6E6E6E);
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
	}
}
