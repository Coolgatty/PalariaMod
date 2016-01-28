package com.coolgatty.palaria.mobs.entityAI;

import com.coolgatty.palaria.mobs.EntityCreeptile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAICreeptileSwell extends EntityAIBase
{
    /** The creeper that is swelling. */
    EntityCreeptile swellingCreeptile;
    /** The creeper's attack target. This is used for the changing of the creeper's state. */
    EntityLivingBase creeperAttackTarget;

    public EntityAICreeptileSwell(EntityCreeptile entitycreeperIn)
    {
        this.swellingCreeptile = entitycreeperIn;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        EntityLivingBase entitylivingbase = this.swellingCreeptile.getAttackTarget();
        return this.swellingCreeptile.getCreeptileState() > 0 || entitylivingbase != null && this.swellingCreeptile.getDistanceSqToEntity(entitylivingbase) < 9.0D;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.swellingCreeptile.getNavigator().clearPathEntity();
        this.creeperAttackTarget = this.swellingCreeptile.getAttackTarget();
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.creeperAttackTarget = null;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        if (this.creeperAttackTarget == null)
        {
            this.swellingCreeptile.setCreeptileState(-1);
        }
        else if (this.swellingCreeptile.getDistanceSqToEntity(this.creeperAttackTarget) > 49.0D)
        {
            this.swellingCreeptile.setCreeptileState(-1);
        }
        else if (!this.swellingCreeptile.getEntitySenses().canSee(this.creeperAttackTarget))
        {
            this.swellingCreeptile.setCreeptileState(-1);
        }
        else
        {
            this.swellingCreeptile.setCreeptileState(1);
        }
    }
}