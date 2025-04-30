package net.hehe.mccourse.datagen;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),
            ModBlocks.ALEXANDRITE_ORE.get(), ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
            ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }


    @Override
    protected void buildRecipes(RecipeOutput pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", has(ModItems.ALEXANDRITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", has(ModItems.ALEXANDRITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", has(ModItems.ALEXANDRITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", has(ModItems.ALEXANDRITE.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite_block", has(ModBlocks.ALEXANDRITE_BLOCK.get()))
                .save(pWriter);




        customNineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                "raw_alexandrite", "raw_alexandrite_block");

        oreSmelting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 200, "alexandrite");
        oreBlasting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 100, "alexandrite");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.WHITE_GLAZED_TERRACOTTA)
                .unlockedBy("has_white_glazed_terracotta", has(Items.WHITE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.ORANGE_GLAZED_TERRACOTTA)
                .unlockedBy("has_orange_glazed_terracotta", has(Items.ORANGE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.MAGENTA_GLAZED_TERRACOTTA)
                .unlockedBy("has_magenta_glazed_terracotta", has(Items.MAGENTA_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIGHT_BLUE_GLAZED_TERRACOTTA)
                .unlockedBy("has_light_blue_glazed_terracotta", has(Items.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.YELLOW_GLAZED_TERRACOTTA)
                .unlockedBy("has_yellow_glazed_terracotta", has(Items.YELLOW_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIME_GLAZED_TERRACOTTA)
                .unlockedBy("has_lime_glazed_terracotta", has(Items.LIME_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.PINK_GLAZED_TERRACOTTA)
                .unlockedBy("has_pink_glazed_terracotta", has(Items.PINK_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.GRAY_GLAZED_TERRACOTTA)
                .unlockedBy("has_gray_glazed_terracotta", has(Items.GRAY_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIGHT_GRAY_GLAZED_TERRACOTTA)
                .unlockedBy("has_light_gray_glazed_terracotta", has(Items.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CYAN_GLAZED_TERRACOTTA)
                .unlockedBy("has_cyan_glazed_terracotta", has(Items.CYAN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.PURPLE_GLAZED_TERRACOTTA)
                .unlockedBy("has_purple_glazed_terracotta", has(Items.PURPLE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BLUE_GLAZED_TERRACOTTA)
                .unlockedBy("has_blue_glazed_terracotta", has(Items.BLUE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BROWN_GLAZED_TERRACOTTA)
                .unlockedBy("has_brown_glazed_terracotta", has(Items.BROWN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.GREEN_GLAZED_TERRACOTTA)
                .unlockedBy("has_green_glazed_terracotta", has(Items.GREEN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.RED_GLAZED_TERRACOTTA)
                .unlockedBy("has_red_glazed_terracotta", has(Items.RED_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BLACK_GLAZED_TERRACOTTA)
                .unlockedBy("has_black_glazed_terracotta", has(Items.BLACK_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.WHITE_GLAZED_TERRACOTTA)
                .unlockedBy("has_white_glazed_terracotta", has(Items.WHITE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.ORANGE_GLAZED_TERRACOTTA)
                .unlockedBy("has_orange_glazed_terracotta", has(Items.ORANGE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.MAGENTA_GLAZED_TERRACOTTA)
                .unlockedBy("has_magenta_glazed_terracotta", has(Items.MAGENTA_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIGHT_BLUE_GLAZED_TERRACOTTA)
                .unlockedBy("has_light_blue_glazed_terracotta", has(Items.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.YELLOW_GLAZED_TERRACOTTA)
                .unlockedBy("has_yellow_glazed_terracotta", has(Items.YELLOW_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIME_GLAZED_TERRACOTTA)
                .unlockedBy("has_lime_glazed_terracotta", has(Items.LIME_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.PINK_GLAZED_TERRACOTTA)
                .unlockedBy("has_pink_glazed_terracotta", has(Items.PINK_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.GRAY_GLAZED_TERRACOTTA)
                .unlockedBy("has_gray_glazed_terracotta", has(Items.GRAY_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIGHT_GRAY_GLAZED_TERRACOTTA)
                .unlockedBy("has_light_gray_glazed_terracotta", has(Items.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.CYAN_GLAZED_TERRACOTTA)
                .unlockedBy("has_cyan_glazed_terracotta", has(Items.CYAN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.PURPLE_GLAZED_TERRACOTTA)
                .unlockedBy("has_purple_glazed_terracotta", has(Items.PURPLE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BLUE_GLAZED_TERRACOTTA)
                .unlockedBy("has_blue_glazed_terracotta", has(Items.BLUE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BROWN_GLAZED_TERRACOTTA)
                .unlockedBy("has_brown_glazed_terracotta", has(Items.BROWN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.GREEN_GLAZED_TERRACOTTA)
                .unlockedBy("has_green_glazed_terracotta", has(Items.GREEN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.RED_GLAZED_TERRACOTTA)
                .unlockedBy("has_red_glazed_terracotta", has(Items.RED_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BLACK_GLAZED_TERRACOTTA)
                .unlockedBy("has_black_glazed_terracotta", has(Items.BLACK_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.WHITE_GLAZED_TERRACOTTA)
                .unlockedBy("has_white_glazed_terracotta", has(Items.WHITE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.ORANGE_GLAZED_TERRACOTTA)
                .unlockedBy("has_orange_glazed_terracotta", has(Items.ORANGE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.MAGENTA_GLAZED_TERRACOTTA)
                .unlockedBy("has_magenta_glazed_terracotta", has(Items.MAGENTA_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.LIGHT_BLUE_GLAZED_TERRACOTTA)
                .unlockedBy("has_light_blue_glazed_terracotta", has(Items.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.YELLOW_GLAZED_TERRACOTTA)
                .unlockedBy("has_yellow_glazed_terracotta", has(Items.YELLOW_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.LIME_GLAZED_TERRACOTTA)
                .unlockedBy("has_lime_glazed_terracotta", has(Items.LIME_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.PINK_GLAZED_TERRACOTTA)
                .unlockedBy("has_pink_glazed_terracotta", has(Items.PINK_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.GRAY_GLAZED_TERRACOTTA)
                .unlockedBy("has_gray_glazed_terracotta", has(Items.GRAY_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.LIGHT_GRAY_GLAZED_TERRACOTTA)
                .unlockedBy("has_light_gray_glazed_terracotta", has(Items.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CYAN_GLAZED_TERRACOTTA)
                .unlockedBy("has_cyan_glazed_terracotta", has(Items.CYAN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.PURPLE_GLAZED_TERRACOTTA)
                .unlockedBy("has_purple_glazed_terracotta", has(Items.PURPLE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BLUE_GLAZED_TERRACOTTA)
                .unlockedBy("has_blue_glazed_terracotta", has(Items.BLUE_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BROWN_GLAZED_TERRACOTTA)
                .unlockedBy("has_brown_glazed_terracotta", has(Items.BROWN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.GREEN_GLAZED_TERRACOTTA)
                .unlockedBy("has_green_glazed_terracotta", has(Items.GREEN_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.RED_GLAZED_TERRACOTTA)
                .unlockedBy("has_red_glazed_terracotta", has(Items.RED_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BLACK_GLAZED_TERRACOTTA)
                .unlockedBy("has_black_glazed_terracotta", has(Items.BLACK_GLAZED_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.WHITE_STAINED_GLASS)
                .unlockedBy("has_white_stained_glass", has(Items.WHITE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.ORANGE_STAINED_GLASS)
                .unlockedBy("has_orange_stained_glass", has(Items.ORANGE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.MAGENTA_STAINED_GLASS)
                .unlockedBy("has_magenta_stained_glass", has(Items.MAGENTA_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy("has_light_blue_stained_glass", has(Items.LIGHT_BLUE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.YELLOW_STAINED_GLASS)
                .unlockedBy("has_yellow_stained_glass", has(Items.YELLOW_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIME_STAINED_GLASS)
                .unlockedBy("has_lime_stained_glass", has(Items.LIME_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.PINK_STAINED_GLASS)
                .unlockedBy("has_pink_stained_glass", has(Items.PINK_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.GRAY_STAINED_GLASS)
                .unlockedBy("has_gray_stained_glass", has(Items.GRAY_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy("has_light_gray_stained_glass", has(Items.LIGHT_GRAY_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CYAN_STAINED_GLASS)
                .unlockedBy("has_cyan_stained_glass", has(Items.CYAN_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.PURPLE_STAINED_GLASS)
                .unlockedBy("has_purple_stained_glass", has(Items.PURPLE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BLUE_STAINED_GLASS)
                .unlockedBy("has_blue_stained_glass", has(Items.BLUE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BROWN_STAINED_GLASS)
                .unlockedBy("has_brown_stained_glass", has(Items.BROWN_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.GREEN_STAINED_GLASS)
                .unlockedBy("has_green_stained_glass", has(Items.GREEN_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.RED_STAINED_GLASS)
                .unlockedBy("has_red_stained_glass", has(Items.RED_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_GLASS_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BLACK_STAINED_GLASS)
                .unlockedBy("has_black_stained_glass", has(Items.BLACK_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.WHITE_STAINED_GLASS)
                .unlockedBy("has_white_stained_glass", has(Items.WHITE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.ORANGE_STAINED_GLASS)
                .unlockedBy("has_orange_stained_glass", has(Items.ORANGE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.MAGENTA_STAINED_GLASS)
                .unlockedBy("has_magenta_stained_glass", has(Items.MAGENTA_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy("has_light_blue_stained_glass", has(Items.LIGHT_BLUE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.YELLOW_STAINED_GLASS)
                .unlockedBy("has_yellow_stained_glass", has(Items.YELLOW_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIME_STAINED_GLASS)
                .unlockedBy("has_lime_stained_glass", has(Items.LIME_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.PINK_STAINED_GLASS)
                .unlockedBy("has_pink_stained_glass", has(Items.PINK_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.GRAY_STAINED_GLASS)
                .unlockedBy("has_gray_stained_glass", has(Items.GRAY_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy("has_light_gray_stained_glass", has(Items.LIGHT_GRAY_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.CYAN_STAINED_GLASS)
                .unlockedBy("has_cyan_stained_glass", has(Items.CYAN_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.PURPLE_STAINED_GLASS)
                .unlockedBy("has_purple_stained_glass", has(Items.PURPLE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BLUE_STAINED_GLASS)
                .unlockedBy("has_blue_stained_glass", has(Items.BLUE_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BROWN_STAINED_GLASS)
                .unlockedBy("has_brown_stained_glass", has(Items.BROWN_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.GREEN_STAINED_GLASS)
                .unlockedBy("has_green_stained_glass", has(Items.GREEN_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.RED_STAINED_GLASS)
                .unlockedBy("has_red_stained_glass", has(Items.RED_STAINED_GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_GLASS_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BLACK_STAINED_GLASS)
                .unlockedBy("has_black_stained_glass", has(Items.BLACK_STAINED_GLASS))
                .save(pWriter);


        // STAIRS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.WHITE_WOOL)
                .unlockedBy("has_white_wool", has(Items.WHITE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.ORANGE_WOOL)
                .unlockedBy("has_orange_wool", has(Items.ORANGE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.MAGENTA_WOOL)
                .unlockedBy("has_magenta_wool", has(Items.MAGENTA_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIGHT_BLUE_WOOL)
                .unlockedBy("has_light_blue_wool", has(Items.LIGHT_BLUE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.YELLOW_WOOL)
                .unlockedBy("has_yellow_wool", has(Items.YELLOW_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIME_WOOL)
                .unlockedBy("has_lime_wool", has(Items.LIME_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.PINK_WOOL)
                .unlockedBy("has_pink_wool", has(Items.PINK_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.GRAY_WOOL)
                .unlockedBy("has_gray_wool", has(Items.GRAY_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.LIGHT_GRAY_WOOL)
                .unlockedBy("has_light_gray_wool", has(Items.LIGHT_GRAY_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CYAN_WOOL)
                .unlockedBy("has_cyan_wool", has(Items.CYAN_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.PURPLE_WOOL)
                .unlockedBy("has_purple_wool", has(Items.PURPLE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BLUE_WOOL)
                .unlockedBy("has_blue_wool", has(Items.BLUE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BROWN_WOOL)
                .unlockedBy("has_brown_wool", has(Items.BROWN_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.GREEN_WOOL)
                .unlockedBy("has_green_wool", has(Items.GREEN_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.RED_WOOL)
                .unlockedBy("has_red_wool", has(Items.RED_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_WOOL_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BLACK_WOOL)
                .unlockedBy("has_black_wool", has(Items.BLACK_WOOL))
                .save(pWriter);



// SLABS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.WHITE_WOOL)
                .unlockedBy("has_white_wool", has(Items.WHITE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.ORANGE_WOOL)
                .unlockedBy("has_orange_wool", has(Items.ORANGE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.MAGENTA_WOOL)
                .unlockedBy("has_magenta_wool", has(Items.MAGENTA_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIGHT_BLUE_WOOL)
                .unlockedBy("has_light_blue_wool", has(Items.LIGHT_BLUE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.YELLOW_WOOL)
                .unlockedBy("has_yellow_wool", has(Items.YELLOW_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIME_WOOL)
                .unlockedBy("has_lime_wool", has(Items.LIME_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.PINK_WOOL)
                .unlockedBy("has_pink_wool", has(Items.PINK_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.GRAY_WOOL)
                .unlockedBy("has_gray_wool", has(Items.GRAY_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.LIGHT_GRAY_WOOL)
                .unlockedBy("has_light_gray_wool", has(Items.LIGHT_GRAY_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.CYAN_WOOL)
                .unlockedBy("has_cyan_wool", has(Items.CYAN_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.PURPLE_WOOL)
                .unlockedBy("has_purple_wool", has(Items.PURPLE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BLUE_WOOL)
                .unlockedBy("has_blue_wool", has(Items.BLUE_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BROWN_WOOL)
                .unlockedBy("has_brown_wool", has(Items.BROWN_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.GREEN_WOOL)
                .unlockedBy("has_green_wool", has(Items.GREEN_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.RED_WOOL)
                .unlockedBy("has_red_wool", has(Items.RED_WOOL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_WOOL_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', Items.BLACK_WOOL)
                .unlockedBy("has_black_wool", has(Items.BLACK_WOOL))
                .save(pWriter);


    }


    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pRecipeOutput, MCCourseMod.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }

    private void customNineBlockStorageRecipes(RecipeOutput pWriter, RecipeCategory pMainCategory, ItemLike pMainItem, RecipeCategory pStorageCategory, ItemLike pStorageItem, String pMainName, String pStorageName) {
        ShapedRecipeBuilder.shaped(pStorageCategory, pStorageItem)
                .define('A', pMainItem)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_" + pMainName, has(pMainItem))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(pMainCategory, pMainItem, 9)
                .requires(pStorageItem)
                .unlockedBy("has_" + pStorageName, has(pStorageItem))
                .save(pWriter);
    }

}

