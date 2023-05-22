import java.awt.*;
import java.awt.event.*;

class Frames3 {
    public static void main(String[] args){

        Frame k=new Frame ();
        k.setVisible(true);
        k.setSize(400,500);
        k.addWindowListener(new Klistener ());
    }
}
class Klistener implements WindowListener{
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window Activated");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window Closed");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deactivated");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window deciconified");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowd iconified");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }
}