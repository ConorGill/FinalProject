
public class Demon extends Monster{
    int health;
    int attack;
    String name;
    public void demon(int health, int attack){
        this.name = "demon";
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
