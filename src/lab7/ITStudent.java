package lab7;

public class ITStudent extends Student {
	private String language;
	private double scoreJava;
	private double scoreHTML;

	public ITStudent(String language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
		this.scoreHTML = 0;
		this.scoreJava = 0;
	}

	@Override
	public double calculateScore() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

	public void getMoney() {
		super.info();
	}

	public void info() {
		System.out.println("run info from student it");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}
}
