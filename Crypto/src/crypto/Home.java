package crypto;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// this are just examples 
		Lookup  first= new Lookup("ETH", "Ethereum", 90000000, 1131.40);
		 Scanner myObj = new Scanner(System.in); 
		  System.out.println("Search Project Name");
		  String userName = myObj.nextLine();
		  System.out.println("The project you search is "+userName+  "\n"+ "The crypto symbol is "+first.getSymbol()
		 + "\n"+"Total supply is" + first.getTotalSupply()+ "\n "+ "The Current price is : " + "$"+first.getCurrentPrice() );

	}

}
