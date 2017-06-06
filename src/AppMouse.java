
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irpan
 */
public class AppMouse extends JFrame implements MouseListener {

    JLabel lbInfo = new JLabel("Java");

    public AppMouse() {
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Aplikasi Mouse");
        add(lbInfo);
        addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
        int x = e.getX() - 5;
        int y = e.getY() - 45;
        lbInfo.setBounds(x, y, 80, 20);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX() - 5;
        int y = e.getY() - 45;
        lbInfo.setBounds(x, y, 80, 20);
    }

    public static void main(String[] args) {
        new AppMouse();
    }
}
