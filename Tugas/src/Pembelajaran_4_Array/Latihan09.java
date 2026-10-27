package Pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int jumlah = Integer.parseInt(jop.showInputDialog(null, "Masukan jumlah array: ", "Input", jop.QUESTION_MESSAGE));
		ArrayList<Integer> nilai = new ArrayList<Integer>();
		
		for (int i = 0; i < jumlah; i++) {
			nilai.add(Integer.parseInt(jop.showInputDialog(null, "Masukan angka: ", "Data array ke-" + i, jop.QUESTION_MESSAGE)));
		}
		
		int terbesar = nilai.get(0);
		int terkecil = nilai.get(0);
		
		String output = "";
		for (int i = 0; i < nilai.size(); i++) {
			output = output + "x[" + i + "]=" + nilai.get(i) + "\n";
			
			if (nilai.get(i) > terbesar) {
				terbesar = nilai.get(i);
			}
			if (nilai.get(i) < terkecil) {
				terkecil = nilai.get(i);
			}
		}
		
		output = output + "Nilai terbesar adalah " + terbesar + "\n" +
						"Nilai terkecil adalah " + terkecil;
		
		jop.showMessageDialog(null, output, "Output Array", jop.INFORMATION_MESSAGE);
	}
}
