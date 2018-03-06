package day01;

public class Swimming {
	private String openTime;

	public Swimming() {
		this.setOpenTime("09:00 AM");
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public void showOpenTime() {
		System.out.println("Swimming will be opened at: " + getOpenTime());
	}

}
