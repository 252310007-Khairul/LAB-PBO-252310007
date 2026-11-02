package Pembelajaran_5_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		int jumlahOrang = 3;
		
		ArrayList<ArrayList<String>> data = new ArrayList<>();
		
		for (int i = 0; i < jumlahOrang; i++) {
			data.add(new ArrayList<String>());
			for (int j = 0; j < field.length; j++) {
				String val = jop.showInputDialog(null, "Masukan " + field[j] + ": ", "Data array [" + i + "][" + j + "]", jop.QUESTION_MESSAGE);
				data.get(i).add(val);
			}
		}
		
		String output = "";
		for (int i = 0; i < data.size(); i++) {
			output = output + "Data ke-" + (i + 1) + "\n";
			for (int j = 0; j < field.length; j++) {
				output = output + field[j] + ": " + data.get(i).get(j) + "\n";
			}
			output = output + "\n";
		}
		
		jop.showMessageDialog(null, output, "Data Mahasiswa", jop.INFORMATION_MESSAGE);
	}
}
