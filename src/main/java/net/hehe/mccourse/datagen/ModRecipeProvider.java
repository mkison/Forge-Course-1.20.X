package net.hehe.mccourse.datagen;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.block.ModBlocks;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite_block", has(ModBlocks.ALEXANDRITE_BLOCK.get()))
                .save(pWriter);

        customNineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                "raw_alexandrite", "raw_alexandrite_block");

        oreSmelting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 200, "alexandrite");
        oreBlasting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 100, "alexandrite");
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

