package net.hehe.mccourse.datagen;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.block.custom.AlexandriteLampBlock;
import net.hehe.mccourse.block.custom.KohlrabiCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MCCourseMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ALEXANDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_ALEXANDRITE_BLOCK);

        blockWithItem(ModBlocks.ALEXANDRITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE);
        blockWithItem(ModBlocks.END_STONE_ALEXANDRITE_ORE);
        blockWithItem(ModBlocks.NETHER_ALEXANDRITE_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock((StairBlock) ModBlocks.ALEXANDRITE_STAIRS.get(), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.ALEXANDRITE_SLAB.get()), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.ALEXANDRITE_BUTTON.get(), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));

        fenceBlock((FenceBlock) ModBlocks.ALEXANDRITE_FENCE.get(), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.ALEXANDRITE_FENCE_GATE.get(), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.ALEXANDRITE_WALL.get(), blockTexture(ModBlocks.ALEXANDRITE_BLOCK.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.ALEXANDRITE_DOOR.get(), modLoc("block/alexandrite_door_bottom"), modLoc("block/alexandrite_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)ModBlocks.GLASS_DOOR.get(),
                mcLoc("block/glass"),
                mcLoc("block/glass"),
                "cutout");

        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ALEXANDRITE_TRAPDOOR.get(), modLoc("block/alexandrite_trapdoor"), true, "cutout");

        blockItem(ModBlocks.ALEXANDRITE_STAIRS);
        blockItem(ModBlocks.ALEXANDRITE_SLAB);
        blockItem(ModBlocks.ALEXANDRITE_PRESSURE_PLATE);
        blockItem(ModBlocks.ALEXANDRITE_FENCE_GATE);
        blockItem(ModBlocks.ALEXANDRITE_TRAPDOOR, "_bottom");

        customLamp();

        makeCrop(((KohlrabiCropBlock) ModBlocks.KOHLRABI_CROP.get()), "kohlrabi_stage", "kohlrabi_stage");

        simpleBlock(ModBlocks.SNAPDRAGON.get(),
                models().cross(blockTexture(ModBlocks.SNAPDRAGON.get()).getPath(), blockTexture(ModBlocks.SNAPDRAGON.get())).renderType("cutout"));


        slabBlock(((SlabBlock) ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.WHITE_GLAZED_TERRACOTTA), blockTexture(Blocks.WHITE_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.ORANGE_GLAZED_TERRACOTTA), blockTexture(Blocks.ORANGE_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.MAGENTA_GLAZED_TERRACOTTA), blockTexture(Blocks.MAGENTA_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), blockTexture(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.YELLOW_GLAZED_TERRACOTTA), blockTexture(Blocks.YELLOW_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.LIME_GLAZED_TERRACOTTA), blockTexture(Blocks.LIME_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.PINK_GLAZED_TERRACOTTA), blockTexture(Blocks.PINK_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.GRAY_GLAZED_TERRACOTTA), blockTexture(Blocks.GRAY_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), blockTexture(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.CYAN_GLAZED_TERRACOTTA), blockTexture(Blocks.CYAN_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.PURPLE_GLAZED_TERRACOTTA), blockTexture(Blocks.PURPLE_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.BLUE_GLAZED_TERRACOTTA), blockTexture(Blocks.BLUE_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.BROWN_GLAZED_TERRACOTTA), blockTexture(Blocks.BROWN_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.GREEN_GLAZED_TERRACOTTA), blockTexture(Blocks.GREEN_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.RED_GLAZED_TERRACOTTA), blockTexture(Blocks.RED_GLAZED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.BLACK_GLAZED_TERRACOTTA), blockTexture(Blocks.BLACK_GLAZED_TERRACOTTA));


        blockItem(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);

        stairsBlock((StairBlock) ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.WHITE_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.ORANGE_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.MAGENTA_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.YELLOW_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIME_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PINK_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GRAY_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.CYAN_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PURPLE_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLUE_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BROWN_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GREEN_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.RED_GLAZED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLACK_GLAZED_TERRACOTTA));

        blockItem(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);

        wallBlock((WallBlock) ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.WHITE_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.ORANGE_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.MAGENTA_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.YELLOW_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIME_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.PINK_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.GRAY_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.CYAN_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.PURPLE_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLUE_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.BROWN_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.GREEN_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.RED_GLAZED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLACK_GLAZED_TERRACOTTA));


    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((KohlrabiCropBlock) block).getAgeProperty()),
                new ResourceLocation(MCCourseMod.MOD_ID, "block/" + textureName + state.getValue(((KohlrabiCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void customLamp() {
        getVariantBuilder(ModBlocks.ALEXANDRITE_LAMP.get()).forAllStates(state -> {
            if(state.getValue(AlexandriteLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("alexandrite_lamp_on",
                        new ResourceLocation(MCCourseMod.MOD_ID, "block/" + "alexandrite_lamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("alexandrite_lamp_off",
                        new ResourceLocation(MCCourseMod.MOD_ID, "block/" +"alexandrite_lamp_off")))};
            }
        });
        simpleBlockItem(ModBlocks.ALEXANDRITE_LAMP.get(), models().cubeAll("alexandrite_lamp_on",
                new ResourceLocation(MCCourseMod.MOD_ID, "block/" +"alexandrite_lamp_on")));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mccourse:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mccourse:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}