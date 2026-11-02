package Pembelajaran_5_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int row = 2, column = 2;
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		ArrayList<ArrayList<Integer>> b = new ArrayList<>();
		ArrayList<ArrayList<Integer>> c = new ArrayList<>();
		
		for (int i = 0; i < row; i++) {
			a.add(new ArrayList<Integer>());
			for (int j = 0; j < column; j++) {
				int val = Integer.parseInt(jop.showInputDialog(null, "Masukan nilai A[" + i + "][" + j + "]: ", "Input Matrix A", jop.QUESTION_MESSAGE));
				a.get(i).add(val);
			}
		}
		
		for (int i = 0; i < row; i++) {
			b.add(new ArrayList<Integer>());
			for (int j = 0; j < column; j++) {
				int val = Integer.parseInt(jop.showInputDialog(null, "Masukan nilai B[" + i + "][" + j + "]: ", "Input Matrix B", jop.QUESTION_MESSAGE));
				b.get(i).add(val);
			}
		}
		
		for (int i = 0; i < row; i++) {
			c.add(new ArrayList<Integer>());
			for (int j = 0; j < column; j++) {
				int sum = 0;
				for (int k = 0; k < column; k++) {
					sum += a.get(i).get(k) * b.get(k).get(j);
				}
				c.get(i).add(sum);
			}
		}
		
		String output = "Matrix A:\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output = output + a.get(i).get(j) + "   ";
			}
			output = output + "\n";
		}
		
		output = output + "\nMatrix B:\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output = output + b.get(i).get(j) + "   ";
			}
			output = output + "\n";
		}
		
		output = output + "\nMatrix C = A * B:\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output = output + c.get(i).get(j) + "   ";
			}
			output = output + "\n";
		}
		
		jop.showMessageDialog(null, output, "Output Matrix", jop.INFORMATION_MESSAGE);
	}
}
