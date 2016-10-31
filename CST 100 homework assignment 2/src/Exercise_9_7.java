
public class Exercise_9_7 {

	public static void main(String[] args){
		// this is a test program to Account.java
		
		Account account = new Account(1122, 20000);
		
		account.updateRate(4.5);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		
		System.out.println("The balance is $" + account.getBalance());
		System.out.println("The monthly interest is $" + account.getMonthlyInterest());
		System.out.println("The account was opened on " + account.getDate());
	}
}
