package chaonicsmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import chaonicsmod.init.ChaonicsModModItems;
import chaonicsmod.init.ChaonicsModModBlocks;

public class ChestnutLeavesBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randNum = 0;
		if (!world.isClientSide()) {
			randNum = Math.random();
			if (randNum >= 0 && randNum <= 0.05) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
							new ItemStack(ChaonicsModModBlocks.CHESTNUT_SAPLING.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (randNum > 0.05 && randNum <= 0.07) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
							new ItemStack(ChaonicsModModItems.CHESTNUT_BRANCH.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (randNum > 0.07 && randNum <= 0.075) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
							new ItemStack(ChaonicsModModItems.CHESTNUT_BRANCH.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
