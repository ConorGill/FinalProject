import javax.swing.*;

public class Encounter {
    private  int level=OnStairsListener.getTotalLevels();
    private  Character Poob;
    private JFrame frame;
    public Encounter(JFrame f,Character Ploob){
        Poob=Ploob;
        frame=f;
    }
    public void foight(){
        frame.getContentPane().removeAll();

    }
}
