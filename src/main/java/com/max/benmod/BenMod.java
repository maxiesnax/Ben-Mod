package com.max.benmod;

import com.max.benmod.init.Blockinit;
import com.max.benmod.init.Iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mod")
public class BenMod {
	
	public static final String MOD_ID = "benmod";
	
	public static final CreativeModeTab BEN_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(Iteminit.BEN_EGG.get());
		}
	};

	public BenMod() {
		IEventBus bus  = FMLJavaModLoadingContext.get().getModEventBus();
		
		Iteminit.ITEMS.register(bus);
		Blockinit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}