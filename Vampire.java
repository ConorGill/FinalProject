
public class Vampire {
    int health;
    int attack;
    String name;
    public void vampire(int health, int attack){
        this.name = "vampire";
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
