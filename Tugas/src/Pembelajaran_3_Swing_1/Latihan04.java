package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan04 {

    private static String input(String label) {
        while (true) {
            String v = JOptionPane.showInputDialog(null, "Masukkan " + label + ":", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
            if (v != null) return v.trim();
            if (konfirmasiKeluar()) System.exit(0);
        }
    }

    private static boolean konfirmasiKeluar() {
        int p = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return p == JOptionPane.YES_OPTION;
    }

    public static void main(String[] args) {
        while (true) {
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

            if (konfirmasiKeluar()) break;   
        }
    }
}	