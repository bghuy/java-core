package lab6;

import java.util.Scanner;

public class vid38 {
	public static void main(String[] args) {
		// object thi sai equals
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter username");
		String username = scanner.nextLine();

		System.out.println("enter password");
		String password = scanner.nextLine();
		System.out.println("username = " + username + ", password " + password);
		if (username.equals("hoidanit") && password.length() > 6) {
			System.out.println("valid input");
		}
		scanner.close();
	}
}
