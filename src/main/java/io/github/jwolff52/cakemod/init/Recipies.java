package io.github.jwolff52.cakemod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {

	public static void init(){
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.fishSword), " f ", " f ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.COD.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.fishPickaxe), "fff", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.COD.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.fishAxe), "ff ", "fs ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.COD.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.fishSpade), " f ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.COD.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.fishHoe), "ff ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.COD.func_150976_a()), 's', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.salmonSword), " f ", " f ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.salmonPickaxe), "fff", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.salmonAxe), "ff ", "fs ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.salmonSpade), " f ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.salmonHoe), "ff ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 's', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.pufferfishSword), " f ", " f ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.pufferfishPickaxe), "fff", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.pufferfishAxe), "ff ", "fs ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.pufferfishSpade), " f ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.pufferfishHoe), "ff ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 's', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clownfishSword), " f ", " f ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clownfishPickaxe), "fff", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clownfishAxe), "ff ", "fs ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clownfishSpade), " f ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clownfishHoe), "ff ", " s ", " s ", 'f', new ItemStack(Items.fish, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 's', Items.stick);
	}
}