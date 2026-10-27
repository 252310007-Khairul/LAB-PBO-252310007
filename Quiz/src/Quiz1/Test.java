package Quiz1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		ArrayList<String> daftarBuku = new ArrayList<>();
		int pilihan;
		
		do {
			pilihan = Integer.parseInt(jop.showInputDialog(null, "1. Masukkan Judul Buku\n" +
																"2. Hapus Buku\n" +
																"3. Output Seluruh Data Buku\n" +
																"4. Keluar dari Program\n" +
																"Pilih menu: ", "Pilih Menu", jop.QUESTION_MESSAGE));
			
			switch (pilihan) {
				case 1:
					String judul = jop.showInputDialog(null, "Masukkan judul buku yang ingin di-input: ");
					daftarBuku.add(judul);
					break;
				case 2:
					int index = Integer.parseInt(jop.showInputDialog(null, "Masukkan index buku yang ingin dihapus: "));
					daftarBuku.remove(index);
					break;
				case 3:
					String output = "Data Buku:\n";
					for (int i = 0; i < daftarBuku.size(); i++) {
						output = output + i + ". " + daftarBuku.get(i) + "\n";
					}
					jop.showMessageDialog(null, output);
					break;
			}
		} while (pilihan != 4);
	}
}