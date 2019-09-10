package dayOfTheWeek;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return this.day + UtilityVisual.dayTermination(this.day) + " of " + UtilityVisual.writtenMonth(this.month)
				+ " of " + this.year;
	}


}
