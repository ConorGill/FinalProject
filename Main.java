
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;

public class Main {
//↑ ↓ ← →
    public static void main(String[] args) {
        setLookAndFeel();
        checkDir();
        Item deafultWeapon=new Item(ItemType.Weapon,0,"FIST",0,5);
        Item deafultArmor=new Item(ItemType.Armor,1,"Rags",0,0);

        Character Poob=new Character(deafultWeapon,deafultArmor);

        JFrame frame= new JFrame("JARPG");
        GUI goo=makeDungeon(frame);
        setUpMenuBar(frame,Poob,goo);
        frame.pack();
        frame.setVisible(true);


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

    private static GUI makeDungeon(JFrame frame){
        JButton up    =  new JButton("↑");
        JButton down  =  new JButton("↓");
        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        GUI goo=new GUI();
        goo.setUpTiles();
        up.addActionListener(new MovementListener(-6,frame,goo));
        down.addActionListener(new MovementListener(6,frame,goo));
        left.addActionListener(new MovementListener(-1,frame,goo));
        right.addActionListener(new MovementListener(1,frame,goo));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.addWindowListener(new WindowEventHandler());
        frame.setSize(620,750);
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());
        frame.setResizable(false);
        //Yeah I know it looks like ass but if fucking works.
        frame.getContentPane().add(goo);
        frame.getContentPane().add(up);
        frame.getContentPane().add(down);
        frame.getContentPane().add(left);
        frame.getContentPane().add(right);
        return goo;
    }
    private static void setUpMenuBar(JFrame frame,Character Poob,GUI goo){
        JMenuBar menubar = new JMenuBar();

        // add the file menu


        JMenu inventory =new JMenu("Inventory");
        inventory.setMnemonic(KeyEvent.VK_I);

        JMenu dungeon =new JMenu("Dungeon");
        inventory.setMnemonic(KeyEvent.VK_D);
        // add a menu item

        JMenuItem equipment=new JMenuItem("Equipment",null);
        equipment.addActionListener(new EquipmentListener(frame,Poob,goo));
        equipment.setMnemonic(KeyEvent.VK_E);

        JMenuItem equipWeapon=new JMenuItem("Equip Weapon",null);
        equipWeapon.setMnemonic(KeyEvent.VK_W);
       equipWeapon.addActionListener(new EquipWeaponListener(frame,Poob,goo));

        JMenuItem equipArmor=new JMenuItem("Equip Armor",null);
        equipArmor.setMnemonic(KeyEvent.VK_A);
        equipArmor.addActionListener(new EquipArmorListener(frame,Poob,goo));

        JMenuItem status=new JMenuItem("Status",null);
        status.addActionListener(new StatusListener(frame,Poob));

        JMenuItem dropItem=new JMenuItem("Drop Item",null);
        dropItem.addActionListener(new DropItemListener(frame,Poob,goo));

        JMenuItem goBack=new JMenuItem("Go back to the Dungeon!",null);
        goBack.addActionListener(new goBackListener(frame,Poob));
        JMenuItem onStairs=new JMenuItem("Go Down the Stairs",null);

        // add the action

        inventory.add(equipment);
        inventory.add(equipWeapon);
        inventory.add(equipArmor);
        inventory.add(status);
        inventory.add(dropItem);
        dungeon.add(goBack);
        // add file to the menubar

        menubar.add(inventory);
        menubar.add(dungeon);

        // add the menubar to the window
        frame.setJMenuBar(menubar);
    }
    private static void checkDir(){
        boolean doesSaveExist=new File("./Images").exists();
        if(!doesSaveExist){
            new File("./Saves").mkdir();
        }
    }
}
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