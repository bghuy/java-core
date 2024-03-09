package lab5;

import java.util.ArrayList;

public class vid33 {
	public static void main(String[] args) {
		System.out.println("run vid 33");
		int a = 10;
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("huy");
		arr.add("thai");
		arr.add("hung");
//		arr.add("huy");
		String test = arr.get(0);
		test = "check";
		arr.set(0, test);
		System.out.println(arr.get(0));
		System.out.println(test);
	}
};
