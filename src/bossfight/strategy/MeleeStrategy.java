package bossfight.strategy;

import bossfight.target.Hero;

public class MeleeStrategy implements CombatStrategy {
    @Override
    public void execute(int basePower, Hero target) {
        int fullPower = (int) (basePower * 1.5);
        target.takePhysicalDamage(fullPower);
    }

    @Override
    public String getStrategyName() {
        return "Melee Strategy";
    }
}
