package Pembelajaran_4_Array;

public class Latihan02 {
	public static void main(String[] args) {
		int[] ages = new int[5];
		
		for (int i = 0; i < 5; i++) {
			ages[i] = (i + 1) * 10;
		}
		
		System.out.println("=Value by index=");
		System.out.println("ages[2]=" + ages[2]);
		System.out.println("\n=Use Loop=");
		for (int i = 0; i < 5; i++) {
			System.out.println("ages[" + i + "]=" + ages[i]);
		}
	}
}
