package lab_2;

import java.util.Scanner;

public class bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("enter your choice: ");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("enter a: ");
			int a = scanner.nextInt();
			System.out.println("enter b: ");
			int b = scanner.nextInt();
			if (a == 0 && b == 0) {
				System.out.println("too many result ");

			} else if (a == 0 && b != 0) {
				System.out.println("no result ");
			} else {
				double c = -(float) b / a;
				System.out.println("result: " + c);

			}
		} else if (choice == 2) {
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
		} else if (choice == 3) {
			System.out.println("enter number of kw: ");
			long kw = scanner.nextInt();
			long money = 0;
			if (kw <= 100) {
				money += kw * 1000;
			} else {
				money += 100 * 1000 + (kw - 100) * 1500;
			}
			System.out.println("money: " + money);
		} else {
			System.out.println("quit");
		}
		scanner.close();
		System.exit(0);

	}
}
