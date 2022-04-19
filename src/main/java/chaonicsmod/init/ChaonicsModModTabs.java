
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaonicsmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ChaonicsModModTabs {
	public static CreativeModeTab TAB_CHAONICS_MOD_TAB;

	public static void load() {
		TAB_CHAONICS_MOD_TAB = new CreativeModeTab("tabchaonics_mod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChaonicsModModItems.SPATULA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
