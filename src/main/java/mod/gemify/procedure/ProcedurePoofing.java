package mod.gemify.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import mod.gemify.ElementsGemify;

import java.util.Collection;

@ElementsGemify.ModElement.Tag
public class ProcedurePoofing extends ElementsGemify.ModElement {
	public ProcedurePoofing(ElementsGemify instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Poofing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityPlayer)) {
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1) == 5)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 90, (int) 30, (false), (false)));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 90, (int) 30, (false), (false)));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 90, (int) 5, (false), (false)));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 90, (int) 50, (false), (false)));
				if (((new Object() {
					boolean check() {
						if (entity instanceof EntityLivingBase) {
							Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
							for (PotionEffect effect : effects) {
								if (effect.getPotion() == MobEffects.RESISTANCE)
									return true;
							}
						}
						return false;
					}
				}.check()) != (true))) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LEVITATION, (int) 15, (int) 5, (false), (false)));
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 15, (int) 5, (false), (false)));
				}
			}
		}
	}
}
