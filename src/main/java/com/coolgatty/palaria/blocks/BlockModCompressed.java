package com.coolgatty.palaria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockModCompressed extends Block
{
    private final MapColor mapColor;

    public BlockModCompressed(MapColor mapColorIn)
    {
        super(Material.iron);
        this.mapColor = mapColorIn;
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    public MapColor getMapColor(IBlockState state)
    {
        return this.mapColor;
    }
}