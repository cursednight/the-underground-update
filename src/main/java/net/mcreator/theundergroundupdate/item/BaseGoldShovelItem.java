
package net.mcreator.theundergroundupdate.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;

@TheUndergroundUpdateModElements.ModElement.Tag
public class BaseGoldShovelItem extends TheUndergroundUpdateModElements.ModElement {
	@ObjectHolder("the_underground_update:base_gold_shovel")
	public static final Item block = null;
	public BaseGoldShovelItem(TheUndergroundUpdateModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 95;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GOLD_NUGGET, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("base_gold_shovel"));
	}
}
