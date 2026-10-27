package Pembelajaran_4_Array;

import javax.swing.JOptionPane;

public class Latihan04 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int jumlah = Integer.parseInt(jop.showInputDialog(null, "Masukan jumlah array: ", "Input", jop.QUESTION_MESSAGE));
		int nilai[] = new int[jumlah];
		
		for (int i = 0; i < jumlah; i++) {
			nilai[i] = Integer.parseInt(jop.showInputDialog(null, "Masukan angka: ", "Data array ke-" + i, jop.QUESTION_MESSAGE));
		}
		
		int terbesar = nilai[0];
		int terkecil = nilai[0];
		
		String output = "";
		for (int i = 0; i < jumlah; i++) {
			output = output + "x[" + i + "]=" + nilai[i] + "\n";
			
			if (nilai[i] > terbesar) {
				terbesar = nilai[i];
			}
			if (nilai[i] < terkecil) {
				terkecil = nilai[i];
			}
		}
		
		output = output + "Nilai terbesar adalah " + terbesar + "\n" +
						"Nilai terkecil adalah " + terkecil;
		
		jop.showMessageDialog(null, output, "Output Array", jop.INFORMATION_MESSAGE);
	}
}
