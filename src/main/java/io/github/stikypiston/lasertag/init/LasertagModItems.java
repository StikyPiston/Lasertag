
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.lasertag.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.stikypiston.lasertag.item.SaberItem;
import io.github.stikypiston.lasertag.item.CarbonArmorItem;
import io.github.stikypiston.lasertag.item.BlasterItem;
import io.github.stikypiston.lasertag.item.AutoblasterItem;
import io.github.stikypiston.lasertag.LasertagMod;

public class LasertagModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LasertagMod.MODID);
	public static final RegistryObject<Item> CARBON_ARMOR_CHESTPLATE = REGISTRY.register("carbon_armor_chestplate",
			() -> new CarbonArmorItem.Chestplate());
	public static final RegistryObject<Item> SABER = REGISTRY.register("saber", () -> new SaberItem());
	public static final RegistryObject<Item> BLASTER = REGISTRY.register("blaster", () -> new BlasterItem());
	public static final RegistryObject<Item> AUTOBLASTER = REGISTRY.register("autoblaster", () -> new AutoblasterItem());
}
