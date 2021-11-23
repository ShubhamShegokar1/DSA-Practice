package practice3.copy;
import java.util.*;
class Sample1 
{
	

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		//If input is “i.like.this.program.very.much”
		//Output will be “i.xyz.this.xyz.very.xyz”


		for (int i = 0; i < str.length() - 1; i++)
		{
			
			if (str.charAt(i) != '.')
			{
				System.out.print(str.charAt(i)+".");
			}
				
			if (str.charAt(i) == '.')
			{
				System.out.print("xyz.");
                while(str.charAt(i)=='.')
                {
				  i++;
                }
			}

			
		}
	}
}