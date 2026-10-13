package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM anda: ");
        long npm = input.nextLong();

        boolean isPrima = true;
        long pembagi = 0;

        if (npm <= 1) {
            isPrima = false;
            pembagi = npm;
        } else {
            for (long i = 2; i <= Math.sqrt(npm); i++) {
                if (npm % i == 0) {
                    isPrima = false;
                    pembagi = i;
                    break;
                }
            }
        }

        if (isPrima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            if (pembagi != 0) {
                System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan " + pembagi);
            } else {
                System.out.println("Bukan termasuk bilangan prima");
            }
        }

        input.close();
    }
}