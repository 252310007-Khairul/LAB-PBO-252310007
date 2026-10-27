package Pembelajaran_01_Runtunan;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        String namaProduk = "ROTI ENAK.";
        int harga = 6300;

        System.out.println("======================================================");
        System.out.println("                TOKO SERBAGUNA IBIK                   ");
        System.out.println("======================================================");

        System.out.print("Masukan nama member : ");
        String inputMember = input.nextLine();
        String memberName = myBio.getFullname(inputMember);

        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();

        int total = qty * harga;
        int diskon = (qty / 3) * 5;
        double subTotal = total - (total * diskon / 100.0);

        Date sekarang = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("dd MMM yyyy (HH:mm)");

        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,###", simbol);

        System.out.println("\n" + fmt.format(sekarang));
        System.out.println("ITEM            QTY     HARGA           TOTAL");
        System.out.println("======================================================");
        System.out.println(namaProduk + "      " + qty + "       Rp " + df.format(harga) + ",-      Rp " + df.format(total));
        System.out.println("------------------------------------------------------");
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Sub Total : Rp " + df.format((int) subTotal) + ",-");
        System.out.println("Member Name : " + memberName);

        input.close();
    }
}
