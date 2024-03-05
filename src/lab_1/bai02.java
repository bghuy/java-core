package lab_1;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first edge of regtangle");
		double firstEdge = scanner.nextDouble();
		System.out.println("enter second edge of regtangle");
		double secondEdge = scanner.nextDouble();
		System.out.println("Perimeter of regtangle is: " + (firstEdge + secondEdge) * 2);
		System.out.println("Area of regtangle is: " + firstEdge * secondEdge);
		System.out.println("Minimum edge of regtangle is: " + Math.min(firstEdge, secondEdge));
		scanner.close();
	}
}
