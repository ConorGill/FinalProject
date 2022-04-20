//creates a witch while extending the monster class
public class Witch extends Monster{
    int health;
    int attack;
    String name;
    public void witch(int health, int attack){ //constructor that sets the monsters name and stats
        this.name = "witch";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //getter method that returns the monsters health
        return this.health;
    }
    public int getAttack(){ //getter method that returns the attack of the monsters attack
        return this.attack;
    }
    public String getName(){ //getter method that returns the monsters attack
        return this.name;
    }

}
