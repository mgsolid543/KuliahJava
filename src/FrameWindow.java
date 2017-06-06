
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irpan
 */
public class FrameWindow extends JFrame {
//Constructor: untuk menset window

    public FrameWindow() {
//Setting Frame window
        setTitle("Pesan");
        setVisible(true);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FrameWindow(); //memanggil constructor
    }
}
