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

package io.github.jwolff52.cakemod.item.fish;

import java.util.List;

import io.github.jwolff52.cakemod.creativetab.CreativeTabCakeMod;
import io.github.jwolff52.cakemod.ref.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemNotchFish extends ItemFishFood{

	public ItemNotchFish(){
		super(false);
		this.setUnlocalizedName("notchFish");
		this.setCreativeTab(CreativeTabCakeMod.CAKE_MOD_TAB);
	}

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
        ItemFishFood.FishType[] afishtype = ItemFishFood.FishType.values();
        int i = afishtype.length;

        for (int j = 0; j < i; ++j)
        {
        	p_150895_3_.add(new ItemStack(this, 1, 3));
        }
    }
	
	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_){
        p_77849_3_.addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 3));
        p_77849_3_.addPotionEffect(new PotionEffect(Potion.hunger.id, 300, 2));
        p_77849_3_.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 1));

        super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
    }
    
	@Override
	public String getUnlocalizedName(){
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack){
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_){
            ItemFishFood.FishType.PUFFERFISH.func_150968_a(p_94581_1_);
    }
	
	private String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
	}
}
