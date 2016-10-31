import java.util.Scanner;

public class Exercise_3_2 {

	public static void main(String[] args) {
		// this program provides 3 single digit integers and asks the user to add them.  It then checks if the numbers are correct
		
		Scanner input = new Scanner(System.in);
		
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		int c = (int)(Math.random() * 10);
		
		System.out.printf("Please add %d, %d, and %d\n", a, b, c);
		int d = input.nextInt();
		
		int answer = a + b + c;
		
		if(d == answer){
			System.out.printf("CORRECT!! %d + %d + %d = %d\n", a, b, c, answer);
		}
		else{
			System.out.printf("Sorry, %d + %d + %d = %d, not %d\n", a, b, c, answer, d);
		}

	}

}
