package Pembelajaran_4_Array;

import javax.swing.JOptionPane;

public class Latihan07 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int row = 2, column = 2;
		int[][] a = new int[row][column];
		int[][] b = new int[row][column];
		int[][] c = new int[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = Integer.parseInt(jop.showInputDialog(null, "Masukan nilai A[" + i + "][" + j + "]: ", "Input Matrix A", jop.QUESTION_MESSAGE));
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j] = Integer.parseInt(jop.showInputDialog(null, "Masukan nilai B[" + i + "][" + j + "]: ", "Input Matrix B", jop.QUESTION_MESSAGE));
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		String output = "Matrix A:\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output = output + a[i][j] + "   ";
			}
			output = output + "\n";
		}
		
		output = output + "\nMatrix B:\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output = output + b[i][j] + "   ";
			}
			output = output + "\n";
		}
		
		output = output + "\nMatrix C = A + B:\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output = output + c[i][j] + "   ";
			}
			output = output + "\n";
		}
		
		jop.showMessageDialog(null, output, "Output Matrix", jop.INFORMATION_MESSAGE);
	}
}
