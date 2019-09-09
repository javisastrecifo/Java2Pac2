package dayOfTheWeek;

import java.util.Scanner;

public class UI {

	public static void start() {
		Date origin = new Date(1, 1, 1978);
		Scanner reader = new Scanner(System.in);

		System.out.println("*******************************");
		System.out.println("PAST DAY OF THE WEEK CALCULATOR");
		System.out.println("*******************************\n");

		System.out.println("Insert a date after " + origin);

		int newDay = 0;
		int newMonth = 0;
		int newYear = 0;
		
		while (true) {
			newDay = Utility.readNumber("day", reader);
			newMonth = Utility.readNumber("month", reader);
			newYear = Utility.readNumber("year", reader);

			if (Utility.checkDate(newDay, newMonth, newYear, origin)) {
				break;
			}
		}

		Date newDate = new Date(newDay, newMonth, newYear);
		System.out.print(Utility.calculateDays(origin, newDate));

	}

}
