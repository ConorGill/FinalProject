
//Class meant to represent a single item object
public class Item {
    private ItemType type;
    private int weight;
    private String name;
    private int value;
    private int strength;
    Item(){
        this.type=ItemType.Armor;
        this.weight=99;
        this.name="Squib";
        this.value=35;
        this.strength=12;
    }
    //Typical constructor
    Item(ItemType T,int W,String N,int V,int S){
        this.type=T;
        this.weight=W;
        this.name=N;
        this.value=V;
        this.strength=S;
    }
    //prints out an items info
    public String printInfo(){
        return name+"\t\t\t"+this.weight+"\t"+this.value+"\t"+this.strength+"\t"+this.type;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getValue(){
        return this.value;
    }
    public ItemType getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
}
