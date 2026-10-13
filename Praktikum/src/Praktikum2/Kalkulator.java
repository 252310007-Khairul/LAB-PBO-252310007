package Praktikum2;

import java.util.Scanner;

public class Kalkulator {
	static double hitung(double x, double y, char operator) {
		switch (operator) {
		case '+':
			return x + y;
		case '-':
			return x - y;
		case '*':
			return x * y;
		case '/':
			if (y == 0) {
				throw new  Error("Pembagi tidak boleh nol");
			}
			return x / y;
		default:
			throw new Error("Operator invalid");
		}
	}
	
	public static void main(String[] args) {
        System.out.println("Kalkulator Sederhana");
	
		double x, y;
		char operator;
		
		char again = 'Y';
		Scanner scanner = new Scanner(System.in);
		
		do {
			 System.out.println("Input x: ");
			 x = scanner.nextDouble();
			 
			 System.out.println("Input y: ");
			 y = scanner.nextDouble();
			 
			 System.out.println("Operator: ");
			 operator = scanner.next().charAt(0);
			 
			 double hasil = hitung (x, y, operator);
			 System.out.println("Hasil " + hasil);

			 System.out.println("Ulangi Y/N? ");
			 again = scanner.next().charAt(0);
			 
		} while (again == 'Y');
		
		scanner.close();
	}
}