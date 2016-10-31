
public class Location {

	public int row = 0;
	public int column = 0;
	public double maxValue = 0;
	private int i;
	private int j;
	
	Location(double[][] a){
		maxValue = a[0][0];
		
		for(i = 0; i < a.length; i++){
			
			for(j = 0; j < a[row].length; j++){
				if(a[i][j] > maxValue){
					row = i;
					column = j;
					maxValue = a[i][j];
				}
			}		
		}
	}
	
	int getRow(){
		return row;
	}
	
	int getColumn(){
		return column;
	}
	
	double getMaxValue(){
		return maxValue;
	}
	
	
	
}
