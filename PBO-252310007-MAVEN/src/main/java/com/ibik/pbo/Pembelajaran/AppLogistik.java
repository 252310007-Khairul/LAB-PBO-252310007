package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        ArrayList<ArrayList<String>> dataPesanan = new ArrayList<ArrayList<String>>();

        while (true) {
            String menu = "=== PT. XYZ LOGISTIK ===\n"
                        + "1. Input Pesanan\n"
                        + "2. Tracking Pesanan\n"
                        + "3. Keluar\n\n"
                        + "Pilih menu (1-3):";

            String pilihan = jop.showInputDialog(null, menu, "Menu Utama", jop.QUESTION_MESSAGE);

            if (pilihan == null) {
                int konfirmasi = jop.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi", jop.YES_NO_OPTION);
                if (konfirmasi == jop.YES_OPTION) {
                    System.exit(0);
                } else {
                    continue;
                }
            }

            if (!pilihan.matches("\\d+")) {
                jop.showMessageDialog(null, "Masukan angka", "Error Info", jop.ERROR_MESSAGE);
                continue;
            }

            int menuPilihan = Integer.parseInt(pilihan);

            if (menuPilihan == 1) {
                int berat = 0;
                boolean batalKeMenu = false;

                while (true) {
                    String inputBerat = jop.showInputDialog(null, "Masukan berat barang (gr):", "Input Pesanan", jop.QUESTION_MESSAGE);
                    if (inputBerat == null) {
                        int konfirmasi = jop.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi", jop.YES_NO_OPTION);
                        if (konfirmasi == jop.YES_OPTION) {
                            System.exit(0);
                        } else {
                            batalKeMenu = true;
                            break;
                        }
                    }
                    if (!inputBerat.matches("\\d+")) {
                        jop.showMessageDialog(null, "Masukan angka", "Error Info", jop.ERROR_MESSAGE);
                    } else {
                        berat = Integer.parseInt(inputBerat);
                        break;
                    }
                }

                if (batalKeMenu) {
                    continue;
                }

                int jarak = 0;
                while (true) {
                    String inputJarak = jop.showInputDialog(null, "Masukan jarak tempuh (km):", "Input Pesanan", jop.QUESTION_MESSAGE);
                    if (inputJarak == null) {
                        int konfirmasi = jop.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi", jop.YES_NO_OPTION);
                        if (konfirmasi == jop.YES_OPTION) {
                            System.exit(0);
                        } else {
                            batalKeMenu = true;
                            break;
                        }
                    }
                    if (!inputJarak.matches("\\d+")) {
                        jop.showMessageDialog(null, "Masukan angka", "Error Info", jop.ERROR_MESSAGE);
                    } else {
                        jarak = Integer.parseInt(inputJarak);
                        break;
                    }
                }

                if (batalKeMenu) {
                    continue;
                }

                int kelipatanBerat = (berat <= 100) ? 1 : (int) Math.ceil((double) berat / 100);
                long hargaBerat = (long) kelipatanBerat * 5000;

                int kelipatanJarak = (jarak <= 10) ? 1 : (int) Math.ceil((double) jarak / 10);
                long hargaJarak = (long) kelipatanJarak * 8000;

                long totalHarga = hargaBerat + hargaJarak;
                String noResi = String.format("XYZ%03d", dataPesanan.size() + 1);

                ArrayList<String> pesananBaru = new ArrayList<String>();
                pesananBaru.add(noResi);
                pesananBaru.add(String.valueOf(berat));
                pesananBaru.add(String.valueOf(jarak));
                pesananBaru.add(String.valueOf(hargaBerat));
                pesananBaru.add(String.valueOf(hargaJarak));
                pesananBaru.add(String.valueOf(totalHarga));
                pesananBaru.add("Dalam Pengiriman");

                dataPesanan.add(pesananBaru);

                String infoPesanan = "=== DETAIL PESANAN ===\n"
                                   + "Nomor Resi : " + noResi + "\n"
                                   + "Berat Barang : " + berat + " gr (Rp " + hargaBerat + ")\n"
                                   + "Jarak Tempuh : " + jarak + " km (Rp " + hargaJarak + ")\n"
                                   + "Total Harga : Rp " + totalHarga + "\n"
                                   + "Status : Dalam Pengiriman";

                jop.showMessageDialog(null, infoPesanan, "Pesanan Berhasil", jop.INFORMATION_MESSAGE);

            } else if (menuPilihan == 2) {
                if (dataPesanan.isEmpty()) {
                    jop.showMessageDialog(null, "Belum ada pesanan. Silakan lakukan Input Pesanan terlebih dahulu.", "Error Info", jop.ERROR_MESSAGE);
                    continue;
                }

                String cariResi = jop.showInputDialog(null, "Masukan Nomor Resi:", "Tracking Pesanan", jop.QUESTION_MESSAGE);
                if (cariResi == null) {
                    int konfirmasi = jop.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi", jop.YES_NO_OPTION);
                    if (konfirmasi == jop.YES_OPTION) {
                        System.exit(0);
                    } else {
                        continue;
                    }
                }

                boolean ditemukan = false;
                for (int i = 0; i < dataPesanan.size(); i++) {
                    if (dataPesanan.get(i).get(0).equalsIgnoreCase(cariResi.trim())) {
                        String detail = "=== STATUS PENGIRIMAN ===\n"
                                      + "Nomor Resi : " + dataPesanan.get(i).get(0) + "\n"
                                      + "Berat Barang : " + dataPesanan.get(i).get(1) + " gr (Rp " + dataPesanan.get(i).get(3) + ")\n"
                                      + "Jarak Tempuh : " + dataPesanan.get(i).get(2) + " km (Rp " + dataPesanan.get(i).get(4) + ")\n"
                                      + "Total Harga : Rp " + dataPesanan.get(i).get(5) + "\n"
                                      + "Status : " + dataPesanan.get(i).get(6);
                        jop.showMessageDialog(null, detail, "Hasil Tracking", jop.INFORMATION_MESSAGE);
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    jop.showMessageDialog(null, "Data tidak ditemukan", "Error Info", jop.ERROR_MESSAGE);
                }

            } else if (menuPilihan == 3) {
                int konfirmasi = jop.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi", jop.YES_NO_OPTION);
                if (konfirmasi == jop.YES_OPTION) {
                    System.exit(0);
                }
            } else {
                jop.showMessageDialog(null, "Menu tidak tersedia", "Error Info", jop.ERROR_MESSAGE);
            }
        }
    }
}

