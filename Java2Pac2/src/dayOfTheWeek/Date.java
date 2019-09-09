package dayOfTheWeek;

public class Date {

	private int birthDay;
	private int birthMonth;
	private int birthYear;

	public Date(int d, int m, int y) {
		this.birthDay = d;
		this.birthMonth = m;
		this.birthYear = y;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public int getBirthYear() {
		return birthYear;
	}

	@Override
	public String toString() {
		return this.birthDay + dayTermination(this.birthDay) + " of " + writtenMonth(this.birthMonth) + " of "
				+ this.birthYear;
	}

	public String dayTermination(int number) {
		if (this.birthDay == 1) {
			return "st";
		} else if (this.birthDay == 2) {
			return "nd";
		} else if (this.birthDay == 3) {
			return "rd";
		} else if (this.birthDay == 21) {
			return "st";
		} else if (this.birthDay == 22) {
			return "nd";
		} else if (this.birthDay == 23) {
			return "rd";
		} else if (this.birthDay == 31) {
			return "st";
		} else {
			return "th";
		}
	}

	public String writtenMonth(int number) {
		if (this.birthMonth == 1) {
			return "January";
		} else if (this.birthMonth == 2) {
			return "February";
		} else if (this.birthMonth == 3) {
			return "March";
		} else if (this.birthMonth == 4) {
			return "April";
		} else if (this.birthMonth == 5) {
			return "May";
		} else if (this.birthMonth == 6) {
			return "June";
		} else if (this.birthMonth == 7) {
			return "July";
		} else if (this.birthMonth == 8) {
			return "August";
		} else if (this.birthMonth == 9) {
			return "September";
		} else if (this.birthMonth == 10) {
			return "October";
		} else if (this.birthMonth == 11) {
			return "November";
		} else if (this.birthMonth == 12) {
			return "December";
		} else {
			return "month error";
		}
	}

}
