package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhtruong
 *
 */
public class MainDay04 {
	static List<Customers> arrayListCus = new ArrayList<Customers>();

	public static void main(String[] args) {
		addCustomersIntoArrayList();
		showCustomersFromArrayList();
	}

	private static void addCustomersIntoArrayList() {
		Customers customer1 = new Customers("Nguyen Van 1", 10);
		Customers customer2 = new Customers("Nguyen Van 2", 20);
		Customers customer3 = new Customers("Nguyen Van 3", 30);
		Customers customer4 = new Customers("Nguyen Van 4", 40);
		Customers customer5 = new Customers("Nguyen Van 5", 50);

		arrayListCus.add(customer1);
		arrayListCus.add(customer2);
		arrayListCus.add(customer3);
		arrayListCus.add(customer4);
		arrayListCus.add(customer5);
	}

	private static void showCustomersFromArrayList() {
		for (int i = 0; i < arrayListCus.size(); i++) {
			System.out.println("Customer " + (i + 1) + "  ==> " + arrayListCus.get(i).getNameCustomer());
		}
	}

}
