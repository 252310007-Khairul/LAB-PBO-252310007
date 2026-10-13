package Praktikum3;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama, jurusan;
		int umur;
		
		int konfirmasi;
		
		do {
			nama = jop.showInputDialog(null, "Masukkan nama anda: ", "Input Nama", jop.QUESTION_MESSAGE);
			konfirmasi = jop.showConfirmDialog(null, "Apakah benar nama anda " + nama + "?");
		} while (konfirmasi != 0);
		
		jurusan = jop.showInputDialog(null, "Masukkan jurusan: ");
		umur = Integer.parseInt(jop.showInputDialog(null, "Masukkan umur: "));
		
		String output = "Nama anda adalah: " + nama + "\n" +
						"Jurusan anda: " + jurusan + "\n" +
						"Umur anda: " + umur;
	
				jop.showMessageDialog(null, output);
			}
		} 