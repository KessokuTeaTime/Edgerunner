package band.kessokuteatime.edgerunner;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Edgerunner implements ModInitializer {
	public static final String NAME = "Edgerunner", ID = "edgerunner";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);
	public static final CustomGameRuleCategory FEATURES =
			new CustomGameRuleCategory(new Identifier(ID, "features"), Text.translatable("category.edgerunner.features"));
	public static final GameRules.Key<GameRules.BooleanRule> EDGERUNNER =
			GameRuleRegistry.register("edgerunner", FEATURES, GameRuleFactory.createBooleanRule(false));

	@Override
	public void onInitialize() {
	}
}
