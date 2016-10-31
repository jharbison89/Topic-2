
public class Exercise_9_6 {
	
	public static void main(String[] args){
		// this program utilizes classes StopWatch.java and SelectionSort.java to measure the time it takes to sort 100000 numbers
		
		double[] selection = new double[100000];		// initialize array with 100,000 numbers
		
		for(int i = 0; i < selection.length; i++){		// assigns random values between 1 and 100 to numbers in selection array
			selection[i]= (Math.random() * 100);
		}
		
		StopWatch timer = new StopWatch(); 		//initialize StopWatch
		
		timer.start();		// start StopWatch
		
		SelectionSort.selectionSort(selection);		// sort array
		
		timer.stop();		// stop stopwatch
		
		long time = timer.getElapsedTime();		// get time taken to sort numbers
		
		System.out.printf("It takes %d milliseconds to sort 100,000 numbers\n", time);
	}	
}
