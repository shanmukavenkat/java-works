import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Frames3 {
    public static void main(String args[]){

        Frame k=new Frame ();
        k.setVisible(true);
        k.setSize(400,500);
        k.addWindowListener(new Klistener ());
    }
}
class Klistener implements WindowListener{
    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }
}