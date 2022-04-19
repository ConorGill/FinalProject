
public class Rat {
    int health;
    int attack;
    String name;
    public void rat(int health, int attack){
        this.name = "rat";
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
