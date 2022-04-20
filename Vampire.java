//Creates a vampire while extending the monster class
public class Vampire extends Monster{
    int health;
    int attack;
    String name;
    public void vampire(int health, int attack){ //constructor that sets the monsters name and stats
        this.name = "vampire";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //returns the health of the monster
        return this.health;
    }
    public int getAttack(){ //returns the attack of the monster
        return this.attack;
    }
    public String getName(){ //returns the name of the monster
        return this.name;
    }

}
