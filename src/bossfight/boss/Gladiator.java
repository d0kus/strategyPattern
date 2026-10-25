package bossfight.boss;

import bossfight.strategy.MeleeStrategy;

public class Gladiator extends Enemy {
    public Gladiator(String name, int basePower) {
        super(name, basePower);
        this.strategy = new MeleeStrategy();
    }
}
