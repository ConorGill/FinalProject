
public class Vampire {
    int health;
    int attack;
    public void vampire(int health, int attack){
        this.attack = attack;
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }
    public int getAttack(){
        return this.attack;
    }

}