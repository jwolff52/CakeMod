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

package io.github.jwolff52.cakemod.util;

import io.github.jwolff52.cakemod.ref.Reference;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {

	public static void log(Level logLevel, Object object){
		FMLLog.log(Reference.MOD_NAME, logLevel, "%s", object);
	}
	
	public static void all(Object message){ log(Level.ALL, message); }
	
	public static void debug(Object message){ log(Level.DEBUG, message); }
	
	public static void error(Object message){ log(Level.ERROR, message); }
	
	public static void fatal(Object message){ log(Level.FATAL, message); }
	
	public static void info(Object message){ log(Level.INFO, message); }
	
	public static void off(Object message){ log(Level.OFF, message); }
	
	public static void trace(Object message){ log(Level.TRACE, message); }
	
	public static void warn(Object message){ log(Level.WARN, message); }
}
