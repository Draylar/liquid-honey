package com.github.draylar.betterbees.registry;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.github.draylar.betterbees.BetterBees;
import com.github.draylar.betterbees.honey.HoneyBucketItem;
import com.github.draylar.betterbees.item.BeeStingerItem;
import com.github.draylar.betterbees.item.HiveAnalyzerItem;

public class BeeItems {
	
	public static final Item HONEY_BUCKET = register("honey_bucket", new HoneyBucketItem(settings().maxCount(1).recipeRemainder(Items.BUCKET)));
	public static final Item BEESWAX_FLAKE = register("beeswax_flake", new Item(settings()));
	public static final Item COMPRESSED_BEESWAX = register("compressed_beeswax", new Item(settings()));
	public static final Item BEE_STINGER = register("bee_stinger", new BeeStingerItem(settings()));
	public static final Item HIVE_ANALYZER = register("hive_analyzer", new HiveAnalyzerItem(settings().maxCount(1)));
	
	private BeeItems() {
		// NO-OP
	}
	
	static Item register(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(BetterBees.MODID, name), item);
	}
	
	static Item.Settings settings() {
		return new Item.Settings().group(BetterBees.GROUP);
	}
	
	public static void init() {
		// NO-OP
	}
}
