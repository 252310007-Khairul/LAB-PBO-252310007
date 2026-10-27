package Pembelajaran_4_Array;

import javax.swing.JOptionPane;

public class Latihan08 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		int jumlahOrang = 3;
		String data[][] = new String[jumlahOrang][field.length];
		
		for (int i = 0; i < jumlahOrang; i++) {
			for (int j = 0; j < field.length; j++) {
				data[i][j] = jop.showInputDialog(null, "Masukan " + field[j] + ": ", "Data array [" + i + "][" + j + "]", jop.QUESTION_MESSAGE);
			}
		}
		
		String output = "";
		for (int i = 0; i < jumlahOrang; i++) {
			output = output + "Data ke-" + (i + 1) + "\n";
			for (int j = 0; j < field.length; j++) {
				output = output + field[j] + ": " + data[i][j] + "\n";
			}
			output = output + "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}
