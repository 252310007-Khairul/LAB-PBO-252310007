package Praktikum4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Faisal");
		System.out.println(nama.get(0));
		nama.set(0, "Nakhalan");
		System.out.println(nama.get(0));
		
		Scanner scanner = new Scanner(System.in);
		nama.add(scanner.nextLine());
		System.out.println("Nama yang diinput: " + nama.getLast());

		
		nama.remove(1);
		System.out.println("Nama setelah dihapus: " + nama.getLast());
		
		nama.clear();
	}
}
