package lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai01 {
	public static boolean checkPW(String input) {

		Pattern pattern = Pattern.compile(".{6,}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();

	}

	public static boolean checkID(String input) {

		Pattern pattern = Pattern.compile("\\d{12}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();

	}

	public static boolean checkEmail(String input) {

		Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();

	}

	public static void main(String[] args) {
		boolean result1 = checkPW("123sxczcz");
		boolean result2 = checkID("09914569741a");
		boolean result3 = checkEmail("eric@hoidanit.com.vn");
		System.out.println(result3);

	}
}
