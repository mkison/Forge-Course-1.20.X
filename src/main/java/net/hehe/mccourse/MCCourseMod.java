package net.hehe.mccourse;

import com.mojang.logging.LogUtils;
import net.hehe.mccourse.enchantment.ModEnchantments;
import net.hehe.mccourse.item.custom.ModItemProperties;
import net.hehe.mccourse.modTabs.BlockVariantsTab;
import net.hehe.mccourse.modTabs.CourseTab;
import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.item.ModItems;
import net.hehe.mccourse.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.MOD_ID)
public class MCCourseMod {
    public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MCCourseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CourseTab.register(modEventBus);
        BlockVariantsTab.register(modEventBus);

        ModEnchantments.register(modEventBus);
        ModSounds.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.KOHLRABI.get(), 0.40f);
            ComposterBlock.COMPOSTABLES.put(ModItems.KOHLRABI_SEEDS.get(), 0.35f);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SNAPDRAGON.getId(), ModBlocks.POTTED_SNAPDRAGON);
        });

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ALEXANDRITE);
            event.accept(ModItems.RAW_ALEXANDRITE);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ALEXANDRITE_BLOCK);
            event.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK);
        }
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();
            });
        }
    }
}