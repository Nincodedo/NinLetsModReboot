package com.nincodedo.letsmodreboot.proxy;

import com.nincodedo.letsmodreboot.client.settings.Keybindings;

import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerKeyBindings() {
		ClientRegistry.registerKeyBinding(Keybindings.charge);
		ClientRegistry.registerKeyBinding(Keybindings.release);
	}

}
