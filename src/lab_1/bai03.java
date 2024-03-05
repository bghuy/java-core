package lab_1;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter edge length of a cube");
		double edgeLength = scanner.nextDouble();
		System.out.println("volume of the cube is: " + Math.pow(edgeLength, 3));
		scanner.close();
	}
}
