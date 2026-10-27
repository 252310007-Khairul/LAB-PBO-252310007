package Praktikum5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> angka = new ArrayList<>();
        angka.add(new ArrayList<Integer>()); // row baru
        angka.get(0).add(1); // insert data di row baru
        angka.get(0).add(2); 

        // insert langsung
        angka.add(new ArrayList<Integer>(Arrays.asList(3, 4, 5)));

        // output semua
        for (int i = 0; i < angka.size(); i++) {
            for (int j = 0; j < angka.get(i).size(); j++) {
                System.out.println(angka.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
