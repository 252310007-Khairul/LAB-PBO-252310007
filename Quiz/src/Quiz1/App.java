package Quiz1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        ArrayList<String> daftarBuku = new ArrayList<>();
        String pilihanInput;

        do {
            String menu = "=== MENU UTAMA ===\n"
                        + "1. Masukkan Judul Buku\n"
                        + "2. Hapus Buku\n"
                        + "3. Output Seluruh Data Buku\n"
                        + "4. Keluar dari Program\n\n"
                        + "Pilih menu (1-4):";

            pilihanInput = jop.showInputDialog(null, menu, "Pilih Menu", jop.QUESTION_MESSAGE);

            if (pilihanInput == null) {
                break;
            }

            switch (pilihanInput) {
                case "1":
                    String judulBuku = jop.showInputDialog(null, "Masukkan Judul Buku yang ingin di-input:", "Input Buku", jop.QUESTION_MESSAGE);
                    if (judulBuku != null && !judulBuku.trim().isEmpty()) {
                        daftarBuku.add(judulBuku);
                    }
                    break;

                case "2":
                    if (!daftarBuku.isEmpty()) {
                        StringBuilder list = new StringBuilder("Daftar Buku:\n");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            list.append(i).append(". ").append(daftarBuku.get(i)).append("\n");
                        }
                        list.append("\nMasukkan Index Buku yang Ingin Dihapus:");

                        String indexInput = jop.showInputDialog(null, list.toString(), "Hapus Buku", jop.QUESTION_MESSAGE);

                        if (indexInput != null) {
                            try {
                                int index = Integer.parseInt(indexInput);
                                if (index >= 0 && index < daftarBuku.size()) {
                                    daftarBuku.remove(index);
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    } else {
                        jop.showMessageDialog(null, "Daftar buku masih kosong!", "Peringatan", jop.WARNING_MESSAGE);
                    }
                    break;

                case "3":
                    if (daftarBuku.isEmpty()) {
                        jop.showMessageDialog(null, "Data buku masih kosong.", "Data Buku", jop.INFORMATION_MESSAGE);
                    } else {
                        StringBuilder output = new StringBuilder("=== SELURUH DATA BUKU ===\n");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            output.append((i + 1)).append(". ").append(daftarBuku.get(i)).append("\n");
                        }
                        jop.showMessageDialog(null, output.toString(), "Data Buku", jop.INFORMATION_MESSAGE);
                    }
                    break;

                case "4":
                    break;

                default:
                    break;
            }

        } while (pilihanInput != null && !pilihanInput.equals("4"));

        System.exit(0);
    }
}