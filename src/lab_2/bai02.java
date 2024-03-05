package lab_2;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = scanner.nextInt();
		System.out.println("enter b: ");
		int b = scanner.nextInt();
		System.out.println("enter c: ");
		int c = scanner.nextInt();
		double result1;
		double result2;
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("always true ");
				} else {
					System.out.println("no result ");
				}
			} else {
				result1 = -(float) c / b;
				System.out.println("one result: " + result1);
			}
		} else {
			if (Math.pow(b, 2) - 4 * a * c > 0) {
				result1 = (float) (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
				result2 = (float) (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
				System.out.println("result1: " + result1);
				System.out.println("result2: " + result2);
			} else if ((float) Math.pow(b, 2) - 4 * a * c == 0) {
				result1 = (float) -b / (2 * a);
				System.out.println("double result: " + result1);
			} else {
				System.out.println("no integer result");
			}
		}
		scanner.close();
		System.exit(0);

	}
}
