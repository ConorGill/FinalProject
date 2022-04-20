//Manages the users inventory
import java.util.ArrayList;
//Class responsible for managing the users inventory
import java.util.Scanner;
public class Inventory {
    private ArrayList<Item> inv=new ArrayList<>();
    private int carrycapacity;
    private Item equippedWeapon=null;
    private Item equippedArmor=null;
    //Constructor for the Inventory class
    Inventory(int CC){
        this.carrycapacity=CC;
    }
    //Method that lets me call a specific method in the class without having a messy if chain in the main block.
    public void doTheThing(int x){
        Scanner input=new Scanner(System.in);
        if(x==1){
            print();
        }else if(x==2){
            Item i=ItemGenerator.generate();
            if(add(i)){
            }else{
                System.out.println("This is item is too heavy.");
                System.out.println("Do you want to make room for the item? 1 for yes 2 for no");
                int in=input.nextInt();
                if(in==1){
                    while(i.getWeight()+totalWeight()>this.carrycapacity){
                        drop();
                    }
                }
            }
        }else if(x==3){
            drop();
        }else if(x==4){
            equipWeapon();
        }else if(x==5){
            equipArmor();
        }
    }
    //Gets total weight of the inventory
    public int totalWeight(){
        int x=0;
        for(Item i:inv){
            x=x+i.getWeight();
        }
        return x;
    }
    //Determines if an item can fit and then adds it or returns false
    public Boolean add(Item i){
        if(i.getWeight()+totalWeight()<this.carrycapacity){
            inv.add(i);
            System.out.println("Added " + i.getName());
            return true;
        }else{
            return false;
        }
    }
    //Prints inventory as well as the weapons and armor equipped.
    public void print(){
        int x=1;
        System.out.println(totalWeight()+"/"+this.carrycapacity);
        System.out.println("Item\t\t\t\t\t\tWeight\tValue\tStrength\tType");
        for(Item i:inv){
            System.out.println(x+"."+i.printInfo());
            x++;
        }
        if(this.equippedWeapon==null){
            System.out.println("Weapon:None");
        }else{
            System.out.println("Weapon:"+this.equippedWeapon.printInfo());
        }
        if(this.equippedArmor==null){
            System.out.println("Armor:None");
        }else{
            System.out.println("Armor:"+this.equippedArmor.printInfo());
        }
        System.out.println("------------------");
    }
    //Allows user to equip a Weapon
    public void equipWeapon(){
        Scanner input = new Scanner(System.in);
        int x=0,Z=0;
        ArrayList<Integer> z=new ArrayList<>();
        System.out.println("Pick a weapon to equip.");
        System.out.println("Item\t\t\t\t\t\tWeight\tValue\tStrength\tType");
        for(Item i:inv){
                Z++;
                if(i.getType()==ItemType.Weapon){
                    x++;
                    z.add(Z-1);
                    System.out.println(x+"."+i.printInfo());
                }
        }
        if(x==0){
            System.out.println("You currently have no Weapons.");
        }else {
            int X = input.nextInt();
            if(X<=0||X>x){
                System.out.println("Invalid input");
            }else {
                this.equippedWeapon = inv.get(z.get(X-1));
                this.inv.remove(inv.get(z.get(X-1)));//I'm asking about this specific statement
                //this.inv.remove(z.get(X-1))
            }
        }
        System.out.println("------------------");
    }
    //Allows user to equip Armor
    public void equipArmor(){
        Scanner input = new Scanner(System.in);
        int x=0,Z=0;
        ArrayList<Integer> z=new ArrayList<>();
        System.out.println("Pick a piece of armor to equip.");
        System.out.println("Item\t\t\t\t\t\tWeight\tValue\tStrength\tType");
        for(Item i:inv){
            Z++;
            if(i.getType()==ItemType.Armor){
                x++;
                z.add(Z-1);
                System.out.println(x+"."+i.printInfo());
            }
        }
        if(x==0){
            System.out.println("You currently have no Armor.");
        }else {
            int X = input.nextInt();
            if(X<=0||X>x){
                System.out.println("Invalid input");
            }else {
                this.equippedArmor = inv.get(z.get(X-1));
                this.inv.remove(inv.get(z.get(X-1)));
            }
        }
        System.out.println("------------------");
    }
    //Drops a specific item and checks if the input isn't correct or if they have an inventory gives them a response
    public void drop(){
        Scanner input = new Scanner(System.in);
        if(inv.size()!=0){
            print();
            System.out.println("Which item do you want to drop");
            int i = input.nextInt();
            if (i <= 0 || i > inv.size()) {
                System.out.println("Wrong number");
            } else {
                System.out.println("Dropped "+inv.get(i-1).getName());
                inv.remove(i - 1);
            }
        }else{
            System.out.println("You have nothing to drop!");
        }
    }
}
