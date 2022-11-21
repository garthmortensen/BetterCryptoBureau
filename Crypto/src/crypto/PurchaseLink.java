package crypto;

public class PurchaseLink  {
public String Name;
public String symbol;
public String Exchanges;

 public PurchaseLink(String name, String symbol, String exchanges) {
	super();
	Name = name;
	this.symbol = symbol;
	Exchanges = exchanges;
}


public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}


public String getSymbol() {
	return symbol;
}

public void setSymbol(String symbol) {
	this.symbol = symbol;
}

public String getExchanges() {
	return Exchanges;
}

public void setExchanges(String exchanges) {
	Exchanges = exchanges;
}

public void  List( String Exhanges) {
System.out.println("Will list a number of echanges that you can purchase that crypto");
	 
 }
 
}
