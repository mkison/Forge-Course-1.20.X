package net.hehe.mccourse.datagen;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.ALEXANDRITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                        ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_ORE.get(),
                        ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                        ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                        ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_STAIRS.get(),
                        ModBlocks.ALEXANDRITE_SLAB.get(),
                        ModBlocks.ALEXANDRITE_BUTTON.get(),
                        ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get(),
                        ModBlocks.ALEXANDRITE_FENCE.get(),
                        ModBlocks.ALEXANDRITE_FENCE_GATE.get(),
                        ModBlocks.ALEXANDRITE_WALL.get(),
                        ModBlocks.ALEXANDRITE_DOOR.get(),
                        ModBlocks.ALEXANDRITE_TRAPDOOR.get(),

                        ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(),
                        ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get());



        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                        ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_STAIRS.get(),
                        ModBlocks.ALEXANDRITE_SLAB.get(),
                        ModBlocks.ALEXANDRITE_BUTTON.get(),
                        ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get(),
                        ModBlocks.ALEXANDRITE_FENCE.get(),
                        ModBlocks.ALEXANDRITE_FENCE_GATE.get(),
                        ModBlocks.ALEXANDRITE_WALL.get(),
                        ModBlocks.ALEXANDRITE_DOOR.get(),
                        ModBlocks.ALEXANDRITE_TRAPDOOR.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                        ModBlocks.NETHER_ALEXANDRITE_ORE.get());

        this.tag(ModTags.Blocks.PAXEL_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(BlockTags.MINEABLE_WITH_HOE);

        this.tag(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL)
                .add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ALEXANDRITE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.ALEXANDRITE_WALL.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}