package lab_3;

public class loop {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(i);
		}
		int i = 0;
		while (i < 4) {
			System.out.println(i);
			i++;
		}
		System.out.println("=================");
		int k = 0;
		do {

			System.out.println(k);
			k++;
		} while (k < 4);
	}

}
