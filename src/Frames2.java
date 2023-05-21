import java.awt.*;
import java.awt.event.*;
class Frames2 {
    public static void main(String[] args){
        //step 1 adding the component
        Frame f= new Frame("window listoner");
        f.setSize(400,200);
        f.setVisible(true);
        //here  the component created
        f.addWindowListener(new Closelistener());
//here we have connected the below object to the add window listener

    }
}
//now creating a class
//here we are created the class closelistener
class Closelistener implements WindowListener{
    @Override
    public void windowActivated(WindowEvent e) { System.out.println("Activated");}

    @Override
    public void windowClosed(WindowEvent e) {System.out.println("Closed"); }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {System.out.println("opened"); }

    @Override
    public void windowDeactivated(WindowEvent e) { System.out.println("deactivated");}

    @Override
    public void windowDeiconified(WindowEvent e) { System.out.println("deIconified") ;}

    @Override
    public void windowIconified(WindowEvent e) { System.out.println("Iconified") ;}
}