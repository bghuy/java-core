package lab_1;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		int huy = 22;
		int test;
		test = 5 + 9 * 3 - 10 / 2;
		System.out.printf("Sum: " + test);// print without in new line
		System.out.println("Sum: " + test);
		float F = 10.23213312f;
		System.out.printf("sum %.3f \n", F);// %d for float
		// example
		// 2 variable name and age, use
		// System.out.print("Hỏi Dân IT");
		// System.out.println("với Eric");
		// System.out.printf("có %d người đăng ký", 40000);
		// to print My name is <name>, age = <age>

		String name = "huy";
		int age = 22;
		System.out.printf("My name is %s, age=%d \n", name, age);
		System.out.print("My name is " + name + ", age=" + age + "\n");
		System.out.println("My name is " + name + ", age=" + age);
		// input from keyboard
		Scanner scanner = new Scanner(System.in);
	}
}
