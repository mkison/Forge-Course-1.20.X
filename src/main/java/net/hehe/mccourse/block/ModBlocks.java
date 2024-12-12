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

    public static <T extends Block> Supplier<T> vanillaBlock(T block) {
        return () -> block;
    }

        public static final Supplier<Block> WHITE_GLAZED_TERRACOTTA = vanillaBlock(Blocks.WHITE_GLAZED_TERRACOTTA);
        public static final Supplier<Block> ORANGE_GLAZED_TERRACOTTA = vanillaBlock(Blocks.ORANGE_GLAZED_TERRACOTTA);
        public static final Supplier<Block> MAGENTA_GLAZED_TERRACOTTA = vanillaBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA);
        public static final Supplier<Block> LIGHT_BLUE_GLAZED_TERRACOTTA = vanillaBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        public static final Supplier<Block> YELLOW_GLAZED_TERRACOTTA = vanillaBlock(Blocks.YELLOW_GLAZED_TERRACOTTA);
        public static final Supplier<Block> LIME_GLAZED_TERRACOTTA = vanillaBlock(Blocks.LIME_GLAZED_TERRACOTTA);
        public static final Supplier<Block> PINK_GLAZED_TERRACOTTA = vanillaBlock(Blocks.PINK_GLAZED_TERRACOTTA);
        public static final Supplier<Block> GRAY_GLAZED_TERRACOTTA = vanillaBlock(Blocks.GRAY_GLAZED_TERRACOTTA);
        public static final Supplier<Block> LIGHT_GRAY_GLAZED_TERRACOTTA = vanillaBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        public static final Supplier<Block> CYAN_GLAZED_TERRACOTTA = vanillaBlock(Blocks.CYAN_GLAZED_TERRACOTTA);
        public static final Supplier<Block> PURPLE_GLAZED_TERRACOTTA = vanillaBlock(Blocks.PURPLE_GLAZED_TERRACOTTA);
        public static final Supplier<Block> BLUE_GLAZED_TERRACOTTA = vanillaBlock(Blocks.BLUE_GLAZED_TERRACOTTA);
        public static final Supplier<Block> BROWN_GLAZED_TERRACOTTA = vanillaBlock(Blocks.BROWN_GLAZED_TERRACOTTA);
        public static final Supplier<Block> GREEN_GLAZED_TERRACOTTA = vanillaBlock(Blocks.GREEN_GLAZED_TERRACOTTA);
        public static final Supplier<Block> RED_GLAZED_TERRACOTTA = vanillaBlock(Blocks.RED_GLAZED_TERRACOTTA);
        public static final Supplier<Block> BLACK_GLAZED_TERRACOTTA = vanillaBlock(Blocks.BLACK_GLAZED_TERRACOTTA);


    /*WHITE_GLAZED_TERRACOTTA = register((String)"white_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        ORANGE_GLAZED_TERRACOTTA = register((String)"orange_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        MAGENTA_GLAZED_TERRACOTTA = register((String)"magenta_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        LIGHT_BLUE_GLAZED_TERRACOTTA = register((String)"light_blue_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        YELLOW_GLAZED_TERRACOTTA = register((String)"yellow_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        LIME_GLAZED_TERRACOTTA = register((String)"lime_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        PINK_GLAZED_TERRACOTTA = register((String)"pink_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        GRAY_GLAZED_TERRACOTTA = register((String)"gray_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        LIGHT_GRAY_GLAZED_TERRACOTTA = register((String)"light_gray_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        CYAN_GLAZED_TERRACOTTA = register((String)"cyan_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        PURPLE_GLAZED_TERRACOTTA = register((String)"purple_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        BLUE_GLAZED_TERRACOTTA = register((String)"blue_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        BROWN_GLAZED_TERRACOTTA = register((String)"brown_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        GREEN_GLAZED_TERRACOTTA = register((String)"green_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        RED_GLAZED_TERRACOTTA = register((String)"red_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        BLACK_GLAZED_TERRACOTTA = register((String)"black_glazed_terracotta", new GlazedTerracottaBlock(Properties.of().mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
         */



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