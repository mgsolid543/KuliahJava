
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irpan
 */
public class FrameAbstractTable extends JFrame {

    JLabel jLabel1;
    JScrollPane jScrollPane1;
    JTable jTable;

    public FrameAbstractTable() {
        initComponents();
        jTable.setModel(new MyTableModel());
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jTable.getColumnModel().getColumn(i);
            if (i == 2) {
                column.setPreferredWidth(100);
            } else {
                column.setPreferredWidth(80);
            }
        }
    }

    public void initComponents() {
        jTable = new JTable();
        jScrollPane1 = new JScrollPane();
        jLabel1 = new JLabel("Data Table");
        jScrollPane1.setViewportView(jTable);
        setLayout(null);
        jLabel1.setBounds(10, 10, 100, 20);
        jScrollPane1.setBounds(10, 30, 470, 150);
        add(jLabel1);
        add(jScrollPane1);
        setVisible(true);
        setSize(500, 230);
        setTitle("AbstractTableModel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new FrameAbstractTable();
    }
}

class MyTableModel extends AbstractTableModel {

    int columnCount = 0;
    String[] columnNames = {"Nama", "Harga", "Jenis"};
    String[][] data = {
        {"Ballpoint", "20000", "ATK"}, {"Lemari Es", "4500000", "ELK"},
        {"Rak Buku", "780000", "MBL"}, {"Sprinb Bed", "3600000", "MBL"},
        {"Buku Tulis", "19000", "ATK"}, {"Komputer", "7700000", "ELK"}};

    public MyTableModel() {
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public String getValueAt(int row, int col) {
        return data[row][col];
    }

    public boolean isCellEditable(int row, int col) {
        if (col < 2) {
            return false;
        } else {
            return true;
        }
    }

    public void setValueAt(String value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
