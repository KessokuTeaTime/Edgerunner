package net.krlite.edgerunner.mixin;

import net.krlite.edgerunner.Edgerunner;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Optional;

@Mixin(Entity.class)
public class EntityMixin {
	@Redirect(method = "updateSupportingBlockPos", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;findSupportingBlockPos(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Box;)Ljava/util/Optional;"))
	private Optional<BlockPos> updateSupportingBlockPos(World world, Entity entity, Box box) {
		if (entity.getWorld().getGameRules().getBoolean(Edgerunner.EDGERUNNER)) {
			return Optional.ofNullable(entity.getBlockPos());
		} else {
			return world.findSupportingBlockPos(entity, box);
		}
	}
}
