import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//reprints the floor after the player has moved, updating postions
public class MovementListener implements ActionListener {
    private int modifier;
    private JFrame frame;
    private GUI goo;
    private Character Poob;
    public MovementListener(int x, JFrame F,GUI Gui,Character Ploob){ //constructor that sets the modifier, frame, character and GUI
        modifier=x;
        frame=F;
        goo=Gui;
        Poob=Ploob;
    }
    @Override
    public void actionPerformed(ActionEvent e) { //generates encounter upon moving
        goo.movePlayer(modifier);
        Random rng = new Random();
        Encounter eggs;

             eggs=new Encounter(frame,Poob,TileType.UnVisited);

             eggs=new Encounter(frame,Poob,goo.getLastTile());


        eggs.foight();
        frame.add(goo);

    }
}
