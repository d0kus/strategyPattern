package bossfight.strategy;
import bossfight.target.Hero;

public interface CombatStrategy {
    void execute(int basePower, Hero target);

    String getStrategyName();
}
