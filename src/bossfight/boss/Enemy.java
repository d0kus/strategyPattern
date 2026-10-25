package bossfight.boss;

import bossfight.strategy.CombatStrategy;
import bossfight.target.Hero;

public abstract class Enemy {
    protected String name;
    protected int basePower;
    protected CombatStrategy strategy;

    public Enemy(String name, int basePower){
        this.name = name;
        this.basePower = basePower;
    }

    public void setStrategy(CombatStrategy strategy){
        this.strategy = strategy;
        System.out.println(name + " change strategy to: " + strategy.getStrategyName());
    }

    public void attack(Hero target){
        strategy.execute(this.basePower, target);
    }
}
