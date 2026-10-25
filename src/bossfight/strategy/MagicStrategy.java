package bossfight.strategy;

import bossfight.target.Hero;

public class MagicStrategy implements CombatStrategy{
    @Override
    public void execute(int basePower, Hero target) {
        target.takeMagicalDamage(basePower);
    }

    @Override
    public String getStrategyName() {
        return "Magic Strategy";
    }
}
