package Tugas1PBO;

public class PesananFood {
    private String idPesanan;
    private String namaMenu;
    private double totalHarga;
    private Driver driver;

    public PesananFood(String idPesanan, String namaMenu) {
        this.idPesanan = idPesanan;
        this.namaMenu = namaMenu;
    }

    public void hitungTotalHarga(int jumlah, double hargaSatuan) {
        if (jumlah > 0 && hargaSatuan > 0) {
            this.totalHarga = jumlah * hargaSatuan;
        } else {
            System.out.println("Jumlah dan harga harus lebih dari 0!");
        }
    }

    public double getTotalHarga() { return totalHarga; }
    public void setDriver(Driver driver) { this.driver = driver; }

    public void tampilkanInfo() {
        System.out.println("Pesanan  : " + idPesanan + " (" + namaMenu + ")");
        System.out.println("Total    : Rp" + totalHarga);
        System.out.println("Driver   : " + (driver != null ? driver.getNamaDriver() : "belum ada"));
    }
}