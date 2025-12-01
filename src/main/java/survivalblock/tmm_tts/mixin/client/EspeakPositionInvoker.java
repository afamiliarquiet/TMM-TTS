package survivalblock.tmm_tts.mixin.client;

import com.flooferland.espeak.Espeak;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Espeak.Position.class)
public interface EspeakPositionInvoker {
    @Invoker("<init>")
    static Espeak.Position newPosition(Espeak.PositionType type, int start, int end) {
        throw new AssertionError();
    }
}
