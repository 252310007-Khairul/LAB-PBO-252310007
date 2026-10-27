package Pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 0; i < field.length; i++) {
			data.add(jop.showInputDialog(null, "Masukan " + field[i] + ": ", "Data array ke-" + i, jop.QUESTION_MESSAGE));
		}
		
		String output = "";
		for (int i = 0; i < data.size(); i++) {
			output = output + field[i] + ": " + data.get(i) + "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}
