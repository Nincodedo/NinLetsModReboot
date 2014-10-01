package com.nincodedo.letsmodreboot.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		// Shaped
		GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf),
				" s ",
				"sss",
				" s ",
				's', new ItemStack(Items.stick));
		// Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
		
		// Shaped Ore Dictionary
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf),
				" s ",
				"sss",
				" s ",
				's', "stickWood"));
		
		//Shapeless Ore Dictionary
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)));
	}
}
