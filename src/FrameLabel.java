
import java.awt.Font;
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
public class FrameLabel extends JFrame {

    String kalimat = "Welcome To Java World";
    JLabel label = new JLabel();
//Constructor: untuk inisialisasi
//Mengatur posisi komponen GUI di Frame

    public FrameLabel() {
        setLayout(null);
//Menempatkan JLabel ke dalam panel
        label.setText(kalimat);
        label.setFont(new Font("Tahoma", 1, 18));
        label.setBounds(10, 10, 250, 40);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
//Setting Frame window
        setTitle("Label");
        setVisible(true);
        setSize(270, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FrameLabel();
    }
}
