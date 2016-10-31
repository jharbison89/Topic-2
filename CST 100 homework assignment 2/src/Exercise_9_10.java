import java.util.Scanner;

public class Exercise_9_10 {

	public static void main(String[] args){
		// this program tests QuadraticEquation.java
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter values for a, b, and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation solver = new QuadraticEquation(a, b, c);
		
		double discriminant = solver.getDiscriminant();
		
		if(discriminant > 0){
			System.out.println("The roots are " + solver.getRoot1() + " and " + solver.getRoot2());
		}
		else if(discriminant == 0){
			System.out.println("There is only one root and it is " + solver.getRoot1());
		}
		else if(discriminant < 0){
			System.out.println("The equation has no roots");
		}
	}
}
