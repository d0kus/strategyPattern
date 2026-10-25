package bossfight.target;

public class Hero {
    private String name;
    private int health;
    private int armor;

    public Hero(String name, int health, int armor){
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public void takePhysicalDamage(int rawDamage){
        int realDamage = Math.max(0, rawDamage - this.armor);
        this.health = Math.max(0, this.health - realDamage);

        System.out.println(name + " gets physical damage: " + realDamage + " " + health + " hp left" );
    }
    public void takeMagicalDamage(int magicDamage){
        this.health = Math.max(0, this.health - magicDamage);

        System.out.println(name + " gets magical damage " + magicDamage + " " + health + " hp left");
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
    public boolean isAlive(){
        return this.health > 0;
    }
}
