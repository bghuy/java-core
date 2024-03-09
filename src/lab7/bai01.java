package lab7;

public class bai01 {
	public static void main(String[] args) {
		Student studentIT = new ITStudent("Java", "11", "huy", 5.3, 5.6);
		Student studentMecha = new MechanicalStudent("CNC", "12", "thai", 5.4, 5.9);
		((ITStudent) studentIT).setScoreJava(5);
		((ITStudent) studentIT).setScoreHTML(5);
		System.out.println("student IT score: " + studentIT.calculateScore());
	}
}
