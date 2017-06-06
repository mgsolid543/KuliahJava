
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class StopWatch5 extends JFrame implements ActionListener {

    JLabel lbCounter = new JLabel();
    Timer timer = new Timer(1000, this);
    JButton bStart = new JButton("Start");
    JButton bEnd = new JButton("End");

    int detik = 0;
    int menit = 0;
    boolean onOff = false; //petunjuk aktif/tidak nya stopwatch

    public void actionPerformed(ActionEvent e) {
        if (onOff == true) {
            if (e.getSource() == timer) {
                if (detik < 59) {
                    detik++;
                } else {
                    detik = 0;
                    menit++;
                }
                lbCounter.setText(change2Digit(menit) + ":" + change2Digit(detik));
            }
        }

        if (e.getSource() == bStart) {
            onOff = true;
            detik = 0;
            menit = 0;
            lbCounter.setText("00:00");
        }

        if (e.getSource() == bEnd) {
            onOff = false;
            detik = 0;
            menit = 0;
        }
    }

    public String change2Digit(int c) {
        String digit;
        if (c < 10) {
            digit = "0" + c;
        } else {
            digit = "" + c;
        }

        return digit;
    }

    public StopWatch5() {
        this.setLayout(null);
        this.setSize(300, 250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbCounter.setText("00:00");
        lbCounter.setBounds(10, 40, 270, 80);
        lbCounter.setFont(new Font("Arial", 0, 100));
        lbCounter.setHorizontalAlignment(JLabel.CENTER);
        this.add(lbCounter);

        timer.start();

        bStart.setBounds(10, 140, 80, 20);
        this.add(bStart);
        bStart.addActionListener(this);

        bEnd.setBounds(100, 140, 80, 20);
        this.add(bEnd);
        bEnd.addActionListener(this);
    }

    public static void main(String[] args) {
        new StopWatch5();
    }
}
