//generates the dungeon layout based on the available tiles
import javax.swing.*;

public class Dungeon {
    private static GUI goo;
    private static Character Poob;
    public static void storeDungeon(GUI goober){
        goo=goober;

    }
    public static GUI getDungeon(){
        return goo;
    }
    public static void getPoob(Character Ploob){
        Poob=Ploob;
    }
    public static void makeDungeon(JFrame frame){
        JButton up    =  new JButton("↑");
        JButton down  =  new JButton("↓");
        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        GUI goo=new GUI();
        goo.setUpTiles();
        up.addActionListener(new MovementListener(-6,frame,goo,Poob));
        down.addActionListener(new MovementListener(6,frame,goo,Poob));
        left.addActionListener(new MovementListener(-1,frame,goo,Poob));
        right.addActionListener(new MovementListener(1,frame,goo,Poob));
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
    }
}
