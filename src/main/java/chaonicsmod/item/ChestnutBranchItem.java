
package chaonicsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import chaonicsmod.init.ChaonicsModModTabs;

public class ChestnutBranchItem extends Item {
	public ChestnutBranchItem() {
		super(new Item.Properties().tab(ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
