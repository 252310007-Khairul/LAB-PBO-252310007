package Praktikum1;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        System.out.println("Aplikasi Penghitung Total Harga Tanah");
        
        Scanner scanner = new Scanner(System.in);
        
        Tanah tanah = new Tanah();
        
        System.out.print("Masukkan luas tanah (dalam meter persegi): ");
        double inputLuas = scanner.nextDouble(); 
        
        tanah.luas = inputLuas;
        
        long totalHarga = tanah.hitungTotalHarga();
        
        System.out.println("Total harga tanah Anda: Rp " + totalHarga);
        
        scanner.close();
    }
}