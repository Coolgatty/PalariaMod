package com.coolgatty.palaria.world;

import java.util.Random;

import com.coolgatty.palaria.Palaria;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSavanna;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDoublePlant;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry
{
    public static void preInit()
    {
    	initializeBiomes();
    	registerBiomes();
    }
    
    /** The biome height */
	public static final BiomeGenBase.Height skyforestHeight = new BiomeGenBase.Height(0.1F, 2F);
	public static final BiomeGenBase.Height bloodforestHeight = new BiomeGenBase.Height(0.1F, 0.2F);
	
	public static BiomeGenBase skyforest;
	public static BiomeGenBase bloodforest;

    public static void initializeBiomes()
    {
    	skyforest = (new BiomeGenSkyForest(Palaria.skyforestID).setColor(0x00FFEF).setTemperatureRainfall(0.5F, 0.1F).setHeight(skyforestHeight).setBiomeName("Sky Forest"));
    	bloodforest = (new BiomeGenBloodForest(Palaria.bloodforestID).setColor(0xB10000).setTemperatureRainfall(1.2F, 0.0F).setHeight(bloodforestHeight).setBiomeName("Blood Forest").setDisableRain());
    }

    public static void registerBiomes()
    {
    	//Sky Forest
        BiomeDictionary.registerBiomeType(skyforest, Type.FOREST, Type.HILLS, Type.WET);
        BiomeManager.addSpawnBiome(skyforest);
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(skyforest, 9));
        
        //Blood Forest
        BiomeDictionary.registerBiomeType(bloodforest, Type.FOREST, Type.DRY, Type.HOT, Type.SAVANNA);
        BiomeManager.addSpawnBiome(bloodforest);
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(bloodforest, 9));
    }
}