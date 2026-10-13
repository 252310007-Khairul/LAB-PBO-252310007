package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int n = input.nextInt();

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                int distRow = (i < n / 2) ? i : (n - 1 - i);
                int distCol = (j < n / 2) ? j : (n - 1 - j);

                if (distRow + distCol < n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        input.close();
    }
}