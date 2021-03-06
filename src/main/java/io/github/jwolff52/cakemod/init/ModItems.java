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

package io.github.jwolff52.cakemod.init;

import io.github.jwolff52.cakemod.item.fish.ItemNotchFish;
import io.github.jwolff52.cakemod.item.tools.clownfish.ItemClownfishAxe;
import io.github.jwolff52.cakemod.item.tools.clownfish.ItemClownfishHoe;
import io.github.jwolff52.cakemod.item.tools.clownfish.ItemClownfishPickaxe;
import io.github.jwolff52.cakemod.item.tools.clownfish.ItemClownfishSpade;
import io.github.jwolff52.cakemod.item.tools.clownfish.ItemClownfishSword;
import io.github.jwolff52.cakemod.item.tools.fish.ItemFishAxe;
import io.github.jwolff52.cakemod.item.tools.fish.ItemFishHoe;
import io.github.jwolff52.cakemod.item.tools.fish.ItemFishPickaxe;
import io.github.jwolff52.cakemod.item.tools.fish.ItemFishSpade;
import io.github.jwolff52.cakemod.item.tools.fish.ItemFishSword;
import io.github.jwolff52.cakemod.item.tools.pufferfish.ItemPufferfishAxe;
import io.github.jwolff52.cakemod.item.tools.pufferfish.ItemPufferfishHoe;
import io.github.jwolff52.cakemod.item.tools.pufferfish.ItemPufferfishPickaxe;
import io.github.jwolff52.cakemod.item.tools.pufferfish.ItemPufferfishSpade;
import io.github.jwolff52.cakemod.item.tools.pufferfish.ItemPufferfishSword;
import io.github.jwolff52.cakemod.item.tools.salmon.ItemSalmonAxe;
import io.github.jwolff52.cakemod.item.tools.salmon.ItemSalmonHoe;
import io.github.jwolff52.cakemod.item.tools.salmon.ItemSalmonPickaxe;
import io.github.jwolff52.cakemod.item.tools.salmon.ItemSalmonSpade;
import io.github.jwolff52.cakemod.item.tools.salmon.ItemSalmonSword;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final ItemFishFood notchFish=new ItemNotchFish();
	
	public static final ItemSword fishSword=new ItemFishSword();
	public static final ItemPickaxe fishPickaxe=new ItemFishPickaxe();
	public static final ItemAxe fishAxe=new ItemFishAxe();
	public static final ItemSpade fishSpade=new ItemFishSpade();
	public static final ItemHoe fishHoe=new ItemFishHoe();
	
	public static final ItemSword salmonSword=new ItemSalmonSword();
	public static final ItemPickaxe salmonPickaxe=new ItemSalmonPickaxe();
	public static final ItemAxe salmonAxe=new ItemSalmonAxe();
	public static final ItemSpade salmonSpade=new ItemSalmonSpade();
	public static final ItemHoe salmonHoe=new ItemSalmonHoe();
	
	public static final ItemSword pufferfishSword=new ItemPufferfishSword();
	public static final ItemPickaxe pufferfishPickaxe=new ItemPufferfishPickaxe();
	public static final ItemAxe pufferfishAxe=new ItemPufferfishAxe();
	public static final ItemSpade pufferfishSpade=new ItemPufferfishSpade();
	public static final ItemHoe pufferfishHoe=new ItemPufferfishHoe();
	
	public static final ItemSword clownfishSword=new ItemClownfishSword();
	public static final ItemPickaxe clownfishPickaxe=new ItemClownfishPickaxe();
	public static final ItemAxe clownfishAxe=new ItemClownfishAxe();
	public static final ItemSpade clownfishSpade=new ItemClownfishSpade();
	public static final ItemHoe clownfishHoe=new ItemClownfishHoe();
	
	public static void init(){
		
		GameRegistry.registerItem(notchFish, "notch_fish");
		
		GameRegistry.registerItem(fishSword, "fish_sword");
		GameRegistry.registerItem(fishPickaxe, "fish_pickaxe");
		GameRegistry.registerItem(fishAxe, "fish_axe");
		GameRegistry.registerItem(fishSpade, "fish_spade");
		GameRegistry.registerItem(fishHoe, "fish_hoe");
		
		GameRegistry.registerItem(salmonSword, "salmon_sword");
		GameRegistry.registerItem(salmonPickaxe, "salmon_pickaxe");
		GameRegistry.registerItem(salmonAxe, "salmon_axe");
		GameRegistry.registerItem(salmonSpade, "salmon_spade");
		GameRegistry.registerItem(salmonHoe, "salmon_hoe");
		
		GameRegistry.registerItem(pufferfishSword, "pufferfish_sword");
		GameRegistry.registerItem(pufferfishPickaxe, "pufferfish_pickaxe");
		GameRegistry.registerItem(pufferfishAxe, "pufferfish_axe");
		GameRegistry.registerItem(pufferfishSpade, "pufferfish_spade");
		GameRegistry.registerItem(pufferfishHoe, "pufferfish_hoe");
		
		GameRegistry.registerItem(clownfishSword, "clownfish_sword");
		GameRegistry.registerItem(clownfishPickaxe, "clownfish_pickaxe");
		GameRegistry.registerItem(clownfishAxe, "clownfish_axe");
		GameRegistry.registerItem(clownfishSpade, "clownfish_spade");
		GameRegistry.registerItem(clownfishHoe, "clownfish_hoe");
	}
}
