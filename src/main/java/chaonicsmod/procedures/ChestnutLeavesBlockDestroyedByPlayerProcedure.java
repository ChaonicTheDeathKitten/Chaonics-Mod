package chaonicsmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import chaonicsmod.init.ChaonicsModModItems;
import chaonicsmod.init.ChaonicsModModBlocks;

public class ChestnutLeavesBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randNum = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
						new ItemStack(ChaonicsModModBlocks.CHESTNUT_LEAVES.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (!world.isClientSide()) {
				randNum = Math.random();
				if ((EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) == true) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						if (randNum >= 0 && randNum <= 0.063) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModBlocks.CHESTNUT_SAPLING.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (randNum > 0.063 && randNum <= 0.085) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModItems.CHESTNUT_BRANCH.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (randNum > 0.085 && randNum <= 0.09) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModBlocks.CHESTNUT_LAMP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						if (randNum >= 0 && randNum <= 0.083) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModBlocks.CHESTNUT_SAPLING.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (randNum > 0.083 && randNum <= 0.108) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModItems.CHESTNUT_BRANCH.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (randNum > 0.108 && randNum <= 0.115) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModBlocks.CHESTNUT_LAMP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						if (randNum >= 0 && randNum <= 0.1) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModBlocks.CHESTNUT_SAPLING.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (randNum > 0.1 && randNum <= 0.133) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModItems.CHESTNUT_BRANCH.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (randNum > 0.133 && randNum <= 0.142) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
										new ItemStack(ChaonicsModModBlocks.CHESTNUT_LAMP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
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
					} else if (randNum > 0.07 && randNum <= 0.072) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									new ItemStack(ChaonicsModModBlocks.CHESTNUT_LAMP.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
