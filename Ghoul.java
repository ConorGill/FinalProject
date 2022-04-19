public class Ghoul {
    int health;
    int attack;
    String name;
    public void ghoul(int health, int attack){
        this.name = "ghoul"
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
