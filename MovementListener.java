import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class MovementListener implements ActionListener {
    private int modifier;
    private JFrame frame;
    private GUI goo;
    public MovementListener(int x, JFrame F,GUI Gui){
        modifier=x;
        frame=F;
        goo=Gui;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        goo.movePlayer(modifier);
        Random rng = new Random();
        double chance = rng.nextDouble()*100+1;
        frame.add(goo);

    }
}
