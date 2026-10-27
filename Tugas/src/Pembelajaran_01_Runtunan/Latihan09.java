package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Students myBio = new Students();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        int npm = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Nama Lengkap : ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Nama Kelas : ");
        String namaKelas = input.nextLine();

        System.out.print("Masukkan Semester : ");
        int semester = input.nextInt();

        System.out.print("Masukkan IPK : ");
        String ipkInput = input.next().replace(',', '.');
        float ipk = Float.parseFloat(ipkInput);

        System.out.println("\n======================================================");
        System.out.println("                   DATA MAHASISWA                     ");
        System.out.println("======================================================");
        System.out.println("NPM          : " + myBio.getNPM(npm));
        System.out.println("Nama Lengkap : " + myBio.getFullname(namaLengkap));
        System.out.println("Nama Kelas   : " + myBio.getClassName(namaKelas));
        System.out.println("Semester     : " + myBio.getSemester(semester));
        System.out.println("IPK          : " + myBio.getGPA(ipk));

        input.close();
    }
}
