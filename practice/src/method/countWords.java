package method;

import java.util.Scanner;

public class countWords {
	
	static int count=0,i=0;
    private static int method()
    { 
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter String");
    	String string= sc.nextLine();

		for(int i=0;i<string.length()-1;i++)
		{
			if( string.charAt(i)  == ' ' )
			{
				count++;
			}
		}
		System.out.println(count+1);
    	return 0; 		
    }

	public static void main(String[] args) 
	{
      countWords.method();
	}

}
