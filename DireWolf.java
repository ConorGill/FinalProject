public class DireWolf {
    int health;
    int attack;
    String name;
    public void direwolf(int health, int attack){
        this.name = "direwolf";
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
