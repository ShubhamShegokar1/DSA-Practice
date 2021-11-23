import java.util.*;

public class happy_nos {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());

		for (int l = 0; l < t; l++) 
		{
			int n = sc.nextInt();
			System.out.println(n);

			// -----------------------------------
			// Logic starts from here

			String number = String.valueOf(n);
			char[] arr = number.toCharArray();
			for (int i = 0; i < arr.length; i++)
			{
			   int a=(arr[i]*arr[i]);
               int b=(arr[i+1]*arr[i+1]);

			}
			
			for (int i = 0; i < arr.length; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

	}

}
