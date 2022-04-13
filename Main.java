
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
    int[] Qo=new int[23];
    int[] woi=new int[]{2,3,4,5,1};
    ArrayList<Integer> boo=new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    System.out.println("What is your max carryweight?");
    int z=input.nextInt();
    Inventory I = new Inventory(z);
    int x=12;
    while(x!=6){
        System.out.println("------------------");
        System.out.println("1. Print inventory");
        System.out.println("2. Add random item");
        System.out.println("3. Drop item");
        System.out.println("4. Equip Weapon");
        System.out.println("5. Equip Armor");
        System.out.println("6. Exit");
        x=input.nextInt();
        I.doTheThing(x);
    }
    }
}
