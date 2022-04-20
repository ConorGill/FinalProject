import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//Allows for armor to be equipped extends ActionListener
public class EquipArmorListener implements ActionListener {
    private JFrame frame;
    private int counter=0;
    private Character Poob;
    private final int padington=16;
    private ArrayList<Integer> indices;
    private GUI goo;
    public EquipArmorListener(JFrame f,Character Ploob,GUI gui){ //Constructor that sets the frame, character and GUI.
        frame=f; //Maybe remove the link below lol
        Poob=Ploob;//https://www.youtube.com/watch?v=UNSPeyf_DN0&t=685s
        goo=gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //adds layer to frame for armor
        frame.getContentPane().removeAll();
        Dungeon.storeDungeon(goo);
        int visibleCount=0;
        indices=new ArrayList<Integer>();
        frame.add(new EquipmentScreen());
        Box padding = Box.createHorizontalBox();
        Box inventoryLines=Box.createVerticalBox();

        padding.add(Box.createHorizontalStrut(padington));
        padding.add(inventoryLines);
        padding.add(Box.createHorizontalStrut(padington));

        inventoryLines.add(Box.createVerticalStrut(padington));

        Box layer=Box.createHorizontalBox();
        for(int c=0;c<60 &&c<Poob.getInventory().size();c++){
            Item printOut=Poob.getItem(c+60*counter);
            if(printOut.getType().equals(ItemType.Armor)){
                indices.add(c);
                visibleCount++;
                layer.add(new JLabel(visibleCount+60*counter+"."+printOut.getName()
                        +" DEF:"+printOut.getStrength()
                        +" WGH:"+ printOut.getWeight()));
                layer.add(Box.createHorizontalGlue());
                inventoryLines.add(layer);
            }
        }

        inventoryLines.add(Box.createVerticalStrut(padington));

        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        JButton equip=new JButton("Equip Armor");
        left.addActionListener(this::lastPage);
        right.addActionListener(this::nextPage);
        equip.addActionListener(this::EquipArmor);
        layer.add(left);
        layer.add(right);
        layer.add(equip);
        frame.add(inventoryLines);
        frame.pack();
    }

    private void EquipArmor(ActionEvent actionEvent) { //Equips the armor
        int getArmor= Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter in the number of your desired piece of Armor"))-1;
        Poob.equipArmor(indices.get(getArmor));
    }

    private void nextPage(ActionEvent actionEvent) { //goes to the next page in the inventory
        if(Poob.getInventory().size()<(counter+1)*60){
            JOptionPane.showMessageDialog(frame,"No more items left.");
        }else{
            counter++;
        }

    }

    private void lastPage(ActionEvent actionEvent) { //goes to the previous page in the inventory
        if((counter-1)*60<0){
            JOptionPane.showMessageDialog(frame,"Can't go back.");
        }else{
            counter--;
        }
    }
}
