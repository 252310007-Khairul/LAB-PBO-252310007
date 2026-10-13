package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius, fahrenheit, reamur, kelvin;

        System.out.print("Masukkan suhu Celcius: ");
        celcius = input.nextDouble();

        fahrenheit = (celcius * 9 / 5) + 32;
        reamur = celcius * 4 / 5;
        kelvin = celcius + 273.15;

        System.out.println("\nHasil Konversi Suhu:");
        System.out.println("Celcius    : " + celcius + " C");
        System.out.println("Fahrenheit : " + fahrenheit + " F");
        System.out.println("Reamur     : " + reamur + " R");
        System.out.println("Kelvin     : " + kelvin + " K");

        input.close();
    }
}