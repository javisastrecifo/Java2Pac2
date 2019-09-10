package dayOfTheWeek;

public class UtilityVisual {

	public static String writtenMonth(int number) {
		if (number == 1) {
			return "January";
		} else if (number == 2) {
			return "February";
		} else if (number == 3) {
			return "March";
		} else if (number == 4) {
			return "April";
		} else if (number == 5) {
			return "May";
		} else if (number == 6) {
			return "June";
		} else if (number == 7) {
			return "July";
		} else if (number == 8) {
			return "August";
		} else if (number == 9) {
			return "September";
		} else if (number == 10) {
			return "October";
		} else if (number == 11) {
			return "November";
		} else if (number == 12) {
			return "December";
		} else {
			return "month error";
		}
	}

	public static String dayTermination(int number) {
		if (number == 1) {
			return "st";
		} else if (number == 2) {
			return "nd";
		} else if (number == 3) {
			return "rd";
		} else if (number == 21) {
			return "st";
		} else if (number == 22) {
			return "nd";
		} else if (number == 23) {
			return "rd";
		} else if (number == 31) {
			return "st";
		} else {
			return "th";
		}
	}
	
	public static String dayName (int number) {
		if (number == 1) {
			return "Monday";
		} else if (number == 2) {
			return "Tuesday";
		} else if (number == 3) {
			return "Wednesday";
		} else if (number == 4) {
			return "Thursday";
		} else if (number == 5) {
			return "Friday";
		} else if (number == 6) {
			return "Saturday";
		} else {
			return "Sunday";
		}
	}
	
}
