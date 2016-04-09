package com.coolgatty.palaria.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWIP_1 extends EntityMob
{
    /** Random offset used in floating behaviour */
    private float heightOffset = 1.0F;
    /** ticks until heightOffset is randomized */
    private int heightOffsetUpdateTime;
	private double moveSpeed;

    public EntityWIP_1(World worldIn)
    {
        super(worldIn);
        this.moveSpeed = 1.0D;
        this.experienceValue = 30;
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed - 0.2D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(14.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(48.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80D);
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
    	float f = 2.0F;
    	float d = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        
    	boolean dmg = entity.attackEntityFrom(DamageSource.causeMobDamage(this).setDamageBypassesArmor(), f) && entity.attackEntityFrom(DamageSource.causeMobDamage(this), d);
    
        return dmg;
    }

    public void updateAITasks()
    {
        if (this.getMoveHelper().isUpdating())
        {
            double d0 = this.getMoveHelper().getSpeed();

            if (d0 == 0.0D)
            {
                this.setSneaking(false);
                this.setSprinting(false);
            }
            else if (d0 >= 1.2D)
            {
                this.setSneaking(false);
                this.setSprinting(true);
            }
            else if (d0 <= 1.2D)
            {
                this.setSneaking(true);
                this.setSprinting(false);
            }
            else
            {
                this.setSneaking(false);
                this.setSprinting(false);
            }
        }
        else
        {
            this.setSneaking(false);
            this.setSprinting(false);
        }
    }
    
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.blaze.breathe";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.blaze.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.blaze.death";
    }

    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender(float partialTicks)
    {
        return 7864440;
    }
    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float partialTicks)
    {
        return 1.0F;
    }


    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {        
 	
        if (this.worldObj.isRemote)
        {
            if (this.rand.nextInt(24) == 0 && !this.isSilent())
            {
                this.worldObj.playSound(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D, "fire.fire", 1.0F + this.rand.nextFloat(), this.rand.nextFloat() * 0.7F + 0.3F, false);
            }

            for (int i = 0; i < 2; ++i)
            {
                this.worldObj.spawnParticle(EnumParticleTypes.REDSTONE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }

        super.onLivingUpdate();
    } 

    protected Item getDropItem()
    {
        return Items.blaze_rod;
    }

    /**
     * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
     */


    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        if (p_70628_1_)
        {
            int i = this.rand.nextInt(2 + p_70628_2_);

            for (int j = 0; j < i; ++j)
            {
                this.dropItem(Items.blaze_rod, 1);
            }
        }
    }
}