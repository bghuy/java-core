package lab_3;

import java.util.Scanner;

public class bai01 {
	static boolean checkPrime(int a) {
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		boolean result = checkPrime(num);
		if (result) {
			System.out.printf("%d is a prime", num);
		} else {
			System.out.printf("%d is not a prime", num);
		}
		scanner.close();
	}
}
