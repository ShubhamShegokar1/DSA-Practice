import java.util.Scanner;
public class strlen 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(sum(str));
		
	}

	private static int sum(String str) 
	{
		if(str.equals(""))
		return 0;
		else
		return sum(str.substring(1))+1;
	}

}