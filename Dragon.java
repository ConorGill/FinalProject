//creates a dragon while extending the monster class
public class Dragon extends Monster{
    int health;
    int attack;
    String name;
    public void dragon(int health, int attack){ //Constructor that sets the monsters name and stats
        this.name = "dragon";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //Getter method that returns the monsters health
        return this.health;
    }
    public int getAttack(){ //getter method that returns the monsters attack
        return this.attack;
    }
    public String getName(){ //getter method that returns the monsters name
        return this.name;
    }

}
