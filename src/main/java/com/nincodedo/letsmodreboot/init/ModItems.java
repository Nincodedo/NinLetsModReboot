package com.nincodedo.letsmodreboot.init;

import com.nincodedo.letsmodreboot.item.ItemLMRB;
import com.nincodedo.letsmodreboot.item.ItemMapleLeaf;
import com.nincodedo.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
