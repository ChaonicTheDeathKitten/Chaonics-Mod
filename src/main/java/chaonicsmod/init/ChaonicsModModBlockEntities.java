
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaonicsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import chaonicsmod.block.entity.ChestnutSaplingBlockEntity;

import chaonicsmod.ChaonicsModMod;

public class ChaonicsModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ChaonicsModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHESTNUT_SAPLING = register("chestnut_sapling", ChaonicsModModBlocks.CHESTNUT_SAPLING,
			ChestnutSaplingBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
