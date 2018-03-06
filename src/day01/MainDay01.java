package day01;

import java.util.Scanner;

public class MainDay01 {

	public static void main(String[] args) {
		runTask01Day01();
		runTask02Day01();
	}

	public static void runTask01Day01() {
		Customers customer01 = new Customers("Nguyen Van A", 20);
		Villa villa01 = new Villa("Villa_01", customer01, 4);
		System.out.println(
				"- Customer name:  " + customer01.getNameCustomer() + "\n- Age:  " + customer01.getAgeCustomer());
		System.out.println("- Villa room:  " + villa01.getNameRoom() + "\n- Total rent day:  " + villa01.getTotalDay());
		System.out.println("- Total price:  " + villa01.getPrice() + "$ x " + villa01.getTotalDay() + " = "
				+ villa01.getTotalPrice() + "$");
	}

	private static void runTask02Day01() {
		checkAndShowOpeningTimeOfSwimming();
		calculateMoneyAvailable();
	}

	private static void checkAndShowOpeningTimeOfSwimming() {
		float time;
		Swimming swimming = new Swimming();
		swimming.showOpenTime();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nPlease enter your time!");
		time = scanner.nextFloat();
		if (time < 9) {
			System.out.println("Sorry! Opening time at: 09 AM");
		} else {
			System.out.println("Let's Enjoy!");
		}
	}

	private static void calculateMoneyAvailable() {
		int money;
		Customers customer01 = new Customers("Nguyen Van A", 20);
		Villa villa01 = new Villa("Villa_01", customer01, 4);
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nPlease enter your money!");
		do {
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.printf("\"%s\" is not Valid\nPlease enter again!", input);
			}
			money = scanner.nextInt();
		} while (money < 0);
		System.out.println("Available day with Villa: " + villa01.showAvailableDay(money));
	}

}
