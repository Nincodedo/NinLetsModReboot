package com.nincodedo.letsmodreboot.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile){
		Configuration configuration = new Configuration(configFile);
		try{
			configuration.load();
			
			boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example value").getBoolean(true);
		}
		catch (Exception e){
			
		}
		finally{
			configuration.save();
		}
	}
}
