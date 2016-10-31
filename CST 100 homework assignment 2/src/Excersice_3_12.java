import java.util.Scanner;

public class Excersice_3_12 {
	
	public static void main(String[] args){
		// this program detects if a given 3 digit number is a palindrome
		 
		Scanner input = new Scanner(System.in);		// creates new scanner
		
		System.out.print("Enter a three-digit intiger:");
		int num = input.nextInt();		// reads input from user
		
		// a 3 digit number is a palindrome if the first and last digit are the same
		
		int first = num/100;	// obtains first digit
		int last = num%10;		// obtains last digit
		
		if(first == last){
			System.out.printf("%d is a palindrome\n", num);
		}
		else{
			System.out.printf("%d is not a palindrome\n", num);
		}
		
	}

}
