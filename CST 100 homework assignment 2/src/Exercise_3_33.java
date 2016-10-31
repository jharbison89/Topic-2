import java.util.Scanner;

public class Exercise_3_33 {

	public static void main(String[] args){
		// this program determines the better price between 2 packages given price and weight
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double cost1 = price1 / weight1;
		double cost2 = price2 / weight2;
		
		if(cost1 > cost2){
			System.out.println("Package 2 has a better price");
		}
		else if(cost2 > cost1){
			System.out.println("Package 1 has a better price");
		}
		else if(cost1 == cost2){
			System.out.println("Both packages are the same value");
		}
	}
}
