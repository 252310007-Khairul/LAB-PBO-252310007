package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan03 {

    static final double PHI = 3.14;

    static double luasKerucut(double r, double s) {
        return PHI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return (PHI * r * r * t) / 3;
    }

    static double luasTabung(double r, double t) {
        return 2 * PHI * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return PHI * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rKerucut, sKerucut, tKerucut;
        double rTabung, tTabung;

        System.out.println("=== KERUCUT ===");
        System.out.print("Masukkan jari-jari kerucut: ");
        rKerucut = input.nextDouble();

        System.out.print("Masukkan garis pelukis kerucut: ");
        sKerucut = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        tKerucut = input.nextDouble();

        System.out.println("Luas permukaan kerucut: " + luasKerucut(rKerucut, sKerucut));
        System.out.println("Volume kerucut: " + volumeKerucut(rKerucut, tKerucut));

        System.out.println("\n=== TABUNG ===");
        System.out.print("Masukkan jari-jari tabung: ");
        rTabung = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        tTabung = input.nextDouble();

        System.out.println("Luas permukaan tabung: " + luasTabung(rTabung, tTabung));
        System.out.println("Volume tabung: " + volumeTabung(rTabung, tTabung));

        input.close();
    }
}