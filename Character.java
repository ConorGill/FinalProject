
public class Character {
    private int health;
    private int attack;
    private String name;
    private Item equippedWeapon;
    private Item equippedArmor;
    private int defense;

    public Character(int hp, int atk, String nme, Item wep, Item arm, int def){ //I think this should be good after user input is added to main, just make the default
        //health 300 in main, and defense 1 or something.
        this.health = hp;
        this.attack = atk;
        this.name = nme;
        this.equippedWeapon = wep;
        this.equippedArmor = arm;
        this.defense = def;
    }
    public int getHealth() {
        return health;
    }
    public int getAttack() {
        return attack;
    }
    public String getName() {
        return name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAttack(int attack){
        this.attack = equippedWeapon.getStrength();
    }
    public void setDefense(int defense){
        this.defense = equippedArmor.getStrength();
    }
}
