//creates a ghoul while extending the monster class
public class Ghoul extends Monster{
    int health;
    int attack;
    String name;
    public void ghoul(int health, int attack){ //constructor that sets the monsters name and the stats
        this.name = "ghoul";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){ //getter method that returns the health of the monster
        return this.health;
    }
    public int getAttack(){ //getter method that returns the attack strength of the monster
        return this.attack;
    }
    public String getName(){ //getter method that returns the name of the monster.
        return this.name;
    }

}
