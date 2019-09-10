package dayOfTheWeek;

import java.util.Scanner;

public class UI {

	public static void start() {
		Date original = new Date(1, 1, 1978);
		Scanner reader = new Scanner(System.in);

		System.out.println("*******************************");
		System.out.println("PAST DAY OF THE WEEK CALCULATOR");
		System.out.println("*******************************\n");

		int newDay = 0;
		int newMonth = 0;
		int newYear = 0;

		while (true) {
			System.out.println("Insert a valid date after " + original);

			newDay = Utility.readNumber("day", reader);
			newMonth = Utility.readNumber("month", reader);
			newYear = Utility.readNumber("year", reader);

			if (Utility.checkDate(newDay, newMonth, newYear, original)) {
				break;
			}
		}

		Date newDate = new Date(newDay, newMonth, newYear);

		String weekDay = Utility.dayOfTheWeek(Utility.calculateDifference(original, newDate));
		System.out.println("\nThe " + newDate.toString() + " was a " + weekDay + ".");
		
		System.out.print("Have a nice "+ weekDay + "!");
	}

}
