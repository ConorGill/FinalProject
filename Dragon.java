
public class Dragon {
    int health;
    int attack;
    String name;
    public void dragon(int health, int attack){
        this.name = "dragon";
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
