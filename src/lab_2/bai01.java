package lab_2;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = scanner.nextInt();
		System.out.println("enter b: ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("too many result ");

		} else if (a == 0 && b != 0) {
			System.out.println("no result ");
		} else {
			float c = -(float) b / a;
			System.out.println("result: " + c);

		}
		scanner.close();
		System.exit(0);

	}
}
