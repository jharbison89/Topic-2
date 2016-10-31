import java.util.Scanner;

public class Exercise_3_5 {

	public static void main(String[] args) {
		/** takes an input from the user meaning day of the week and number of future days, 
		 * then the program outputs the day of the week for both the current day and future day
		 */

		Scanner input = new Scanner(System.in);		// creates new scanner object
		
		System.out.print("Enter today's day:");		// obtains current day from user
		int today = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");	// obtains future day from user
		int future = input.nextInt();
		
		String todayDay = "0";		// initialize variables for day of the week strings
		String futureDay = "0";
		
		switch(today){				// obtains day of week based on user input
			case 0: todayDay = "Sunday"; break;
			case 1: todayDay = "Monday"; break;
			case 2: todayDay = "Tuesday"; break;
			case 3: todayDay = "Wednesday"; break;
			case 4: todayDay = "Thursday"; break;
			case 5: todayDay = "Friday"; break;
			case 6: todayDay = "Saturday"; break;
		}
		
		switch((today + future) % 7){		// obtains day of week for future day
		 case 0: futureDay = "Sunday"; break;
		 case 1: futureDay = "Monday"; break;
		 case 2: futureDay = "Tuesday"; break;
		 case 3: futureDay = "Wednesday"; break;
		 case 4: futureDay = "Thursday"; break;
		 case 5: futureDay = "Friday"; break;
		 case 6: futureDay = "Saturday"; break;
		}
		
		System.out.printf("Today is %s and the future day is %s\n", todayDay, futureDay);	// displays output to user
	}

}
