package net.mcreator.theundergroundupdate.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateMod;

import java.util.Map;

@TheUndergroundUpdateModElements.ModElement.Tag
public class TrappedOnPotionActiveTickProcedure extends TheUndergroundUpdateModElements.ModElement {
	public TrappedOnPotionActiveTickProcedure(TheUndergroundUpdateModElements instance) {
		super(instance, 272);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency entity for procedure TrappedOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 60, (int) 128, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 255, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 60, (int) 255, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 60, (int) 255, (false), (false)));
	}
}
