
public class Manticore extends Monster{
    int health;
    int attack;
    String name;
    public void manticore(int health, int attack){
        this.name = "manticore";
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
