package lab9;

import java.util.Scanner;

public class vid52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("enter x: ");
			try {
				int x = scanner.nextInt();
				try {

					System.out.println("x: " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("run error with x = " + x);
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("run error");
			}

		}

	}
}
