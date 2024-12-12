package net.hehe.mccourse.modTabs;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BlockVariantsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BLOCK_VARIANTS_TAB = CREATIVE_MODE_TABS.register("block_variants_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get()))
                    .title(Component.translatable("creativetab.block_variants_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get());

                        output.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get());

                        output.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}