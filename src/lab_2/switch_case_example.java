package lab_2;

import java.util.Scanner;

public class switch_case_example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("enter your choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("| chọn Cộng |");
			break;

		case 2:
			System.out.println("| chọn Trừ |");
			break;
		default:
			System.out.println("| chọn kết thúc |");
			System.exit(0);// thoat chuong trinh

		}
	}
}
