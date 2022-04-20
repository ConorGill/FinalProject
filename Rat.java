//creates a rat while extending the monster class
public class Rat extends Monster{
    int health;
    int attack;
    String name;
    public void rat(int health, int attack){ //constructor that sets the name and stats
        this.name = "rat";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //getter method that returns the monsters health
        return this.health;
    }
    public int getAttack(){ //getter method that returns the monsters
        return this.attack;
    }
    public String getName(){ //getter method that returns the name of the monster
        return this.name;
    }

}
