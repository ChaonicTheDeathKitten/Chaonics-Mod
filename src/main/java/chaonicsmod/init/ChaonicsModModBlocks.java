
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaonicsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import chaonicsmod.block.PlasterWhiteBlock;
import chaonicsmod.block.ChestnutWoodBlock;
import chaonicsmod.block.ChestnutTrapdoorBlock;
import chaonicsmod.block.ChestnutStrippedWoodBlock;
import chaonicsmod.block.ChestnutStairsBlock;
import chaonicsmod.block.ChestnutSlabBlock;
import chaonicsmod.block.ChestnutSaplingBlock;
import chaonicsmod.block.ChestnutPressurePlateBlock;
import chaonicsmod.block.ChestnutPlanksBlock;
import chaonicsmod.block.ChestnutLogStrippedBlock;
import chaonicsmod.block.ChestnutLogBlock;
import chaonicsmod.block.ChestnutLeavesBlock;
import chaonicsmod.block.ChestnutLampBlock;
import chaonicsmod.block.ChestnutFenceGateBlock;
import chaonicsmod.block.ChestnutFenceBlock;
import chaonicsmod.block.ChestnutDoorBlock;
import chaonicsmod.block.ChestnutButtonBlock;

import chaonicsmod.ChaonicsModMod;

public class ChaonicsModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChaonicsModMod.MODID);
	public static final RegistryObject<Block> CHESTNUT_LOG = REGISTRY.register("chestnut_log", () -> new ChestnutLogBlock());
	public static final RegistryObject<Block> CHESTNUT_LEAVES = REGISTRY.register("chestnut_leaves", () -> new ChestnutLeavesBlock());
	public static final RegistryObject<Block> PLASTER_WHITE = REGISTRY.register("plaster_white", () -> new PlasterWhiteBlock());
	public static final RegistryObject<Block> CHESTNUT_DOOR = REGISTRY.register("chestnut_door", () -> new ChestnutDoorBlock());
	public static final RegistryObject<Block> CHESTNUT_PLANKS = REGISTRY.register("chestnut_planks", () -> new ChestnutPlanksBlock());
	public static final RegistryObject<Block> CHESTNUT_LOG_STRIPPED = REGISTRY.register("chestnut_log_stripped",
			() -> new ChestnutLogStrippedBlock());
	public static final RegistryObject<Block> CHESTNUT_SAPLING = REGISTRY.register("chestnut_sapling", () -> new ChestnutSaplingBlock());
	public static final RegistryObject<Block> CHESTNUT_LAMP = REGISTRY.register("chestnut_lamp", () -> new ChestnutLampBlock());
	public static final RegistryObject<Block> CHESTNUT_WOOD = REGISTRY.register("chestnut_wood", () -> new ChestnutWoodBlock());
	public static final RegistryObject<Block> CHESTNUT_STRIPPED_WOOD = REGISTRY.register("chestnut_stripped_wood",
			() -> new ChestnutStrippedWoodBlock());
	public static final RegistryObject<Block> CHESTNUT_TRAPDOOR = REGISTRY.register("chestnut_trapdoor", () -> new ChestnutTrapdoorBlock());
	public static final RegistryObject<Block> CHESTNUT_STAIRS = REGISTRY.register("chestnut_stairs", () -> new ChestnutStairsBlock());
	public static final RegistryObject<Block> CHESTNUT_FENCE = REGISTRY.register("chestnut_fence", () -> new ChestnutFenceBlock());
	public static final RegistryObject<Block> CHESTNUT_FENCE_GATE = REGISTRY.register("chestnut_fence_gate", () -> new ChestnutFenceGateBlock());
	public static final RegistryObject<Block> CHESTNUT_SLAB = REGISTRY.register("chestnut_slab", () -> new ChestnutSlabBlock());
	public static final RegistryObject<Block> CHESTNUT_PRESSURE_PLATE = REGISTRY.register("chestnut_pressure_plate",
			() -> new ChestnutPressurePlateBlock());
	public static final RegistryObject<Block> CHESTNUT_BUTTON = REGISTRY.register("chestnut_button", () -> new ChestnutButtonBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ChestnutDoorBlock.registerRenderLayer();
			ChestnutSaplingBlock.registerRenderLayer();
			ChestnutLampBlock.registerRenderLayer();
			ChestnutTrapdoorBlock.registerRenderLayer();
		}
	}
}
