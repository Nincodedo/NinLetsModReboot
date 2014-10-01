package com.nincodedo.letsmodreboot.init;

import com.nincodedo.letsmodreboot.block.BlockFlag;
import com.nincodedo.letsmodreboot.block.BlockLMRB;
import com.nincodedo.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockLMRB flag = new BlockFlag();
	
	public static void init(){
		GameRegistry.registerBlock(flag, "flag");
	}
}
