package day02;

import java.util.Scanner;

/**
 * @author thanhtruong
 *
 */
public class MainDay02 {
	static int num;
	static int i;
	private static String _villa = "Villa";
	private static String _beachHouse = "Beach House";

	public static void main(String[] args) {
		RunTaskDay02();
	}

	private static void RunTaskDay02() {
		enterNumber(_villa);
		enterNameVillaAndShow();
		enterNumber(_beachHouse);
		enterNameBeachHouseAndShow();
	}

	private static void enterNameBeachHouseAndShow() {
		Scanner scan = new Scanner(System.in);
		String arrayOfBeachHouse[] = new String[num];
		for (i = 0; i < arrayOfBeachHouse.length; i++) {
			System.out.print("Enter the name of Beach House " + (i + 1) + " : ");
			arrayOfBeachHouse[i] = scan.nextLine();
		}
		for (i = 0; i < arrayOfBeachHouse.length; i++) {
			BeachHouses beach = new BeachHouses(arrayOfBeachHouse[i]);
			System.out.print("Name of Beach House " + (i + 1) + " : " + beach.getNameBeach() + "\n");
		}
	}

	private static void enterNameVillaAndShow() {
		Scanner scan = new Scanner(System.in);
		String arrayOfVillas[] = new String[num];
		for (i = 0; i < arrayOfVillas.length; i++) {
			System.out.print("Enter the name of Villa " + (i + 1) + " : ");
			arrayOfVillas[i] = scan.nextLine();
		}
		for (i = 0; i < arrayOfVillas.length; i++) {
			Villas villa = new Villas(arrayOfVillas[i]);
			System.out.print("Name of Villa " + (i + 1) + " : " + villa.getNameVilla() + "\n");
		}

	}

	private static void enterNumber(String name) {
		System.out.println("Enter How many " + name);
		Scanner scan = new Scanner(System.in);
		do {
			while (!scan.hasNextInt()) {
				String input = scan.nextLine();
				System.out.printf(input + "is not Valid\nPlease enter again!");
			}
			num = Integer.parseInt(scan.nextLine());
		} while (num < 0);
	}
}
