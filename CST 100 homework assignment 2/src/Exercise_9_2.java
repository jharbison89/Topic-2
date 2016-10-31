
public class Exercise_9_2 {

	public static void main(String[] args){
		
		String stockName = "Oracle Corporation";
		String stockSymbol = "ORCL";
				
		Stock newStock = new Stock(stockName, stockSymbol);
		
		double currentValue = 34.35;
		double previousValue = 34.5;
		
		newStock.setPreviousPrice(previousValue);
		newStock.setCurrentPrice(currentValue);
		
		System.out.println("The stock " + stockSymbol + " changed by " + newStock.getChangePercent() + "%");
	}
}
