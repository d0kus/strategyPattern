package bossfight;
import bossfight.strategy.*;
import bossfight.boss.*;
import bossfight.target.Hero;


public class Main {
    public static void main(String[] args){
        Enemy gladiator = new Gladiator("Gladiator", 30);
        Enemy ranger = new Ranger("Ranger", 25);
        Enemy sorcerer = new Sorcerer("Sorcerer", 20);

        Hero target = new Hero("King", 150, 15);

        gladiator.attack(target);
        ranger.attack(target);
        sorcerer.attack(target);

        gladiator.setStrategy(new RangedStrategy());
        gladiator.attack(target);

        ranger.setStrategy(new MagicStrategy());
        ranger.attack(target);

    }
}
