package crypto;

public class Lookup {
		public String symbol;
		 public String Name;
		 double TotalSupply;
		 double CurrentPrice;
		

		public Lookup(String symbol, String name, double totalSupply, double currentPrice) {
			super();
			this.symbol = symbol;
			Name = name;
			TotalSupply = totalSupply;
			CurrentPrice = currentPrice;
		}



		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getTotalSupply() {
			return TotalSupply;
		}
		public void setTotalSupply(double totalSupply) {
			TotalSupply = totalSupply;
		}
		public double getCurrentPrice() {
			return CurrentPrice;
		}
		public void setCurrentPrice(double currentPrice) {
			CurrentPrice = currentPrice;
		}
		 

		}


