package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

class Resto {
    private long harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("Menu Sarapan:");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Bubur Ayam");
            System.out.println("3. Soto Ayam");

            System.out.print("Masukkan pilihan menu (1-3): ");
            int pilihan = input.nextInt();

            long hargaMenu = getPrices(pilihan);
S
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + hargaMenu + ",-");
                    break;
                case 2:
                    System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + hargaMenu + ",-");
                    break;
                case 3:
                    System.out.println("Anda memesan Soto Ayam dengan harga Rp " + hargaMenu + ",-");
                    break;
                default:
                    System.out.println("Maaf menu yang anda masukan salah.");
                    break;
            }

            System.out.print("Apakah anda akan memesan kembali ? (y/n): ");
            ulang = input.next().charAt(0);
            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih telah memesan.");
    }

    private long getPrices(int pilihan) {
        if (pilihan == 1) {
            harga = 22000;
        } else if (pilihan == 2) {
            harga = 15000;
        } else if (pilihan == 3) {
            harga = 25000;
        } else {
            harga = 0;
        }
        return harga;
    }
}

public class Latihan07 {
    public static void main(String[] args) {
        Resto resto = new Resto();
        resto.chooseMenu();
    }
}