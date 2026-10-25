package bossfight.boss;

import bossfight.strategy.RangedStrategy;

public class Ranger extends Enemy{
    public Ranger(String name, int basePower) {
        super(name, basePower);
        this.strategy = new RangedStrategy();
    }
}
