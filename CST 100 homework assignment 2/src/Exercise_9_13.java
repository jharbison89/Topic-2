import java.util.Scanner;

public class Exercise_9_13 {

	public static void main(String[] args){
		/** this is a text program for Location.java.  this program will prompt for a 2 dimensional array input
		 * and return the largest value location and value in that array
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array:");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		double[][] array = new double[rows][columns]; 
		
		System.out.print("Enter the array:");
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				array[i][j] = input.nextDouble();
			}
		}
		
		Location arrayLocation = new Location(array);
		
		int maxRow = arrayLocation.getRow();
		int maxColumn = arrayLocation.getColumn();
		double maxValue = arrayLocation.getMaxValue();
		
		System.out.println("The location of the largest element is " + maxValue +" at (" + maxRow + ", " + maxColumn + ")");
	}
}
