package wily.legacy.init;

import net.minecraft.client.OptionInstance;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Unique;

public interface LegacyOptions {


    OptionInstance<Double> hudDistance();
    OptionInstance<Double> hudOpacity();
    OptionInstance<Boolean> legacyCreativeTab();
    OptionInstance<Boolean> displayHUD();
    OptionInstance<Boolean> animatedCharacter();
    OptionInstance<Boolean> classicCrafting();
}