package com.coolgatty.palaria.world;

import java.util.Random;

import com.coolgatty.palaria.blocks.BlockMod;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenOres implements IWorldGenerator
{

	    @Override
	    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	    {
	        switch (world.provider.getDimensionId()) 
	        {
	        	case -1 : 
	        		generateNether(world, random, chunkX*16, chunkZ*16);
	        		break;
	        	
	            case 0 : 
	            	generateSurface(world, random, chunkX*16, chunkZ*16);
	            	break;
	            	
	            case 1 :
	            	break;
	        }
	    }

	    private void generateSurface(World world, Random random, int x, int z) 
	    {
	    	for (int i = 0; i < 3; i++) 
	        {
	            int Xcoord = x + random.nextInt(24);
	            int Zcoord = z + random.nextInt(24);
	            int Ycoord = random.nextInt(30);

	            new WorldGenMinable(BlockMod.clariteore.getDefaultState(), 5).generate(world,random, new BlockPos(Xcoord,Ycoord,Zcoord));
	        }
	    	
	        for (int i = 0; i < 2; i++) 
	        {
	            int Xcoord = x + random.nextInt(20);
	            int Zcoord = z + random.nextInt(20);
	            int Ycoord = random.nextInt(25);

	            new WorldGenMinable(BlockMod.sarliteore.getDefaultState(), 4).generate(world,random, new BlockPos(Xcoord,Ycoord,Zcoord));
	        }

	        for (int i = 0; i < 2; i++) 
	        {
	            int Xcoord = x + random.nextInt(28);
	            int Zcoord = z + random.nextInt(28);
	            int Ycoord = random.nextInt(18);

	            new WorldGenMinable(BlockMod.illiwonore.getDefaultState(), 3).generate(world,random, new BlockPos(Xcoord,Ycoord,Zcoord));
	        }
	        
	        for (int i = 0; i < 2; i++) 
	        {
	            int Xcoord = x + random.nextInt(26);
	            int Zcoord = z + random.nextInt(26);
	            int Ycoord = random.nextInt(18);

	            new WorldGenMinable(BlockMod.afnamiteore.getDefaultState(), 3).generate(world,random, new BlockPos(Xcoord,Ycoord,Zcoord));
	        }
	    }
	    
	    private void generateNether(World world, Random random, int x, int z) 
	    {
	        for (int i = -1; i < 5; i++) 
	        {
	            int Xcoord = x + random.nextInt(16);
	            int Zcoord = z + random.nextInt(16);
	            int Ycoord = random.nextInt(128);

	            new WorldGenMinable(BlockMod.flamiteore.getDefaultState(), 4, BlockHelper.forBlock(Blocks.netherrack)).generate(world,random, new BlockPos(Xcoord,Ycoord,Zcoord));
	        }
	    }
	    
	    public static void init()
	    {
	        registerWorldGen();
	    }

	    public static void registerWorldGen() 
	    {
	        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
	    }
}
