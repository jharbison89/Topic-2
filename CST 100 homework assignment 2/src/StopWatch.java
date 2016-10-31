
public class StopWatch {

	private long startTime;
	private long endTime;
	
	StopWatch(){
		startTime = System.currentTimeMillis();		// initialize startTime to current time
	}
	
	void start(){
		startTime = System.currentTimeMillis();		// sets startTime to current time when started
	}
	
	void stop(){
		endTime = System.currentTimeMillis();		// sets endTime to current time when ended
	}
	
	long getElapsedTime(){
		return endTime - startTime;		// calculates total time taken between start and end
	}
}
