import java.util.Scanner;

public class Exercise_3_26 {

	public static void main(String[] args){
		// uses comparators to determine if a given input is divisible by 5 or 6
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int x = input.nextInt();
		
		int five = x % 5;		// will return a value of 0 if input is divisible by 5
		int six = x % 6;		// will return a value of 0 if input is divisible by 5
		
		System.out.printf("Is %d divisible by 5 and 6: %b\n", x, (five == 0 && six == 0));
		System.out.printf("Is %d divisibly by 5 or 6: %b\n", x, (five == 0 || six == 0));
		System.out.printf("Is %d divisible by 5 or 6, but not both: %b\n", x, (five == 0 ^ six == 0));
	}
}
