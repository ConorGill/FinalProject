//creates a monster, is extended to the more detailed monsters
public class Monster {
    int health;
    int attack;
    String name;
    public int getHealth(){ //getter method that returns the monsters health
        return this.health;
    }
    public void setHealth(int x){
        this.health=x;
    }
    public int getAttack(){ //getter method that returns the monsters attack strength
        return this.attack;
    }
    public String getName(){ //getter method that returns the monsters name
        return this.name;
    }
}
