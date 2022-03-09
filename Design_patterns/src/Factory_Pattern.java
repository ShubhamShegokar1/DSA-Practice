/*
-> Factory Method Pattern allows the sub-classes to choose 
   the type of objects to create.
-> It promotes the loose-coupling by eliminating the need 
   to bind application-specific classes into the code.
*/


interface Currency {
	String getSymbol();
}

class Rupees implements Currency{
	public String getSymbol() {
		return "rupees";
	}
}

class Dollars implements Currency{
	public String getSymbol() {
		return "dollars";
	}
}

class Choose
{
	Currency currency;
	String temp;
	public Choose(String temp) 
	{
		this.temp=temp;
	}
	public Currency getCurrency() 
	{
		if(temp.equalsIgnoreCase("India")) 
		{
			return new Rupees();
		}
		return new Rupees();
	}
}
public class Factory_Pattern{
	public static void main(String[] args) 
	{
        Choose choose= new Choose("india");
        choose.toString();
        Currency curr=choose.getCurrency();
        System.out.println(curr.getSymbol());
	}
}
