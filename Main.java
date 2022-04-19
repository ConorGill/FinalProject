
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import javax.swing.*;
public class Main {
//↑ ↓ ← →
    public static void main(String[] args) {
        setLookAndFeel();
        JFrame frame= new JFrame("JARPG");
        JButton up    =  new JButton("↑");
        JButton down  =  new JButton("↓");
        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.addWindowListener(new WindowEventHandler());
        frame.setSize(620,750);
        frame.getContentPane();
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());
        frame.setResizable(false);
        frame.add(new GUI());
        //Yeah I know it looks like ass but if fucking works.
        frame.getContentPane().add(up);
        frame.getContentPane().add(down);
        frame.getContentPane().add(left);
        frame.getContentPane().add(right);
        frame.setBackground(Color.BLACK);
        frame.pack();
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

    private static void makeDungeon(){

    }


}
