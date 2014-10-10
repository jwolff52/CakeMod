package io.github.jwolff52.cakemod.item.tools.clownfish;

import io.github.jwolff52.cakemod.creativetab.CreativeTabCakeMod;
import io.github.jwolff52.cakemod.ref.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemClownfishAxe extends ItemAxe{

	public ItemClownfishAxe(){
		super(ToolMaterial.EMERALD);
		this.setUnlocalizedName("clownfishAxe");
		this.setCreativeTab(CreativeTabCakeMod.CAKE_MOD_TAB);
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
	public void registerIcons(IIconRegister iconRegister){
		itemIcon=iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
	}
	
	private String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
	}
}
