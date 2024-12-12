package net.hehe.mccourse.datagen.loot;

import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.block.custom.KohlrabiCropBlock;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_LAMP.get());

        this.dropSelf(ModBlocks.ALEXANDRITE_STAIRS.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_BUTTON.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_FENCE.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_WALL.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_TRAPDOOR.get());

        this.add(ModBlocks.ALEXANDRITE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ALEXANDRITE_SLAB.get()));
        this.add(ModBlocks.ALEXANDRITE_DOOR.get(),
                block -> createDoorTable(ModBlocks.ALEXANDRITE_DOOR.get()));

        this.add(ModBlocks.ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));


        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.KOHLRABI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(KohlrabiCropBlock.AGE, 6));
        this.add(ModBlocks.KOHLRABI_CROP.get(), this.createCropDrops(ModBlocks.KOHLRABI_CROP.get(),
                ModItems.KOHLRABI.get(), ModItems.KOHLRABI_SEEDS.get(), lootitemcondition$builder1));

        this.dropSelf(ModBlocks.SNAPDRAGON.get());
        this.add(ModBlocks.POTTED_SNAPDRAGON.get(),
        createPotFlowerItemTable(ModBlocks.POTTED_SNAPDRAGON.get()));

        this.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get()));
        this.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get()));

        this.dropSelf(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get());

        this.dropSelf(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
