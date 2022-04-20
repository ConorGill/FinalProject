import java.util.ArrayList;

public class Character {
    private int health=300;
    private int attack;
    private Item equippedWeapon;
    private Item equippedArmor;
    private int defense;
    private ArrayList<Item> inventory;
    public Character(Item wep, Item arm){ //I think this should be good after user input is added to main, just make the default
        this.equippedWeapon = wep;
        this.equippedArmor = arm;
        this.attack = wep.getStrength();
        this.defense = arm.getStrength();
        inventory = new ArrayList<Item>();
        inventory.add(equippedWeapon);
        inventory.add(equippedArmor);
    }
    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
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

    public boolean add(Item i){
        int sum=0;
        for(Item I:inventory){
            sum= I.getWeight() + sum;
        }
        if(sum+i.getWeight()>250){
            return false;
        }
        inventory.add(i);
        return true;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public Item getItem(int x){
        return inventory.get(x);
    }

    public void equipWeapon(int x){
        Item i = inventory.get(x);
        equippedWeapon=i;
        attack=equippedWeapon.getStrength();
    }
    public void equipArmor(int x){
        Item i = inventory.get(x);
        equippedArmor=i;
        defense= equippedArmor.getStrength();
    }
    public String getLoad(){
        int sum=0;
        for(Item i:inventory){
            sum=sum+i.getWeight();
        }
        return sum+"/250";
    }
    public Item getEquippedWeapon(){
        return equippedWeapon;
    }
    public Item getEquippedArmor(){
        return equippedArmor;
    }
    public void removeItem(int X){
        inventory.remove(X);
    }
}
