
public class Witch {
    int health;
    int attack;
    String name;
    public void witch(int health, int attack){
        this.name = "Witch";
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }
    public int getAttack(){
        return this.attack;
    }
    public String getName(){
        return this.name;
    }

}
