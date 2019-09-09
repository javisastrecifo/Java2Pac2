package dayOfTheWeek;

import java.util.Scanner;

public class Utility {

	public static int readNumber(String what, Scanner reader) {
		System.out.print("Insert a " + what + " number: ");
		int answer = Integer.parseInt(reader.nextLine());

		return answer;
	}

	public static int calculateDays(Date original, Date newDate) {
		int totalDays = 0;

		totalDays += newDate.getBirthDay() - original.getBirthDay();
		totalDays += (newDate.getBirthMonth() - original.getBirthMonth()) * 30;
		totalDays += (newDate.getBirthYear() - original.getBirthYear()) * 365;

		return totalDays;
	}

	public static boolean checkDate(int day, int month, int year, Date origin) {
		if (year < origin.getBirthYear()) {
			System.out.println("The year should be greater than " + origin.getBirthYear() + "\\n\\nTry again.");
			return false;
		} else if ((month < 0) || (month > 12)) {
			System.out.println("Months are between 1 and 12.\n\nTry again.");
			return false;
		} else if (day < 0) {
			System.out.println("Days have to be greater than 0.\n\nTry again.");
			return false;
		}
		return true;
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
}
