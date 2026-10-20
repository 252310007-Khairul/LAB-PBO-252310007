package Praktikum4;

public class ArrayApp {
	public static void main(String[] args) {
		String[] nama = new String[5];
		
		nama[0] = "faisal";
		nama[3] = "Khairul";
		nama[4] = "Test";
		
		System.out.println(nama[1]);
		
		int[] angka = new int[6];
		for (int i = 0; i < 6; i++) {
			angka[i] = i + 1;
		}
		System.out.println(angka[3]);
	}
}