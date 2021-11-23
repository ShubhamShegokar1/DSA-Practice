import java.util.Scanner;
//import java.util.Stack;

public class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++)
		{
			//Stack <Character>vowels= new Stack();
			//Stack <Character>others= new Stack();

	        StringBuffer str = new StringBuffer();  
	        str.append(sc.nextLine());  
	        StringBuilder others=new StringBuilder();  
	        StringBuilder vowels=new StringBuilder();  

			int len=str.length();
			for(int i=0;i<len;i++)
			{
				if(str.charAt(i)=='i' || str.charAt(i)=='a' 
						|| str.charAt(i)=='e' || str.charAt(i)=='o'|| str.charAt(i)=='u' )
				{
					vowels.append(str.charAt(i));
				}
				else
				{
					others.append(str.charAt(i));
				}
			}
			
			System.out.print(vowels);
		   System.out.print(others);

              System.out.println();
		}
	}
}
