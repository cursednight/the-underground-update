package net.mcreator.theundergroundupdate.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateMod;

import java.util.Map;

@TheUndergroundUpdateModElements.ModElement.Tag
public class CaveManNaturalEntitySpawningConditionProcedure extends TheUndergroundUpdateModElements.ModElement {
	public CaveManNaturalEntitySpawningConditionProcedure(TheUndergroundUpdateModElements instance) {
		super(instance, 238);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency x for procedure CaveManNaturalEntitySpawningCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency y for procedure CaveManNaturalEntitySpawningCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency z for procedure CaveManNaturalEntitySpawningCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency world for procedure CaveManNaturalEntitySpawningCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((y >= 35)
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))) {
			return (true);
		}
		return (false);
	}
}
