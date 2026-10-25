package bossfight.strategy;

import bossfight.target.Hero;

public class RangedStrategy implements CombatStrategy{
    @Override
    public void execute(int basePower, Hero target) {
        int fullPower = (int) (basePower * 1.2);
        target.takePhysicalDamage(fullPower);
    }

    @Override
    public String getStrategyName() {
        return "Ranged Strategy";
    }
}
