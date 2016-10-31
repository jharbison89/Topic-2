import java.util.Scanner;

public class Exercise_3_17 {
	
	public static void main(String[] args){
		/** this program simulates a rock, paper, scissors game using inputs from the user
		 *  against a random generated option chosen by the computer
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");		// prompts user for choice
		int user = input.nextInt();
		
		int computer = (int)(Math.random() * 3);		// obtains computer choice
		
		String userWord = "error!";		// initialize string variables
		String computerWord = "error!";
		
		switch(user){			// assigns word value corresponding to user choice
			case 0: userWord = "scissor"; break;
			case 1: userWord = "rock"; break;
			case 2: userWord = "paper"; break;
		}
		
		switch(computer){		// assigns word value corresponding to computer choice
			case 0: computerWord = "scissor"; break;
			case 1: computerWord = "rock"; break;
			case 2: computerWord = "paper"; break;
		}
		
		System.out.printf("The computer is %s. You are %s. ", computerWord, userWord);
		
		if(user == computer){		// checks for tie condition
			System.out.print("It is a draw.\n");
		}
		else if((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)){		// checks for lose condition
			System.out.print("You lose.\n");
		}
		else if((computer == 0 && user == 1) || (computer == 1 && user == 2) || (computer == 2 && user == 0)){	// checks for win condition
			System.out.print("You win.\n");
		}
		
	}
}
