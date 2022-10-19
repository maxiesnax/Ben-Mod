package com.max.benmod.init;

import com.google.common.base.Supplier;
import com.max.benmod.BenMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			BenMod.MOD_ID);
	
	public static final RegistryObject<Item> BEN_EGG = register("ben_egg",
			() -> new Item(new Item.Properties().tab(BenMod.BEN_TAB)));
		
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}

}