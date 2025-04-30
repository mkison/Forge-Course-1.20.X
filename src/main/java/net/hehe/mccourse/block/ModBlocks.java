package net.hehe.mccourse.block;


import net.hehe.mccourse.MCCourseMod;

import net.hehe.mccourse.block.custom.AlexandriteLampBlock;
import net.hehe.mccourse.block.custom.KohlrabiCropBlock;
import net.hehe.mccourse.block.custom.SoundBlock;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_ALEXANDRITE_BLOCK = registerBlock("raw_alexandrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE = registerBlock("deepslate_alexandrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(ALEXANDRITE_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> END_STONE_ALEXANDRITE_ORE = registerBlock("end_stone_alexandrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> NETHER_ALEXANDRITE_ORE = registerBlock("nether_alexandrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));


    public static final RegistryObject<Block> ALEXANDRITE_SLAB = registerBlock("alexandrite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> ALEXANDRITE_STAIRS = registerBlock("alexandrite_stairs",
            () -> new StairBlock(() -> ModBlocks.ALEXANDRITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ALEXANDRITE_PRESSURE_PLATE = registerBlock("alexandrite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> ALEXANDRITE_BUTTON = registerBlock("alexandrite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON).sound(SoundType.METAL), BlockSetType.IRON, 5, false));

    public static final RegistryObject<Block> ALEXANDRITE_FENCE = registerBlock("alexandrite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> ALEXANDRITE_FENCE_GATE = registerBlock("alexandrite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.END_PORTAL_SPAWN, SoundEvents.PIG_DEATH));

    public static final RegistryObject<Block> ALEXANDRITE_WALL = registerBlock("alexandrite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> ALEXANDRITE_DOOR = registerBlock("alexandrite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), BlockSetType.IRON));

    public static final RegistryObject<Block> ALEXANDRITE_TRAPDOOR = registerBlock("alexandrite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), BlockSetType.IRON));

    public static final RegistryObject<Block> ALEXANDRITE_LAMP = registerBlock("alexandrite_lamp",
            () -> new AlexandriteLampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)
                    .lightLevel(state -> state.getValue(AlexandriteLampBlock.CLICKED) ? 15 : 0)));


    public static final RegistryObject<Block> KOHLRABI_CROP = BLOCKS.register("kohlrabi_crop",
            () -> new KohlrabiCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));

    public static final RegistryObject<Block> SNAPDRAGON = registerBlock("snapdragon",
            () -> new FlowerBlock(MobEffects.HARM, 6,BlockBehaviour.Properties.copy(Blocks.ALLIUM)));

    public static final RegistryObject<Block> POTTED_SNAPDRAGON = BLOCKS.register("potted_snapdragon",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SNAPDRAGON, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));


    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));


    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));


    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            () -> new StairBlock(Blocks.ORANGE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));

    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            () -> new StairBlock(Blocks.MAGENTA_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            () -> new StairBlock(Blocks.YELLOW_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));

    public static final RegistryObject<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            () -> new StairBlock(Blocks.LIME_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));

    public static final RegistryObject<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            () -> new StairBlock(Blocks.PINK_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));

    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            () -> new StairBlock(Blocks.GRAY_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            () -> new StairBlock(Blocks.CYAN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));

    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            () -> new StairBlock(Blocks.PURPLE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));

    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            () -> new StairBlock(Blocks.BLUE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));

    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            () -> new StairBlock(Blocks.BROWN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            () -> new StairBlock(Blocks.GREEN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));

    public static final RegistryObject<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            () -> new StairBlock(Blocks.RED_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            () -> new StairBlock(Blocks.BLACK_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));

    public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));

    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));

    public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));

    public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));

    public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));

    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));

    public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));

    public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));

    public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));




    public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion()));

    public static final RegistryObject<Block> WHITE_GLASS_SLAB = registerBlock("white_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> ORANGE_GLASS_SLAB = registerBlock("orange_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> MAGENTA_GLASS_SLAB = registerBlock("magenta_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> LIGHT_BLUE_GLASS_SLAB = registerBlock("light_blue_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_GLASS_SLAB = registerBlock("yellow_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> LIME_GLASS_SLAB = registerBlock("lime_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> PINK_GLASS_SLAB = registerBlock("pink_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> GRAY_GLASS_SLAB = registerBlock("gray_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> LIGHT_GRAY_GLASS_SLAB = registerBlock("light_gray_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> CYAN_GLASS_SLAB = registerBlock("cyan_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> PURPLE_GLASS_SLAB = registerBlock("purple_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> BLUE_GLASS_SLAB = registerBlock("blue_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> BROWN_GLASS_SLAB = registerBlock("brown_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> GREEN_GLASS_SLAB = registerBlock("green_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> RED_GLASS_SLAB = registerBlock("red_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> BLACK_GLASS_SLAB = registerBlock("black_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> GLASS_STAIRS = registerBlock("glass_stairs",
            () -> new StairBlock(Blocks.GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion()));
    public static final RegistryObject<Block> WHITE_GLASS_STAIRS = registerBlock("white_glass_stairs",
            () -> new StairBlock(Blocks.WHITE_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> ORANGE_GLASS_STAIRS = registerBlock("orange_glass_stairs",
            () -> new StairBlock(Blocks.ORANGE_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> MAGENTA_GLASS_STAIRS = registerBlock("magenta_glass_stairs",
            () -> new StairBlock(Blocks.MAGENTA_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> LIGHT_BLUE_GLASS_STAIRS = registerBlock("light_blue_glass_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_GLASS_STAIRS = registerBlock("yellow_glass_stairs",
            () -> new StairBlock(Blocks.YELLOW_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> LIME_GLASS_STAIRS = registerBlock("lime_glass_stairs",
            () -> new StairBlock(Blocks.LIME_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> PINK_GLASS_STAIRS = registerBlock("pink_glass_stairs",
            () -> new StairBlock(Blocks.PINK_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> GRAY_GLASS_STAIRS = registerBlock("gray_glass_stairs",
            () -> new StairBlock(Blocks.GRAY_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> LIGHT_GRAY_GLASS_STAIRS = registerBlock("light_gray_glass_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> CYAN_GLASS_STAIRS = registerBlock("cyan_glass_stairs",
            () -> new StairBlock(Blocks.CYAN_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> PURPLE_GLASS_STAIRS = registerBlock("purple_glass_stairs",
            () -> new StairBlock(Blocks.PURPLE_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> BLUE_GLASS_STAIRS = registerBlock("blue_glass_stairs",
            () -> new StairBlock(Blocks.BLUE_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> BROWN_GLASS_STAIRS = registerBlock("brown_glass_stairs",
            () -> new StairBlock(Blocks.BROWN_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> GREEN_GLASS_STAIRS = registerBlock("green_glass_stairs",
            () -> new StairBlock(Blocks.GREEN_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> RED_GLASS_STAIRS = registerBlock("red_glass_stairs",
            () -> new StairBlock(Blocks.RED_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> BLACK_GLASS_STAIRS = registerBlock("black_glass_stairs",
            () -> new StairBlock(Blocks.BLACK_STAINED_GLASS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).noOcclusion()));

    public static final RegistryObject<Block> GLASS_FENCE = registerBlock("glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS)));

    public static final RegistryObject<Block> GLASS_FENCE_GATE = registerBlock("glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion(), SoundEvents.GLASS_PLACE, SoundEvents.GLASS_STEP));

    public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS), BlockSetType.OAK));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}