package me.fexlar.wawa.common.entity;

import me.fexlar.wawa.core.init.EntityInit;
import me.fexlar.wawa.core.init.ItemInit;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class WawaEntity extends Animal {
    public WawaEntity(EntityType<WawaEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals()
    {
        super.registerGoals();
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(8, new LeapAtTargetGoal(this, 0.3F));
        this.goalSelector.addGoal(9, new OcelotAttackGoal(this));
        this.goalSelector.addGoal(10, new BreedGoal(this, 0.8D));
        this.goalSelector.addGoal(11, new WaterAvoidingRandomStrollGoal(this, 0.8D, 1.0000001E-5F));
        this.goalSelector.addGoal(12, new LookAtPlayerGoal(this, Player.class, 10.0F));
        this.goalSelector.addGoal(13, new TemptGoal(this, 1.2D, Ingredient.of(ItemInit.TEST_ITEM.get()), false));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.ATTACK_DAMAGE, 3.0D);
    }

    protected SoundEvent getHurtSound(DamageSource p_28160_) {
        return SoundEvents.CAT_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.CAT_DEATH;
    }

    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob parent) {
        return EntityInit.WAWA_ENTITY.get().create(level);
    }


}
