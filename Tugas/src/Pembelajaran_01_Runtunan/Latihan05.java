package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks : ");
        String teks = scanner.nextLine();

        System.out.println("Huruf besar   : " + teks.toUpperCase());

        scanner.close();
    }
}
