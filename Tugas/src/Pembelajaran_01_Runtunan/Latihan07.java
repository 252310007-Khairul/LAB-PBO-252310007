package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        String namaHasil = nama.replaceAll("[aiueoAIUEO]", "X");

        System.out.println("Hasil konversi: " + namaHasil);

        input.close();
    }
}