package lab4;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}

	public Product input(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void output(Product pr) {
		System.out.printf("Your product has name: %s, price: %f, tax: %f \n", pr.getName(), pr.getPrice(), pr.getTax());
		System.out.println("price after tax: " + pr.getTaxPrice());
	}

}
