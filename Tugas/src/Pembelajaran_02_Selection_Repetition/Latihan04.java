package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan nilai factor (minimal 20): ");
            n = input.nextInt();
            if (n < 20) {
                System.out.println("Nilai inputan factor tidak boleh kurang dari 20!");
            }
        } while (n < 20);

        System.out.print("Faktor " + n + " adalah ");
        boolean pertamanya = true;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                if (!pertamanya) {
                    System.out.print(", ");
                }
                System.out.print(i);
                pertamanya = false;
            }
        }
        System.out.println();

        input.close();
    }
}