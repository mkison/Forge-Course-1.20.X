package net.hehe.mccourse.item;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.item.custom.FuelItem;
import net.hehe.mccourse.item.custom.MetalDetectorItem;
import net.hehe.mccourse.item.custom.ModFoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            ()-> new Item(new Item.Properties().fireResistant().stacksTo(64)));

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            ()-> new Item(new Item.Properties().fireResistant().stacksTo(64)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            ()-> new MetalDetectorItem(new Item.Properties().durability(512)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI).fireResistant()));

    public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
            ()-> new FuelItem(new Item.Properties(), 200));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
