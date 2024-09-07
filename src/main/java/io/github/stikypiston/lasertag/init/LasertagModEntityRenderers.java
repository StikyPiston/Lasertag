
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.lasertag.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LasertagModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LasertagModEntities.BLASTER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(LasertagModEntities.AUTOBLASTER.get(), ThrownItemRenderer::new);
	}
}
