package com.nincodedo.letsmodreboot.client.gui;

import java.util.List;

import com.nincodedo.letsmodreboot.handler.ConfigurationHandler;
import com.nincodedo.letsmodreboot.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen parentScreen) {
		super(parentScreen, new ConfigElement(
				ConfigurationHandler.configuration
						.getCategory(Configuration.CATEGORY_GENERAL))
				.getChildElements(), Reference.MOD_ID, false, false, GuiConfig
				.getAbridgedConfigPath(ConfigurationHandler.configuration
						.toString()));
	}

}
