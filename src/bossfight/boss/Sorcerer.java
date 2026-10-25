package bossfight.boss;

import bossfight.strategy.MagicStrategy;

public class Sorcerer extends Enemy{
    public Sorcerer(String name, int basePower) {
        super(name, basePower);
        this.strategy = new MagicStrategy();
    }
}
