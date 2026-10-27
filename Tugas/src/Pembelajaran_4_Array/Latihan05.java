package Pembelajaran_4_Array;

import javax.swing.JOptionPane;

public class Latihan05 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		String data[] = new String[field.length];
		
		for (int i = 0; i < field.length; i++) {
			data[i] = jop.showInputDialog(null, "Masukan " + field[i] + ": ", "Data array ke-" + i, jop.QUESTION_MESSAGE);
		}
		
		String output = "";
		for (int i = 0; i < field.length; i++) {
			output = output + field[i] + ": " + data[i] + "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}
