package lab9;

import java.util.Scanner;

public class Student {
	public Student(String studentID, String name, double score, int age) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.score = score;
		this.age = age;
	}

	public Student() {

	}

	private String studentID;
	private String name;
	private double score;
	private int age;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", score=" + score + ", age=" + age + "]";
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		String studentId;
		String name;
		double score;
		int age;
		while (true) {
			try {
				System.out.println("enter student id: ");
				studentId = scanner.nextLine();
				if (studentId.trim().length() > 0) {
					this.setStudentID(studentId);
					break;
				} else {
					System.out.println("student id can not be empty or only space");
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("student id can not be empty or only space");
			}
		}
		while (true) {
			try {
				System.out.println("enter student name: ");
				name = scanner.nextLine();
				if (name.trim().length() > 0) {
					this.setName(name);
					break;
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("student name can not be empty or only space");
			}
		}
		while (true) {
			try {
				System.out.println("enter score: ");
				score = scanner.nextDouble();
				if (0 <= score && score <= 10) {
					this.setScore(score);
					break;
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("score must be in range of 0 and 10");
			}
		}
		while (true) {
			try {
				System.out.println("enter age: ");
				age = scanner.nextInt();
				if (18 <= age && age <= 100) {
					this.setAge(age);
					break;
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("age must be in range of 18 and 100");
			}
		}
		scanner.close();

	}

}
