//class that allows for the characters stats and name to be changed
public class Character {
    private int health;
    private int attack;
    private String name;
    private Item equippedWeapon;
    private Item equippedArmor;
    private int defense;

    public Character(int hp, int atk, String nme, Item wep, Item arm, int def){ //Constructor that decides characters default equipment
        this.health = hp;
        this.attack = atk;
        this.name = nme;
        this.equippedWeapon = wep;
        this.equippedArmor = arm;
        this.defense = def;
    }

    public int getHealth() { //getter method that gets the characters health
        return health;
    }

    public int getAttack() { //getter method that gets the characters attack
        return attack;
    }

    public String getName() { //getter method that gets the characters name
        return name;
    }

    public Item getEquippedArmor() { //getter method that gets the characters currently equipped armor
        return equippedArmor;
    }

    public Item getEquippedWeapon() { //getter method that gets the characters currently equipped weapon
        return equippedWeapon;
    }

    public int getDefense() { //getter method that gets the characters defense
        return defense;
    }

    public void setHealth(int health) { //setter method that will set the users health
        this.health = health;
    }

    public void setAttack(int atk){ //setter method that sets the users attack
        this.attack = atk;
    }

    public void setDefense(int def){ //setter method that sets the users defense
        this.defense = def;
    }

    public void setEquippedWeapon(Item wep){ //setter method that sets the users new equipped weapon
        this.equippedWeapon = wep;
    }

    public void setEquippedArmor(Item arm) { //setter method that sets the users new equipped armor
        this.equippedArmor = arm;
    }
}
