import java.util.ArrayList;
//class that holds the player's icon as well as stats
public class Character {
    private int health=300;
    private int attack;
    private Item equippedWeapon;
    private Item equippedArmor;
    private int defense;
    private ArrayList<Item> inventory;
    public Character(Item wep, Item arm){ //equips items to the player, altering its stats
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
    //set methods are used in combat to change the health values
    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack){
        this.attack = equippedWeapon.getStrength();
    }

    public void setDefense(int defense){
        this.defense = equippedArmor.getStrength();
    }
    //adds item to inventory, returns true if successful
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
    //displays player inventory
    public ArrayList<Item> getInventory(){
        return inventory;
    }
    //gets items in inventory for display
    public Item getItem(int x){
        return inventory.get(x);
    }
    //sets weapons as equipped and their attack as the player's attack
    public void equipWeapon(int x){
        Item i = inventory.get(x);
        equippedWeapon=i;
        attack=equippedWeapon.getStrength();
    }
    //sets armors as equipped and their defense as the player's defense
    public void equipArmor(int x){
        Item i = inventory.get(x);
        equippedArmor=i;
        defense= equippedArmor.getStrength();
    }
    //returns equip load
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
    //drops item
    public void removeItem(int X){
        inventory.remove(X);
    }
}
