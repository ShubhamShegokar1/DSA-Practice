import java.util.*;

public class String_Reverse_Again
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < n; l++) 
		{
			String str = sc.nextLine();
			String[] splited = str.split(" ");
			int len = splited.length;

			int length = 0;
			for (int i = 0; i < len; i++) 
			{
				length = splited[i].length();
				for (int j = length - 1; j >= 0; j--) 
				{
					System.out.print(splited[i].charAt(j));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
