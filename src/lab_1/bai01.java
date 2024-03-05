package lab_1;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name");
		String name = scanner.nextLine();
		System.out.println("enter age");
		int age = scanner.nextInt();
		System.out.println("Student name: " + name + ", age: " + age);
		scanner.close();

	}
}
