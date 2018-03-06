package day01;

public class Villa {
	private String nameRoom;
	private int totalDay;
	private int price = 10;

	public Villa(String name, Customers customer, int day) {
		this.nameRoom = name;
		this.totalDay = day;
	}

	public String getNameRoom() {
		return nameRoom;
	}

	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}

	public int getTotalDay() {
		return totalDay;
	}

	public void setTotalDay(int totalDay) {
		this.totalDay = totalDay;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalPrice() {
		return totalDay * price;
	}

	public int showAvailableDay(int money) {
		int day;
		switch (money) {
		case 30:
		case 50:
		case 100:
			day = money / price;
		default:
			day = money / price;
		}
		return day;
	}
}
