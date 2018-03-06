package day01;

public class Customers {

	private String nameCustomer;
	private int ageCustomer;

	public Customers(String name, int age) {
		this.setNameCustomer(name);
		this.setAgeCustomer(age);
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getAgeCustomer() {
		return ageCustomer;
	}

	public void setAgeCustomer(int ageCustomer) {
		this.ageCustomer = ageCustomer;
	}

}
