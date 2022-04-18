import javax.swing.*;
import javax.swing.*;
import java.awt.*;
public class GUI extends JComponent {

    public GUI(){

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,650,650);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,5,600);
        for(int c=0;c<6;c++){
            g.fillRect(100*c+100,0,5,605);
            g.fillRect(0,100*c+100,600,5);
        }
    }
}
