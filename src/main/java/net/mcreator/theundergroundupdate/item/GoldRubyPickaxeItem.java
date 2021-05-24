
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
public class GoldRubyPickaxeItem extends TheUndergroundUpdateModElements.ModElement {
	@ObjectHolder("the_underground_update:gold_ruby_pickaxe")
	public static final Item block = null;
	public GoldRubyPickaxeItem(TheUndergroundUpdateModElements instance) {
		super(instance, 119);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubysItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("gold_ruby_pickaxe"));
	}
}
