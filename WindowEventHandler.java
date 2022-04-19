import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowEventHandler implements WindowListener {
    @Override
    public void windowClosing(WindowEvent e) {
        // ask the user if they really want to quit
        int answer = JOptionPane.showConfirmDialog(null,"If you quit now your progress won't be saved","Confirm Exit?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // check if they said yes
        if (answer == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // other methods of the interface we can choose to implement
    // these must be here to implement the interface
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
