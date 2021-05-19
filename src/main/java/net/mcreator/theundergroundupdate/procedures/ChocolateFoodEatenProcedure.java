package net.mcreator.theundergroundupdate.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theundergroundupdate.potion.EnergyPotion;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateMod;

import java.util.Map;

@TheUndergroundUpdateModElements.ModElement.Tag
public class ChocolateFoodEatenProcedure extends TheUndergroundUpdateModElements.ModElement {
	public ChocolateFoodEatenProcedure(TheUndergroundUpdateModElements instance) {
		super(instance, 135);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency entity for procedure ChocolateFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(EnergyPotion.potion, (int) 999, (int) 1));
	}
}
