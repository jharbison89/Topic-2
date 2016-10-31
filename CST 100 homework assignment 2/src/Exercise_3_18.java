import java.util.Scanner;

public class Exercise_3_18 {
	
	public static void main(String[] args){
		
		// this program calculates shiping for a company based on the weight of the item being shipped
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter weight of item being shipped in pounds");	// prompts user for weight of package
		double weight = input.nextDouble();
		
		if(weight <= 1){		// displays costs of packages based on weight
			System.out.println("Shipping costs $3.50");
		}
		else if(weight <= 3){
			System.out.println("Shipping costs $5.50");
		}
		else if(weight <= 10){
			System.out.println("Shipping costs $8.50");
		}
		else if(weight <= 20){
			System.out.println("Shipping costs $10.50");
		}
		else if(weight > 50){
			System.out.println("Package cannnot be shipped");
		}
	}
}
