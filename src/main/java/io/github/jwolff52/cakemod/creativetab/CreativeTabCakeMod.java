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
