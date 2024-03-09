package lab7;

public abstract class Student {
	public Student(String id, String name, double price, double tax) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	abstract double calculateScore();// abstract function

	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("run info from parent");
	}
}
