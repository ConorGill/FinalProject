import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropItemListener implements ActionListener {
    private Character Poob;
    private JFrame frame;
    private int counter;
    private int padington=16;
    private GUI goo;
    public DropItemListener(JFrame F,Character Ploob,GUI gui){
        frame=F;
        Poob=Ploob;
        goo=gui;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
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
        JButton dropIt=new JButton("Drop");
        dropIt.addActionListener(this::dropItem);
        layer.add(dropIt);
        frame.add(inventoryLines);
    }

    private void dropItem(ActionEvent actionEvent) {
        int getItem= Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter in the number of the item you want to drop"))-1;
        Poob.removeItem(getItem);
    }

    private void nextPage(ActionEvent actionEvent) {
        if(Poob.getInventory().size()<(counter+1)*60){
            JOptionPane.showMessageDialog(frame,"No more items left.");
        }else{
            counter++;
            draw();
        }

    }

    private void lastPage(ActionEvent actionEvent) {
        if((counter-1)*60<0){
            JOptionPane.showMessageDialog(frame,"Can't go back.");
        }else{
            counter--;
            draw();
        }
    }
    public void draw(){
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
