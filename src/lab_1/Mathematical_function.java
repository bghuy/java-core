package lab_1;

import java.util.Scanner;

public class Mathematical_function {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = Math.max(a, b);
		System.out.println("max:" + Math.pow(a, b));

		Scanner scanner = new Scanner(System.in);
		System.out.printf("enter first number:");
		int first = scanner.nextInt();
		System.out.printf("enter second number:");
		int second = scanner.nextInt();
		System.out.println("max number is: " + Math.max(first, second));
		System.out.println("min number is: " + Math.min(first, second));
	}
}
