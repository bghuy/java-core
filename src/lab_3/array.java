package lab_3;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		String[] club = { "MU", "MC", "LIVERPOOL" };
		System.out.println("array: " + Arrays.toString(club));
		System.out.println("length: " + club.length);
		System.out.println("first element: " + club[0]);
		club[0] = "Arsenal";
		System.out.println("first element after change: " + club[0]);
		String[] a = new String[5];
		a[0] = "huy";
		System.out.println("first element of a: " + a[0]);
		System.out.println("second element of a: " + a[1]);
		int[] b;
//		System.out.println(b); b may not have been initialized
		for (int i = 0; i < club.length; i++) {
			System.out.println("club element: " + club[i]);
		}
		int arr[] = { 5, 6, 1, 3 };
		Arrays.sort(arr);
		System.out.println("array: " + Arrays.toString(arr));

	}
}
