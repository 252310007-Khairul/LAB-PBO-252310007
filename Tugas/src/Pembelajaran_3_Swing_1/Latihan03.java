package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan03 {

    private static String input(String label) {
        String v = JOptionPane.showInputDialog(null, "Masukkan " + label + ":", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        return v == null ? "" : v.trim();
    }

    public static void main(String[] args) {
        String fullname;
        do {
            fullname = input("Fullname");
            if (fullname.isEmpty())
                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } while (fullname.isEmpty());

        int usia = 0;
        boolean valid = false;
        while (!valid) {
            String usiaStr = input("Usia");
            if (usiaStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!usiaStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                usia = Integer.parseInt(usiaStr);
                valid = true;
            }
        }

        String alamat = "";
        valid = false;
        while (!valid) {
            alamat = input("Alamat");
            if (alamat.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                valid = true;
            }
        }

        Biodata bio = new Biodata();
        bio.simpan(fullname, usia, alamat);
        JOptionPane.showMessageDialog(null, bio.toString(), "Data Diri", JOptionPane.INFORMATION_MESSAGE);
    }
}
