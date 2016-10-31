
public class Stock {

	String symbol = "0";		// initialize variables to be used
	String name = "0";
	double previousClosingPrice = 0;
	double currentPrice = 1;
	
	Stock(String newName, String newSymbol){		// construct a Stock object
		symbol = newSymbol;
		name = newName;
	}
	
	void setPreviousPrice(double prevPrice){
		previousClosingPrice = prevPrice;
	}
	
	void setCurrentPrice(double price){
		currentPrice = price;
	}
	
	double getChangePercent(){
		double percent = ((currentPrice / previousClosingPrice) - 1) * 100;
		return percent;
	}
}
