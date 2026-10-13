package Praktikum1;

public class Tanah {
    public double luas;
    
    public final long HARGA_PER_METER = 5000000;

    public long hitungTotalHarga() {
        return (long) (luas * HARGA_PER_METER);
    }
}
