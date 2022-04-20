import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Used for the equipment screen to work
public class EquipmentListener implements ActionListener {
    private JFrame frame;
    private int counter=0;
    private Character Poob;
    private final int padington=25;
    private GUI goo;
    public EquipmentListener(JFrame f,Character Ploob,GUI gui){ //Constructor that sets the frame, character and GUI
        frame=f;
        Poob=Ploob;//https://www.youtube.com/watch?v=UNSPeyf_DN0&t=685s
        goo=gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //Adds layer to equipment screen that allows for items to be displayed.
        frame.getContentPane().removeAll();
        Dungeon.storeDungeon(goo);
        frame.add(new EquipmentScreen());
        Box padding = Box.createHorizontalBox();
        Box inventoryLines=Box.createVerticalBox();

        padding.add(Box.createHorizontalStrut(padington));
        padding.add(inventoryLines);
        padding.add(Box.createHorizontalStrut(padington));

        inventoryLines.add(Box.createVerticalStrut(padington));

        Box layer=Box.createHorizontalBox();
        for(int c=0;c<60 &&c<Poob.getInventory().size();c++){
            layer=Box.createHorizontalBox();
            Item printOut=Poob.getItem(c+60*counter);
            JLabel J=new JLabel((c+1+60*counter)+"."+printOut.getName()
                    +" TYP:"+printOut.getType()
                    +" STR:"+printOut.getStrength()
                    +" WGH:"+ printOut.getWeight());
            layer.add(J);
            layer.add(Box.createHorizontalGlue());
            inventoryLines.add(layer);
        }

        inventoryLines.add(Box.createVerticalStrut(padington));

        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        left.addActionListener(this::lastPage);
        right.addActionListener(this::nextPage);
        layer.add(left);
        layer.add(right);
        frame.add(inventoryLines);
        frame.pack();
    }

    private void nextPage(ActionEvent actionEvent) { //goes to the next page in the inventory
        if(Poob.getInventory().size()<(counter+1)*60){
            JOptionPane.showMessageDialog(frame,"No more items left.");
        }else{
            counter++;
            draw();
        }

    }

    private void lastPage(ActionEvent actionEvent) { //goes to the previous page in the inventory
        if((counter-1)*60<0){
            JOptionPane.showMessageDialog(frame,"Can't go back.");
        }else{
            counter--;
            draw();
        }
    }
    public void draw(){ //prints the items to the screen
        Boolean b=false;
        frame.getContentPane().removeAll();
        Dungeon.storeDungeon(goo);
        frame.add(new EquipmentScreen());
        Box padding = Box.createHorizontalBox();
        Box inventoryLines=Box.createVerticalBox();

        padding.add(Box.createHorizontalStrut(padington));
        padding.add(inventoryLines);
        padding.add(Box.createHorizontalStrut(padington));

        inventoryLines.add(Box.createVerticalStrut(padington));

        Box layer=Box.createHorizontalBox();
        for(int c=0;c<60 &&c<Poob.getInventory().size();c++){
            layer=Box.createHorizontalBox();
            if(c+60*counter>=Poob.getInventory().size()){
                b=true;
            }else{
                Item printOut=Poob.getItem(c+60*counter);
                JLabel J=new JLabel((c+1+60*counter)+"."+printOut.getName()
                        +" TYP:"+printOut.getType()
                        +" STR:"+printOut.getStrength()
                        +" WGH:"+ printOut.getWeight());
                layer.add(J);
                layer.add(Box.createHorizontalGlue());
                inventoryLines.add(layer);
            }
        }

        inventoryLines.add(Box.createVerticalStrut(padington));

        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        left.addActionListener(this::lastPage);
        right.addActionListener(this::nextPage);
        layer.add(left);
        layer.add(right);
        if(b){
            inventoryLines.add(layer);
        }
        frame.add(inventoryLines);
        frame.pack();
    }

}
