package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How much values will be read? ");
		int n = scanner.nextInt();
		double[] vector = new double[n];
		double average = 0.0;
		System.out.printf("Please, enter %d values to calculate the average height!%n", n);
		for(int i = 0; i < n; i++) {
			vector[i] = scanner.nextDouble();
			average += vector[i];
		}
		
		System.out.println(String.format("Average height = %.2f", average/n));
		
		scanner.close();
	}

}
