//Default tile extends GUI
import javax.swing.*;
import java.awt.*;
public class Tile extends GUI{
    private Graphics g;

    //Empty Constructor
    public Tile(){
    }
    @Override
    public void paintComponent(Graphics g){ //Overrides GUI paintComponent
        super.paintComponent(g);
    }
}
