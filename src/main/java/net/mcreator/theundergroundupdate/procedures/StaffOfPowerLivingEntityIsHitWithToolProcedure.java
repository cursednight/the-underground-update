package net.mcreator.theundergroundupdate.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theundergroundupdate.potion.TrappedPotion;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateMod;

import java.util.Map;
import java.util.Collection;

@TheUndergroundUpdateModElements.ModElement.Tag
public class StaffOfPowerLivingEntityIsHitWithToolProcedure extends TheUndergroundUpdateModElements.ModElement {
	public StaffOfPowerLivingEntityIsHitWithToolProcedure(TheUndergroundUpdateModElements instance) {
		super(instance, 271);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheUndergroundUpdateMod.LOGGER.warn("Failed to load dependency entity for procedure StaffOfPowerLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TrappedPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(TrappedPotion.potion, (int) 111111, (int) 1, (false), (false)));
		}
	}
}
