package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();

        ArrayList<String> field = new ArrayList<String>();
        field.add("Nama Lengkap");
        field.add("Alamat");
        field.add("No Telp");

        int jumlahOrang = 3;
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < jumlahOrang; i++) {
            data.add(new ArrayList<String>());
            for (int j = 0; j < field.size(); j++) {
                String val = jop.showInputDialog(null, "Masukan " + field.get(j) + ": ", "Data array [" + i + "][" + j + "]", jop.QUESTION_MESSAGE);
                data.get(i).add(val);
            }
        }

        String output = "";
        for (int i = 0; i < data.size(); i++) {
            output = output + "Data ke-" + (i + 1) + "\n";
            for (int j = 0; j < field.size(); j++) {
                output = output + field.get(j) + ": " + data.get(i).get(j) + "\n";
            }
            output = output + "\n";
        }

        jop.showMessageDialog(null, output, "Buku Telepon", jop.INFORMATION_MESSAGE);
    }
}

