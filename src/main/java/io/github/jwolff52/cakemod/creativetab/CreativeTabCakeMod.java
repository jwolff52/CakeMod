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

package io.github.jwolff52.cakemod.creativetab;

import io.github.jwolff52.cakemod.init.ModItems;
import io.github.jwolff52.cakemod.ref.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCakeMod{
	
	public static final CreativeTabs CAKE_MOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ModItems.salmonSpade;
		}
		
	};
}
