//Creates a manticore while extending the monster class
public class Manticore extends Monster{
    int health;
    int attack;
    String name;
    public void manticore(int health, int attack){ //Constructor that sets the monsters name and stats
        this.name = "manticore";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //getter method that returns health
        return this.health;
    }
    public int getAttack(){ //getter method that returns monsters attack
        return this.attack;
    }
    public String getName(){ //getter method that returns monsters name
        return this.name;
    }

}
