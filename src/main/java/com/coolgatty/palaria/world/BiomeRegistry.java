package com.coolgatty.palaria.world;

import java.util.Random;

import com.coolgatty.palaria.Palaria;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry
{
    public static void init()
    {
    	initializeBiomes();
    	registerBiomes();
    }
    
    /** The biome height */
	public static final BiomeGenBase.Height skyforestHeight = new BiomeGenBase.Height(0.1F, 2F);
	public static final BiomeGenBase.Height bloodforestHeight = new BiomeGenBase.Height(0.1F, 0.2F);
	
	public static BiomeGenBase skyforestBiome;
	public static BiomeGenBase bloodforestBiome;

    public static void initializeBiomes()
    {
    	skyforestBiome = (new BiomeGenSkyForest(Palaria.skyforestBiomeID).setColor(0x00FFEF).setTemperatureRainfall(0.5F, 0.1F).setHeight(skyforestHeight).setBiomeName("Sky Forest"));
    	bloodforestBiome = (new BiomeGenBloodForest(Palaria.bloodforestBiomeID).setColor(0xB10000).setTemperatureRainfall(1.0F, 0.0F).setHeight(bloodforestHeight).setBiomeName("Blood Forest"));
    }

    public static void registerBiomes()
    {
    	//Sky Forest
        BiomeDictionary.registerBiomeType(skyforestBiome, Type.FOREST, Type.HILLS, Type.WET);
        BiomeManager.addSpawnBiome(skyforestBiome);
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(skyforestBiome, 10));
        
        //Blood Forest
        BiomeDictionary.registerBiomeType(bloodforestBiome, Type.FOREST, Type.DRY, Type.HOT, Type.SAVANNA);
        BiomeManager.addSpawnBiome(bloodforestBiome);
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(bloodforestBiome, 10));
    }
}