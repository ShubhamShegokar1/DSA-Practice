package Pattern;

public class pattern_A {

	public static void main(String[] args) 	{
		
		System.out.print("        ");
		
		for(int i=1;i<6;i++)
		{
			System.out.print(" *");
	
		}
		System.out.println();

		for(int i=1;i<8;i++)
		{
			if(i==4)
			{
				System.out.println("      * * * * * * * *");
			}
			System.out.print("       ");
			System.out.println("*"+"          "+"*");	
			
		}		
		

	}
}
