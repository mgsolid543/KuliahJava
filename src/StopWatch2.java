
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irpan
 */
public class StopWatch2 extends JFrame implements ActionListener {

    JLabel lbCounter = new JLabel();
    Timer timer = new Timer(100, this);

    int detik = 0;
    int menit = 0;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            if (detik < 59) {
                detik++;
            } else {
                detik = 0;
                menit++;
            }
            lbCounter.setText(menit + ":" + detik);
        }
    }

    public StopWatch2() {
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbCounter.setText("0:0");
        lbCounter.setBounds(10, 40, 270, 80);
        lbCounter.setFont(new Font("Arial", 0, 100));
        lbCounter.setHorizontalAlignment(JLabel.CENTER);
        this.add(lbCounter);

        timer.start();
    }

    public static void main(String[] args) {
        new StopWatch2();
    }
}
