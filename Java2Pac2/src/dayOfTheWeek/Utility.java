package dayOfTheWeek;

import java.util.Scanner;

public class Utility {

	public static String dayOfTheWeek(int difference) {
		int weekDay = difference % 7;

		return UtilityVisual.dayName(weekDay);
	}

	public static int calculateDifference(Date original, Date newDate) {
		int totalDays = 0;
		// dies del mes que falten per recorrer
		totalDays += monthLength(original.getMonth(), original.getYear()) - original.getDay();
		// dies dels propers mesos fins a finalitzar l'any
		for (int m1 = original.getMonth()+1; m1 <= 12; m1++) {
			totalDays += monthLength(m1, original.getYear());
		}
		// dies entre anys (sense comptar l'original ni l'últim)
		for (int y = original.getYear() + 1; y < newDate.getYear(); y++) {
			if (Utility.isLeapYear(y)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}
		// dies dels mesos anteriors a la data a l'any final
		for (int m2 = 1; m2 < newDate.getMonth(); m2++) {
			totalDays += monthLength(m2, newDate.getYear());
		}
		// dies del mes corrent
		totalDays += newDate.getDay();

		return totalDays;
	}

	public static boolean checkDate(int day, int month, int year, Date origin) {
		int monthLength = monthLength(month, year);
		if (year < origin.getYear()) {
			System.out.println("The year should be greater than " + origin.getYear() + "\\n\\nTry again.");
			return false;
		} else if ((month < 1) || (month > 12)) {
			System.out.println("Months should be between 1 and 12.\n\nTry again.");
			return false;
		} else if (day < 1) {
			System.out.println("Days should be bigger than 0.\n\nTry again.");
			return false;
		} else if (day > monthLength) {
			System.out.println("Days for " + UtilityVisual.writtenMonth(month) + " of " + year
					+ " should not be greater than " + monthLength + ".\n\nTry again.");
			return false;
		}
		return true;
	}

	public static int monthLength(int month, int year) {

		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			return 30;
		} else if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return 31;
		}
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
			return true;
		} else if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static int readNumber(String what, Scanner reader) {
		System.out.print("Insert a " + what + " number: ");
		int answer = Integer.parseInt(reader.nextLine());

		return answer;
	}
}
