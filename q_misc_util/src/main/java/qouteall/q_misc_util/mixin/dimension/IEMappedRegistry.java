package qouteall.q_misc_util.mixin.dimension;

import net.minecraft.core.MappedRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MappedRegistry.class)
public interface IEMappedRegistry {
    @Accessor("frozen")
    boolean ip_getIsFrozen();
    
    @Accessor("frozen")
    void ip_setIsFrozen(boolean cond);
}