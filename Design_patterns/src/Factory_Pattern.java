import java.util.Scanner;

interface Currency
{
	String getSymbol();
}

class Rupees implements Currency
{
	@Override
	public String getSymbol() {
		return "Rps";
	}
}

class Dollar implements Currency
{
	@Override
	public String getSymbol() {
		return "USD";
	}
}

class CurrencyFactory
{
	public static Currency getCurrency(String country) {
		if(country.equalsIgnoreCase("India"))
		{
			return new Rupees();
		}
		else 	
		{
			return new Dollar();
		}
	}
}


public class Factory_Pattern {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str=sc.nextLine();
		Currency rupee = CurrencyFactory.getCurrency(str);
		System.out.println(rupee.getSymbol());
	}
}
