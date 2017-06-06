
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irpan
 */
public class AppTabbedPane extends JFrame {

    JTabbedPane tabb = new JTabbedPane();
    JScrollPane sp = new JScrollPane();
    JPanel satu = new JPanel();
    JPanel dua = new JPanel();
    JLabel lbSatu = new JLabel("Ini panel ke-satu");
    JLabel lbDua = new JLabel("Ini panel ke-dua");

    public AppTabbedPane() {
        setLayout(null);
        sp.setBounds(0, 0, 300, 200);
        sp.setViewportView(tabb);
        tabb.addTab("Tampilan 1", satu);
        tabb.addTab("Tampilan 2", dua);
        add(sp);
        satu.add(lbSatu);
        dua.add(lbDua);
        setTitle("Aplikasi TabbedPane");
        setSize(300, 230);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AppTabbedPane();
    }
}
