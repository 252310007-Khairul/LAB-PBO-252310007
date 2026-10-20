package Tugas1PBO;

public class Driver {
    private String namaDriver;
    private String platNomor;
    private PesananFood pesananAktif;

    public Driver(String namaDriver, String platNomor) {
        this.namaDriver = namaDriver;
        this.platNomor = platNomor;
    }

    public String getNamaDriver() { return namaDriver; }

    public void ambilPesanan(PesananFood pesanan) {
        this.pesananAktif = pesanan;
        pesanan.setDriver(this);
        System.out.println(namaDriver + " mengambil pesanan.");
    }

    public void antarPesanan() {
        if (pesananAktif != null) {
            System.out.println(namaDriver + " [" + platNomor + "] sedang mengantar pesanan dengan total Rp" + pesananAktif.getTotalHarga());
        } else {
            System.out.println("Belum ada pesanan yang diambil.");
        }
    }
}
