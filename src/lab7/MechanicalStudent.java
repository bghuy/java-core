package lab7;

public class MechanicalStudent extends Student {
	private String skill;
	private double scoreCNC;
	private double scorePLC;

	public MechanicalStudent(String skill, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.setSkill(skill);
		this.scoreCNC = 0;
		this.scorePLC = 0;
	}

	@Override
	public double calculateScore() {
		// TODO Auto-generated method stub
		return (this.scoreCNC + this.scorePLC) / 2;

	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

}
