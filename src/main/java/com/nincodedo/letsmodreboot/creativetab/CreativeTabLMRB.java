package com.nincodedo.letsmodreboot.creativetab;

import com.nincodedo.letsmodreboot.init.ModItems;
import com.nincodedo.letsmodreboot.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB {
	public static final CreativeTabs LMBR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.mapleLeaf;
		}
	};
}
