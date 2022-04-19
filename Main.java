
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        setLookAndFeel();
        JFrame frame= new JFrame("JARPG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,645);
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());
        frame.setResizable(false);
        frame.pack();;
        frame.add(new GUI());
        frame.setVisible(true);
        /*while(x!=6){
        System.out.println("------------------");
        System.out.println("1. Print inventory");
        System.out.println("2. Add random item");
        System.out.println("3. Drop item");
        System.out.println("4. Equip Weapon");
        System.out.println("5. Equip Armor");
        System.out.println("6. Exit");
        x=input.nextInt();
        I.doTheThing(x);
        }*/
    }
    //Thanks Lauren
    private static boolean setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            return true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            return false;
        }
    }
}
