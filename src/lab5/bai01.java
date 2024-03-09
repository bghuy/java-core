package lab5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		while (true) {
			System.out.println("enter a number ");
			double num = scanner.nextDouble();
			arr.add(num);
			System.out.println("do you want add more (Y/N) ?");
			char choice = scanner.next(".").charAt(0);
			if (Character.toLowerCase(choice) == 'n') {
				break;
			}
		}
		double sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}

		System.out.println("Sum: " + sum);
	}

}
