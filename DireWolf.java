//creates a direwolf while extending the monster class
public class DireWolf extends Monster{
    int health;
    int attack;
    String name;
    public void direwolf(int health, int attack){ //Constructor that sets the monsters name and stats
        this.name = "direwolf";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //getter method that returns the monsters health
        return this.health;
    }
    public int getAttack(){ //getter method that returns the monsters attack
        return this.attack;
    }
    public String getName(){ //getter method that returns the name of the monster
        return this.name;
    }
}
