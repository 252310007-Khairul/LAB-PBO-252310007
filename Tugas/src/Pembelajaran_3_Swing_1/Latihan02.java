package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        String usiaStr  = JOptionPane.showInputDialog(null, "Masukkan Usia:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        String alamat   = JOptionPane.showInputDialog(null, "Masukkan Alamat:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);

        Biodata bio = new Biodata();
        bio.simpan(fullname, Integer.parseInt(usiaStr.trim()), alamat);

        JOptionPane.showMessageDialog(null, bio.toString(), "Data Diri", JOptionPane.INFORMATION_MESSAGE);
    }
}
