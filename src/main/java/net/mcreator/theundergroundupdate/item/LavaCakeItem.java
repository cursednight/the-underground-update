
package net.mcreator.theundergroundupdate.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.theundergroundupdate.procedures.LavaCakeFoodEatenProcedure;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;

import java.util.Map;
import java.util.HashMap;

@TheUndergroundUpdateModElements.ModElement.Tag
public class LavaCakeItem extends TheUndergroundUpdateModElements.ModElement {
	@ObjectHolder("the_underground_update:lava_cake")
	public static final Item block = null;
	public LavaCakeItem(TheUndergroundUpdateModElements instance) {
		super(instance, 132);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(10).saturation(1f).setAlwaysEdible().build()));
			setRegistryName("lava_cake");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				LavaCakeFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
