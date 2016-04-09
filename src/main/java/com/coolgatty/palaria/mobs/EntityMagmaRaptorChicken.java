package com.coolgatty.palaria.mobs;

import com.coolgatty.palaria.items.ItemMod;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityMagmaRaptorChicken extends EntityMob
{
    
    public boolean field_70885_d = false;
    public float field_70886_e = 0.0F;
    public float destPos = 0.0F;
    public float field_70884_g;
    public float field_70888_h;
    public float field_70889_i = 1.0F;
	private double moveSpeed;


    public EntityMagmaRaptorChicken(World par1World)
    {
    	super(par1World);
        this.moveSpeed = 1.0D;
        this.setSize(0.5F, 1.2F);
        this.getNavigator();
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityCowasaurus.class, 15.0F, 1.0D, 1.2D));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityWolf.class, 10.0F, 1.0D, 1.2D));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityChicken.class, this.moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed - 0.2D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityChicken.class, true));
        this.experienceValue = 35;
        this.isImmuneToFire = true;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.50D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(44.0D);
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
    	float f = 2.0F;
    	float d = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        
    	boolean dmg = entity.attackEntityFrom(DamageSource.causeMobDamage(this).setDamageBypassesArmor(), f) && entity.attackEntityFrom(DamageSource.causeMobDamage(this), d);
    
        return dmg;
    }
    
    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.drown, 1);
        }
        
        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        if (this.worldObj.isRemote)
        {
            if (this.rand.nextInt(24) == 0 && !this.isSilent())
            {
                this.worldObj.playSound(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D, "fire.fire", 1.0F + this.rand.nextFloat(), this.rand.nextFloat() * 0.7F + 0.3F, false);
            }

            for (int i = 0; i < 2; ++i)
            {
                this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }

        super.onLivingUpdate();
    }


    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "palaria:mob.raptorchicken.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "palaria:mob.raptorchicken.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.blaze.death";
    }

    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.chicken.step", 0.15F, 1.0F);
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
        int f = this.rand.nextInt(2);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Items.magma_cream, 1);
        }
        
        for (int k = 0; k < f; ++k)
        {
            this.dropItem(Items.blaze_rod, 1);
        }
        
        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Items.cooked_chicken, 1);
        }
    }
    
    protected void dropRareDrop()
    {
        switch (this.rand.nextInt(2))
        {
            case 0:
                this.dropItem(ItemMod.rawcrawmite, 1);
                break;
        }
    }
    
    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender(float p_70070_1_)
    {
        return 15728880;
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float p_70013_1_)
    {
        return 1.0F;
    }
    
    public boolean isBurning()
    {
        return this.func_70845_n();
    }

    /**
     * Drop 0-2 items of this living's type
     */


    public boolean func_70845_n()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void func_70844_e(boolean p_70844_1_)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(16);

        if (p_70844_1_)
        {
            b0 = (byte)(b0 | 1);
        }
        else
        {
            b0 &= -2;
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(b0));
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }
}
