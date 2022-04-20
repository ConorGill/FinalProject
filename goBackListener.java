import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//returns back to the dungeon screen after viewing the inventory screen
public class goBackListener implements ActionListener {
   private JFrame frame;
   private Character Poob;
    public goBackListener(JFrame f,Character Ploob){
        frame=f;
        Poob=Ploob;
    }
   //generates the needed buttons for the dungeon screen
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.getContentPane().removeAll();
        JButton up    =  new JButton("↑");
        JButton down  =  new JButton("↓");
        JButton left  =  new JButton("←");
        JButton right =  new JButton("→");
        GUI goo=Dungeon.getDungeon();
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
        frame.getContentPane().add(goo);
        frame.getContentPane().add(up);
        frame.getContentPane().add(down);
        frame.getContentPane().add(left);
        frame.getContentPane().add(right);
    }

}
