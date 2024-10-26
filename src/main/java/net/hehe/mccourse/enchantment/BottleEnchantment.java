package net.hehe.mccourse.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.Blocks;

public class BottleEnchantment extends Enchantment {
    protected BottleEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide()) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();

            if (pLevel == 1) {
                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);


            }

            if (pLevel == 2) {

                EntityType.END_CRYSTAL.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.END_CRYSTAL.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.END_CRYSTAL.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.END_CRYSTAL.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.END_CRYSTAL.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);

            }

            if (pLevel == 3) {
                ThrownPotion damagePotion = new ThrownPotion(EntityType.POTION, level);
                damagePotion.setItem(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), Potions.STRONG_HARMING));
                damagePotion.moveTo(position, 0, 0);
                level.addFreshEntity(damagePotion);

                ThrownPotion weaknessPotion = new ThrownPotion(EntityType.POTION, level);
                weaknessPotion.setItem(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), Potions.WEAKNESS));
                weaknessPotion.moveTo(position, 0, 0);
                level.addFreshEntity(weaknessPotion);

                ThrownPotion poisonPotion = new ThrownPotion(EntityType.POTION, level);
                poisonPotion.setItem(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), Potions.POISON));
                poisonPotion.moveTo(position, 0, 0);
                level.addFreshEntity(poisonPotion);
                }

            if (pLevel == 4) {
                BlockPos anvilPosition = position.above(2);

                FallingBlockEntity anvil = FallingBlockEntity.fall(
                        level,
                        anvilPosition,
                        Blocks.ANVIL.defaultBlockState()
                );

                level.addFreshEntity(anvil);
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }
}
