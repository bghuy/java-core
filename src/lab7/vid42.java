package lab7;

public class vid42 {
	public static void main(String[] args) {
		ITStudent st1 = new ITStudent("java", "1", "huy", 52.40, 55.5);
		st1.getMoney();
		System.out.println("check language: " + st1.getLanguage());
		System.out.println("st1 id: " + st1.id);
		MechanicalStudent st2 = new MechanicalStudent("mechanic", "2", "hung", 10, 5);
		System.out.println("st2 name: " + st2.name);

	}
}
