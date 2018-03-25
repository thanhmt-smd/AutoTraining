package day03;

/**
 * @author thanhtruong
 *
 */
public class BeachHouses extends Accommodation {
	public BeachHouses(String nameBeachHouse) {
		this.name = nameBeachHouse;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
