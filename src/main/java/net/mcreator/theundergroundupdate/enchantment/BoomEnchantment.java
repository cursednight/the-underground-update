
package net.mcreator.theundergroundupdate.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.theundergroundupdate.item.MallachitePickaxeItem;
import net.mcreator.theundergroundupdate.item.LesserTopazPickaxeItem;
import net.mcreator.theundergroundupdate.item.GoldRubyPickaxeItem;
import net.mcreator.theundergroundupdate.item.GoldAmethystPickaxeItem;
import net.mcreator.theundergroundupdate.item.EnderitePickaxeItem;
import net.mcreator.theundergroundupdate.item.BaseGoldPickaxeItem;
import net.mcreator.theundergroundupdate.TheUndergroundUpdateModElements;

@TheUndergroundUpdateModElements.ModElement.Tag
public class BoomEnchantment extends TheUndergroundUpdateModElements.ModElement {
	@ObjectHolder("the_underground_update:boom")
	public static final Enchantment enchantment = null;
	public BoomEnchantment(TheUndergroundUpdateModElements instance) {
		super(instance, 254);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("boom"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.DIGGER, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(GoldAmethystPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(MallachitePickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(BaseGoldPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(GoldRubyPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(EnderitePickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(LesserTopazPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.WOODEN_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.STONE_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_PICKAXE, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
