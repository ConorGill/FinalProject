
import java.util.Random;
//Class responsible for generating items
public class ItemGenerator {
    private static Random rng=new Random();
    private static final String[] weaponnames=new String[]{"Sword","Axe","Shovel","Pickaxe","Spear","Wand","Mace","Halberd","Flail","Bow","Longbow","Shortbow","Crossbow","Stick","Light Saber"};
    private static final String[] armornames=new String[]{"Chain-mail","Brigantine","Leather Armor","Plate Armor","Rags","Leather Vest","Robes","Power Armor","Hot Dog Costume","Top Hat"};
    private static final String[] miscnames=new String[]{"Specs","Pocket Watch","Tobacco Pipe","Map","Telescope","Grappling Hook","Rope","Gold Bar","Crown","Necklace"};
    private static final String[] adjectives=new String[]{"Drab","Scruffy","Cool","Opulent","Crappy","Well Made","Shiny","Impressive","Awesome","Wack","Super","Stylish","Ugly","Brittle"};
    private static double modifier;
    //generate an item
    public static Item generate(){
        int weight = rng.nextInt(20+5);
        int value=rng.nextInt(1001);
        int strength;
        ItemType type = null;
        int Type=rng.nextInt(3);
        if(Type==1){
            type=ItemType.Armor;
        }else if(Type==2){
            type=ItemType.Weapon;
        }
            strength= (int) (rng.nextInt(50)+1*modifier);

        String name=generateName(Type,weight,strength,value);
        Item I= new Item(type,weight,name,value,strength);
        return I;
    }
    //Generates a name for the sake of simplification
    public static String generateName(int T,int W,int S,int V){
        String x = "";
        if(T==1){//Armor
        x=adjectives[rng.nextInt(adjectives.length)]+" "+armornames[rng.nextInt(armornames.length)];
            if(W<=5){
                x="Light "+x;
            }else if(W>=45){
                x="Heavy "+x;
            }
            if(S<=5){
                x="Weak "+x;
            }else if(S>=20){
                x="Strong "+x;
            }
            if(V<=100){
                x="Cheap "+x;
            }else if(V>=900){
                x="Fancy "+x;
            }
        }else if(T==2){//Weapon
            x=adjectives[rng.nextInt(adjectives.length)]+" "+weaponnames[rng.nextInt(weaponnames.length)];
            if(W<=5){
                x="Light "+x;
            }else if(W>=45){
                x="Heavy "+x;
            }
            if(S<=5){
                x="Weak "+x;
            }else if(S>=20){
                x="Strong "+x;
            }
            if(V<=100){
                x="Cheap "+x;
            }else if(V>=900){
                x="Fancy "+x;
            }
        }else{//Misc
            x=adjectives[rng.nextInt(adjectives.length)]+" "+miscnames[rng.nextInt(miscnames.length)];
            if(W<=5){
                x="Light "+x;
            }else if(W>=45){
                x="Heavy "+x;
            }
            if(V<=100){
                x="Cheap "+x;
            }else if(V>=900){
                x="Fancy "+x;
            }
        }
        return x;
    }
    public static void setModifier(double level){
        double x=level/10;
        if(level>8){
            x=1.8;
        }
        modifier=x;
    }
}
