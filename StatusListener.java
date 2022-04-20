import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//shows dialogue boxes when there is a change in status
public class StatusListener implements ActionListener {
    private Character Poob;
    private JFrame frame;
    public StatusListener(JFrame F,Character Ploob){
        frame=F;
        Poob=Ploob;
    }
    @Override
    public void actionPerformed(ActionEvent e) { //shows change in equipment and character stats
        JOptionPane.showMessageDialog(frame,"Health:"+Poob.getHealth()+"\nCarry Capacity:"+Poob.getLoad()
                +"\nWeapon:"+Poob.getEquippedWeapon()+"\nArmor:"+Poob.getEquippedArmor()
                +"\nATK:"+Poob.getEquippedWeapon().getStrength()
                +"\nDEF:"+Poob.getEquippedArmor().getStrength()
                );
    }
}
