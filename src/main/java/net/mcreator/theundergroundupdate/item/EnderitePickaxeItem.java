
package net.mcreator.theundergroundupdate.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;

@TheUndergroundUpdateModElements.ModElement.Tag
public class EnderitePickaxeItem extends TheUndergroundUpdateModElements.ModElement {
	@ObjectHolder("the_underground_update:enderite_pickaxe")
	public static final Item block = null;
	public EnderitePickaxeItem(TheUndergroundUpdateModElements instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiteItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("enderite_pickaxe"));
	}
}
