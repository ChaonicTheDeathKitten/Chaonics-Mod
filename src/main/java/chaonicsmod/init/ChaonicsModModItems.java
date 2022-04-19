
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaonicsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import chaonicsmod.item.SpatulaItem;
import chaonicsmod.item.ChestnutBranchItem;

import chaonicsmod.ChaonicsModMod;

public class ChaonicsModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChaonicsModMod.MODID);
	public static final RegistryObject<Item> CHESTNUT_LOG = block(ChaonicsModModBlocks.CHESTNUT_LOG, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_LEAVES = block(ChaonicsModModBlocks.CHESTNUT_LEAVES, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> SPATULA = REGISTRY.register("spatula", () -> new SpatulaItem());
	public static final RegistryObject<Item> PLASTER_WHITE = block(ChaonicsModModBlocks.PLASTER_WHITE, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_DOOR = doubleBlock(ChaonicsModModBlocks.CHESTNUT_DOOR, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_PLANKS = block(ChaonicsModModBlocks.CHESTNUT_PLANKS, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_LOG_STRIPPED = block(ChaonicsModModBlocks.CHESTNUT_LOG_STRIPPED,
			ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_SAPLING = block(ChaonicsModModBlocks.CHESTNUT_SAPLING, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_BRANCH = REGISTRY.register("chestnut_branch", () -> new ChestnutBranchItem());
	public static final RegistryObject<Item> CHESTNUT_LAMP = block(ChaonicsModModBlocks.CHESTNUT_LAMP, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_WOOD = block(ChaonicsModModBlocks.CHESTNUT_WOOD, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_STRIPPED_WOOD = block(ChaonicsModModBlocks.CHESTNUT_STRIPPED_WOOD,
			ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_TRAPDOOR = block(ChaonicsModModBlocks.CHESTNUT_TRAPDOOR,
			ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_STAIRS = block(ChaonicsModModBlocks.CHESTNUT_STAIRS, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_FENCE = block(ChaonicsModModBlocks.CHESTNUT_FENCE, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_FENCE_GATE = block(ChaonicsModModBlocks.CHESTNUT_FENCE_GATE,
			ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_SLAB = block(ChaonicsModModBlocks.CHESTNUT_SLAB, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_PRESSURE_PLATE = block(ChaonicsModModBlocks.CHESTNUT_PRESSURE_PLATE,
			ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);
	public static final RegistryObject<Item> CHESTNUT_BUTTON = block(ChaonicsModModBlocks.CHESTNUT_BUTTON, ChaonicsModModTabs.TAB_CHAONICS_MOD_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
