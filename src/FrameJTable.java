
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irpan
 */
public class FrameJTable extends JFrame {

    String[] judul = {"Nama", "Harga", "Jenis"};
    JTable tabel;
    JScrollPane sp;

    public FrameJTable() {
        String[][] data = {
            {"Ballpoint", "20000", "ATK"}, {"Lemari Es", "4500000", "ELK"},
            {"Rak Buku", "780000", "MBL"}, {"Sprinb Bed", "3600000", "MBL"},
            {"Buku Tulis", "19000", "ATK"}, {"Komputer", "7700000", "ELK"}};
        tabel = new JTable(data, judul);
        sp = new JScrollPane(tabel);
        add(sp);
        setTitle("JTable");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new FrameJTable();
    }
}
