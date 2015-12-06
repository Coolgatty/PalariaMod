package com.coolgatty.palaria.blocks;

import java.util.List;

import com.coolgatty.palaria.blocks.metahelp.IMetaBlockName;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModPlanks extends Block implements IMetaBlockName
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockModPlanks.EnumType.class);
    private static final String __OBFID = "CL_00002082";

    public BlockModPlanks()
    {
        super(Material.wood);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockModPlanks.EnumType.REDWOOD));
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Get the damage value that this Block should drop
     */
    public int damageDropped(IBlockState state)
    {
        return ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        BlockModPlanks.EnumType[] aenumtype = BlockModPlanks.EnumType.values();
        int i = aenumtype.length;

        for (int j = 0; j < i; ++j)
        {
            BlockModPlanks.EnumType enumtype = aenumtype[j];
            list.add(new ItemStack(itemIn, 1, enumtype.getMetadata()));
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, BlockModPlanks.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT});
    }

    public static enum EnumType implements IStringSerializable
    {
        REDWOOD(0, "redwood");
        private static final BlockModPlanks.EnumType[] META_LOOKUP = new BlockModPlanks.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;

        private static final String __OBFID = "CL_00002081";

        private EnumType(int meta, String name)
        {
            this(meta, name, name);
        }

        private EnumType(int meta, String name, String unlocalizedName)
        {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        public String toString()
        {
            return this.name;
        }

        public static BlockModPlanks.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName()
        {
            return this.name;
        }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }

        static
        {
            BlockModPlanks.EnumType[] var0 = values();
            int var1 = var0.length;

            for (int var2 = 0; var2 < var1; ++var2)
            {
                BlockModPlanks.EnumType var3 = var0[var2];
                META_LOOKUP[var3.getMetadata()] = var3;
            }
        }
    }
    
    @Override
    public String getSpecialName(ItemStack stack) 
    {
        switch (stack.getItemDamage())
        {
        case 0 :
        	return BlockModPlanks.EnumType.REDWOOD.getName();
        }
		return null;
    }
}