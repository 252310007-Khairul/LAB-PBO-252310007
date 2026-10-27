package Pembelajaran_3_Swing_1;

public class Biodata {
    private String fullname;
    private int usia;
    private String alamat;

    public void simpan(String fullname, int usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getFullname() { return fullname; }
    public int getUsia() { return usia; }
    public String getAlamat() { return alamat; }

    public String toString() {
        return "Fullname : " + fullname + "\nUsia     : " + usia + "\nAlamat   : " + alamat;
    }
}
