package lab_1;

import java.util.Scanner;

public class Scanner_example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// initialize scanner for get value from keyboard
		System.out.println("Your name is: ");
		String name = scanner.nextLine();// get a string and release a string
		System.out.println("Your age is: ");
		int age = scanner.nextInt();// get an integer and release an integer
		System.out.println("My name is " + name + ", age = " + age);
		scanner.close();// close scanner after using for saving memory
	}
}
