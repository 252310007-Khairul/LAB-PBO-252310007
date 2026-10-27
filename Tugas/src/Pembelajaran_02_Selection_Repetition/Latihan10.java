package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,###", simbol);

        int pinBenar = 252310007;
        boolean pinValid = false;

        while (!pinValid) {
            System.out.print("Masukkan PIN: ");
            int inputPin = input.nextInt();

            if (inputPin == pinBenar) {
                pinValid = true;
                System.out.println("PIN Valid. Selamat datang di ATM!\n");
            } else {
                System.out.println("PIN salah! Silakan coba lagi.\n");
            }
        }

        long saldo = 100000;
        char konfirmasi;

        do {
            System.out.println("==================================");
            System.out.println("            MENU ATM              ");
            System.out.println("==================================");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih Menu (1-4): ");
            int menu = input.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda saat ini: Rp " + df.format(saldo) + ",-");
                    break;

                case 2:
                    System.out.print("Masukkan Nominal Setor Tunai: Rp ");
                    long setor = input.nextLong();
                    saldo += setor;
                    System.out.println("Setor tunai berhasil!");
                    System.out.println("Saldo anda saat ini: Rp " + df.format(saldo) + ",-");
                    break;

                case 3:
                    System.out.print("Masukkan Nominal Tarik Tunai: Rp ");
                    long tarik = input.nextLong();

                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil!");
                        System.out.println("Saldo anda saat ini: Rp " + df.format(saldo) + ",-");
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;

                case 4:
                    System.out.println("Anda memilih keluar dari menu.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }

            System.out.print("\nApakah anda ingin melakukan transaksi lain? (y/n): ");
            konfirmasi = input.next().charAt(0);
            System.out.println();

        } while (konfirmasi == 'y' || konfirmasi == 'Y');

        System.out.println("Terima kasih telah menggunakan layanan ATM kami.");
        input.close();
    }
}
