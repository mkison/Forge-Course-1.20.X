package net.hehe.mccourse.item;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.item.custom.*;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
            ()-> new SwordItem(ModToolTiers.ALEXANDRITE, 2, 5, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.ALEXANDRITE, 0, 10, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe",
            ()-> new AxeItem(ModToolTiers.ALEXANDRITE, 3, 10, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
            ()-> new ShovelItem(ModToolTiers.ALEXANDRITE, -1, 10, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe",
            ()-> new HoeItem(ModToolTiers.ALEXANDRITE, -3, 10, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ALEXANDRITE_PAXEL = ITEMS.register("alexandrite_paxel",
            ()-> new PaxelItem(ModToolTiers.ALEXANDRITE, -3, 10, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ALEXANDRITE_HAMMER = ITEMS.register("alexandrite_hammer",
            ()-> new HammerItem(ModToolTiers.ALEXANDRITE, -3, 10, new Item.Properties().durability(256)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
