
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
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
public class JamDigital extends JFrame implements ActionListener {

    JLabel lbWaktu = new JLabel();
    Timer timer;

    public JamDigital() {
        setTitle("Jam Digital");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 100);
        lbWaktu.setFont(new Font("Arial", 1, 48));
        lbWaktu.setBounds(0, 20, 290, 40);
        lbWaktu.setHorizontalAlignment(JLabel.CENTER);
        add(lbWaktu);
        setWaktu();
        timer = new Timer(1000, this);
        timer.start();
    }

    public void setWaktu() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int jam = kalender.get(Calendar.HOUR_OF_DAY);
        int menit = kalender.get(Calendar.MINUTE);
        int detik = kalender.get(Calendar.SECOND);
        String waktu = jam + ":" + menit + ":" + detik;
        lbWaktu.setText(waktu);
    }

    public void actionPerformed(ActionEvent ae) {
        setWaktu();
    }

    public static void main(String[] args) {
        new JamDigital();
    }
}
