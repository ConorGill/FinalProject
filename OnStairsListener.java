import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnStairsListener implements ActionListener {
    private static int totalLevels=0;
    private GUI goo;
    private JFrame frame;
    public OnStairsListener(JFrame f,GUI gui){
        goo=gui;
        frame=f;
        totalLevels++;
    }
    public static int getTotalLevels(){
        return totalLevels;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(goo.getLastTile().equals(TileType.Stairs)){
            GUI newgoo=new GUI();
            newgoo.setLevel(totalLevels);
            Dungeon.storeDungeon(newgoo);
        }else{
            JOptionPane.showMessageDialog(frame,"You need to be on stairs to go down them ya dingus.");
        }
    }
}
