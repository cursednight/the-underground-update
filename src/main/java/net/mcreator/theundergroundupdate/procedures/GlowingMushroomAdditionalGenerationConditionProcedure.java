package net.mcreator.theundergroundupdate.procedures;

import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateMod;

import java.util.Map;

@TheUndergroundUpdateModElements.ModElement.Tag
public class GlowingMushroomAdditionalGenerationConditionProcedure extends TheUndergroundUpdateModElements.ModElement {
	public GlowingMushroomAdditionalGenerationConditionProcedure(TheUndergroundUpdateModElements instance) {
		super(instance, 216);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency y for procedure GlowingMushroomAdditionalGenerationCondition!");
			return false;
		}
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		if ((y < 40)) {
			return (true);
		}
		return (false);
	}
}
