package io.github.jwolff52.cakemod;

import io.github.jwolff52.cakemod.handler.ConfigurationHandler;
import io.github.jwolff52.cakemod.init.ModItems;
import io.github.jwolff52.cakemod.init.Recipies;
import io.github.jwolff52.cakemod.proxy.IProxy;
import io.github.jwolff52.cakemod.ref.Reference;
import io.github.jwolff52.cakemod.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class CakeMod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static CakeMod instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
		ConfigurationHandler.init(e.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModItems.init();
		
		LogHelper.info("CakeMod Pre-Initilization complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e){
		Recipies.init();
		LogHelper.info("CakeMod Initilization complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){
		LogHelper.info("CakeMod Post-Initilization complete!");
	}
}