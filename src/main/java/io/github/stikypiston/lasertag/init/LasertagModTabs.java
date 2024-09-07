
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.lasertag.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LasertagModTabs {
	public static CreativeModeTab TAB_LASERTAG;

	public static void load() {
		TAB_LASERTAG = new CreativeModeTab("tablasertag") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.REDSTONE_TORCH);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
