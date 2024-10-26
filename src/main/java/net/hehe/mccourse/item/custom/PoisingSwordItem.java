package net.hehe.mccourse.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PoisingSwordItem extends SwordItem {
    public PoisingSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 400,2), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 600,2), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200,2), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400,2), player);
        }
        return super.onLeftClickEntity(stack, player, entity);
    }
}
