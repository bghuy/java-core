package lab_2;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//			- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//			- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
		long kw = scanner.nextInt();
		long money = 0;
		if (kw <= 100) {
			money += kw * 1000;
		} else {
			money += 100 * 1000 + (kw - 100) * 1500;
		}
		System.out.println("money: " + money);
		scanner.close();
	}
}
