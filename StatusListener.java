import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatusListener implements ActionListener {
    private Character Poob;
    private JFrame frame;
    public StatusListener(JFrame F,Character Ploob){
        frame=F;
        Poob=Ploob;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,"Health:"+Poob.getHealth()+"\nCarry Capacity:"+Poob.getLoad()
                +"\nWeapon:"+Poob.getEquippedWeapon()+"\nArmor:"+Poob.getEquippedArmor()
                +"\nATK:"+Poob.getEquippedWeapon().getStrength()
                +"\nDEF:"+Poob.getEquippedArmor().getStrength()
                );
    }
}
