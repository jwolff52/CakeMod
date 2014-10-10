 /************************************************************************
 *  CakeMod - A Sea based mod
 *  Copyright (C) 2014 James Wolff Andrew
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ************************************************************************/

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
