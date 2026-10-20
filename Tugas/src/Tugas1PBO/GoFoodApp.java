package Tugas1PBO;

public class GoFoodApp {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("PSN-001", "Nasi Goreng");
        pesanan.hitungTotalHarga(2, 18000);

        Driver driver = new Driver("Andi", "F 1234 AB");
        driver.ambilPesanan(pesanan);
        driver.antarPesanan();
        pesanan.tampilkanInfo();
    }
}