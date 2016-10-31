import java.util.Scanner;

public class Exercise_3_29 {

	public static void main(String[] args){
		/** this program determines if, given a center coordinate and radii of 2
		 * input circles, if the second given circle either inside or overlaps the 
		 * first circle
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1'scenter x-, y-coordinates, and radius: ");	
		double c1x = input.nextDouble();	// obtains details for circle 1
		double c1y = input.nextDouble();
		double c1r = input.nextDouble();
		
		System.out.print("Enter circle2'scenter x-, y-coordinates, and radius: ");
		double c2x = input.nextDouble();	// obtains details for circle 2
		double c2y = input.nextDouble();
		double c2r = input.nextDouble();
		
		double distance = Math.sqrt( Math.pow((c1x - c2x), 2) + Math.pow(c1y - c2y, 2)); // computes distance between the centers
		
		if(distance <= Math.abs(c1r - c2r)){
			System.out.println("circle2 is inside circle1");
		}
		else if(distance <= (c1r + c2r)){
			System.out.println("circle2 overlaps circle1");
		}
		else{
			System.out.println("circle 2 does not overlap circle1");
		}
	}
}
