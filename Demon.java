//Creates a demon while extending the monster class
public class Demon extends Monster{
    int health;
    int attack;
    String name;
    public void demon(int health, int attack){ //Constructor that sets the name and stats
        this.name = "demon";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //returns the monsters health
        return this.health;
    }
    public int getAttack(){ //returns the monsters attack
        return this.attack;
    }
    public String getName(){ //returns the monsters name
        return this.name;
    }

}
