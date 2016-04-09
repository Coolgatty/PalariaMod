package com.coolgatty.palaria.mobs;


import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityCowasaurus extends EntityMob
{
    private final EntityAIBreakDoor breakDoor = new EntityAIBreakDoor(this);
    private boolean field_146076_bu = false;
	private double moveSpeed;
    
    public EntityCowasaurus(World par1World)
    {
        super(par1World);
        this.moveSpeed = 1.0D;
        this.setSize(1.5F, 2.2F);
        ((PathNavigateGround)this.getNavigator()).setBreakDoors(true);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater(true);
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityEnderWalker.class, 6.0F, this.moveSpeed, this.moveSpeed + 0.2D));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, false));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityRaptorChicken.class, this.moveSpeed, true));
        this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntitySkeleton.class, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntityZombie.class, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntitySpider.class, this.moveSpeed, false));
        this.tasks.addTask(7, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(8, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
        this.tasks.addTask(9, new EntityAIWander(this, this.moveSpeed - 0.2D));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(11, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityRaptorChicken.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySpider.class, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.experienceValue = 70;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.40D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.4D);
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
    	float f = 3.0F;
    	float d = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        
    	boolean dmg = entity.attackEntityFrom(DamageSource.causeMobDamage(this).setDamageBypassesArmor(), f) && entity.attackEntityFrom(DamageSource.causeMobDamage(this), d);
    
        return dmg;
    }
    
    public boolean func_146072_bX()
    {
        return this.field_146076_bu;
    }

    public void func_146070_a(boolean p_146070_1_)
    {
        if (this.field_146076_bu != p_146070_1_)
        {
            this.field_146076_bu = p_146070_1_;

            if (p_146070_1_)
            {
                this.tasks.addTask(1, this.breakDoor);
            }
            else
            {
                this.tasks.removeTask(this.breakDoor);
            }
        }
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
    

    	 
    
    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "palaria:mob.cowasaurus.say";
    }
    
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "palaria:mob.cowasaurus.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "palaria:mob.cowasaurus.death";
    }
    
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
    	playSound("palaria:mob.cowasaurus.step", 1.0F, 1.0F);
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Items.leather, 5);
        }

        var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_beef, 3);
            }
            else
            {
                this.dropItem(Items.beef, 3);
            }
        }
    }
}