
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.lasertag.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import io.github.stikypiston.lasertag.entity.BlasterEntity;
import io.github.stikypiston.lasertag.entity.AutoblasterEntity;
import io.github.stikypiston.lasertag.LasertagMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LasertagModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LasertagMod.MODID);
	public static final RegistryObject<EntityType<BlasterEntity>> BLASTER = register("projectile_blaster",
			EntityType.Builder.<BlasterEntity>of(BlasterEntity::new, MobCategory.MISC).setCustomClientFactory(BlasterEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AutoblasterEntity>> AUTOBLASTER = register("projectile_autoblaster",
			EntityType.Builder.<AutoblasterEntity>of(AutoblasterEntity::new, MobCategory.MISC).setCustomClientFactory(AutoblasterEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
