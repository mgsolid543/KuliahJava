
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irpan
 */
public class AppSplit extends JFrame implements ActionListener {

    JLabel lbData = new JLabel("Data : ");
    JTextField txData = new JTextField(20);
    JButton btSplit = new JButton("Split");
    //Constructor: untuk inisialisasi
    //Mengatur posisi komponen GUI di Frame

    public AppSplit() {
        setLayout(null);
        //Mengatur posisi setiap komponen
        lbData.setBounds(10, 10, 60, 20);
        txData.setBounds(80, 10, 200, 20);
        btSplit.setBounds(300, 10, 80, 20);
        //mengaktifkan button pada saat diKlik
        btSplit.addActionListener(this);
        //Menempatkan JLabel, JTextField dan JButton
        //ke dalam panel
        add(lbData);
        add(txData);
        add(btSplit);
        //Setting Frame window
        setTitle("Method split()");
        setVisible(true);
        setSize(400, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btSplit) {
            doSplit();
        }
    }

    public void doSplit() {
        String str = (String) txData.getText();
        String[] data = str.split(",");
        //Mengatur tampilan hasil pemrosesan method split()
        String hasil = "";
        for (int i = 0; i < data.length; i++) //Setiap elemen array ditampilkan per baris menggunakan \n
        {
            hasil += "data[" + i + "] =" + data[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }

    public static void main(String[] args) {
        new AppSplit();
    }
}
