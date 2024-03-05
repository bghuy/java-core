package lab_2;

import java.util.Scanner;

public class if_else_example {
	public static void main(String[] args) {
//		Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//			- dưới 10M: không đóng thuế
//			- từ 10M tới 15M: thuế 10%
//			- từ 15 tới 30M : thuế 20%
//			- trên 30M: thuế 50%
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your salary");
		int money = scanner.nextInt();
		if (money < 10) {
			System.out.println("no tax");
		} else if (money >= 10 && money < 15) {
			System.out.println("tax 10%");
		} else if (money >= 15 && money < 20) {
			System.out.println("tax 20%");
		} else {
			System.out.println("tax 50%");
		}
		scanner.close();

	}
}
