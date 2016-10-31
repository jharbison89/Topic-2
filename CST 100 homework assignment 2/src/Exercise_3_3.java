import java.util.Scanner;

public class Exercise_3_3 {

	public static void main(String[] args) {
		// This program solves a system of 2 x 2 equations input by the user
		
		Scanner input = new Scanner(System.in);		// starts new scanner
		
		System.out.print("Enter a, b, c, d, e, and f:");	// provides prompt to user
		
		double a = input.nextDouble();		// obtains inputs from user and stores values in variables
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if(a*d - b*c == 0){		// checks if there is a solution to the system using Cramer's rule
			System.out.println("The equation has no solution");
		}
		else{
			double x = (e*d - b*f)/(a*d - b*c);  // solves equations using Cramer's rule
			double y = (a*f - e*c)/(a*d - b*c);
			
			System.out.println("x is " + x + " and y is " + y);
		}

	}

}
