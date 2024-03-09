package lab8;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
		this.mark = mark;
		this.setGrade();
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
		this.setGrade();
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.mark >= 8) {
			this.grade = "A";
		} else if (7 <= mark && mark < 8) {
			this.grade = "B";
		} else if (6 <= mark && mark < 7) {
			this.grade = "C";
		} else if (5 <= mark && mark < 6) {
			this.grade = "D";
		} else {
			this.grade = "fail";
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Student [mark=" + mark + ", grade=" + grade + "]";
	}

}
