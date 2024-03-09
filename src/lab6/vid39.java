package lab6;

import java.util.ArrayList;

public class vid39 {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		Student st1 = new Student("huy", "1");
		Student st2 = new Student("thai", "2");
		Student st3 = new Student("hung", "3");
		Student st4 = new Student("tin", "4");
		Student st5 = new Student("toan", "5");
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("hung")) {
				System.out.println(arr.get(i));
			}
		}

	}
}
