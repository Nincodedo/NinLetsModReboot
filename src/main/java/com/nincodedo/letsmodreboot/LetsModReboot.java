package com.nincodedo.letsmodreboot;

import com.nincodedo.letsmodreboot.handler.ConfigurationHandler;
import com.nincodedo.letsmodreboot.proxy.IProxy;
import com.nincodedo.letsmodreboot.reference.Reference;
import com.nincodedo.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.InstanceFactory;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {
	
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		LogHelper.info("Pre Initialization complete");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		LogHelper.info("Initialization complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("Post Initialization complete");
	}
}
