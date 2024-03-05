package lab_3;

import java.util.Scanner;

public class bai02 {
	static void printMultiplitationTable(int x) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d ", x, i, x * i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int x = scanner.nextInt();
		printMultiplitationTable(x);
		scanner.close();
	}
}
