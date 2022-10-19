package com.max.benmod.recipe;

import com.max.benmod.BenMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, BenMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<AmethystIngot>> AMETHYST_INGOT_SERIALIZER =
            SERIALIZERS.register("amethyst_ingot", () -> AmethystIngot.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
