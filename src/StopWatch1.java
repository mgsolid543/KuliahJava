
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
public class StopWatch1 extends JFrame {
    JLabel lbCounter = new JLabel();

    public StopWatch1() {
        this.setLayout(null);
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbCounter.setText("00:00");
        lbCounter.setBounds(10, 40, 270, 80);
        lbCounter.setFont(new Font("Arial", 0, 100));
        lbCounter.setHorizontalAlignment(JLabel.CENTER);
        this.add(lbCounter);
    }
    
    public static void main(String[] args) {
        new StopWatch1();
    }
}
