package net.hehe.mccourse.item.custom;


import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModArmorMaterials.ALEXANDRITE, new MobEffectInstance(MobEffects.ABSORPTION, 200, 1))
                    .build();

    public ModArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        if(!level.isClientSide() && hasFullSuitOfArmorOn(player)) {
            evaluateArmorEffects(player);
        }
    }

    private void evaluateArmorEffects(Player player) {
        for(Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapEffect = entry.getValue();

            if(hasPlayerCorrectArmorOn(mapArmorMaterial, player)) {
                addEffectToPlayer(player, mapEffect);
            }
        }
    }

    private void addEffectToPlayer(Player player, MobEffectInstance mapEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapEffect.getEffect());

        if(!hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapEffect.getEffect(),
                    mapEffect.getDuration(), mapEffect.getAmplifier()));
        }
    }

    private boolean hasPlayerCorrectArmorOn(ArmorMaterial mapArmorMaterial, Player player) {
        for(ItemStack armorStack : player.getArmorSlots()) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(3).getItem());

        return boots.getMaterial() == mapArmorMaterial && leggings.getMaterial() == mapArmorMaterial
                && chestplate.getMaterial() == mapArmorMaterial && helmet.getMaterial() == mapArmorMaterial;
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && !helmet.isEmpty();
    }
}

//import com.google.common.collect.ImmutableMap;
//import net.minecraft.world.effect.MobEffectInstance;
//import net.minecraft.world.effect.MobEffects;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ArmorItem;
//import net.minecraft.world.item.ArmorMaterial;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//import net.minecraftforge.event.TickEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.common.MinecraftForge;
//
//import java.util.Map;
//
//public class ModArmorItem extends ArmorItem {
//    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP = (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
//            .put(ModArmorMaterials.ALEXANDRITE, new MobEffectInstance(MobEffects.INVISIBILITY, 200, 2))
//            .build();
//
//    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
//        super(pMaterial, pType, pProperties);
//        MinecraftForge.EVENT_BUS.register(this);
//    }
//
//    @SubscribeEvent
//    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
//        Player player = event.player;
//        Level level = player.level();
//
//        if (!level.isClientSide()) {
//            ModArmorItem armorItem = new ModArmorItem(ModArmorMaterials.ALEXANDRITE, ArmorItem.Type.CHESTPLATE, new Properties());
//
//            if (armorItem.hasFullSuitOfArmorOn(player)) {
//                armorItem.evaluateArmorEffects(player);
//            }
//        }
//    }
//
//    private void evaluateArmorEffects(Player player) {
//        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
//            ArmorMaterial mapArmorMaterial = entry.getKey();
//            MobEffectInstance mapEffect = entry.getValue();
//
//            if (hasPlayerCorrectArmorOn(mapArmorMaterial, player)) {
//                addEffectToPlayer(player, mapEffect);
//            }
//        }
//    }
//
//    private void addEffectToPlayer(Player player, MobEffectInstance mapEffect) {
//        player.addEffect(new MobEffectInstance(mapEffect.getEffect(), mapEffect.getDuration(), mapEffect.getAmplifier()));
//    }
//
//    private boolean hasPlayerCorrectArmorOn(ArmorMaterial armorMaterial, Player player) {
//        for (ItemStack armorStack : player.getArmorSlots()) {
//            if (!(armorStack.getItem() instanceof ArmorItem)) {
//                return false;
//            }
//        }
//
//        ArmorItem boots = (ArmorItem) player.getInventory().getArmor(0).getItem();
//        ArmorItem leggings = (ArmorItem) player.getInventory().getArmor(1).getItem();
//        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmor(2).getItem();
//        ArmorItem helmet = (ArmorItem) player.getInventory().getArmor(3).getItem();
//
//        return boots.getMaterial() == armorMaterial && leggings.getMaterial() == armorMaterial && chestplate.getMaterial() == armorMaterial && helmet.getMaterial() == armorMaterial;
//    }
//
//    private boolean hasFullSuitOfArmorOn(Player player) {
//        ItemStack boots = player.getInventory().getArmor(0);
//        ItemStack leggings = player.getInventory().getArmor(1);
//        ItemStack chestplate = player.getInventory().getArmor(2);
//        ItemStack helmet = player.getInventory().getArmor(3);
//
//        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && !helmet.isEmpty();
//    }
//}