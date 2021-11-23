import java.util.*;

public class move_zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int l = 0; l < t; l++) 
		{

			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			// ------------------------------------------
			//Logic starts from here
			
			 int count=0;
				for (int i = 0; i < n; i++) 
				{
					if(arr[i]==0)
					{
						count++;
					}
					else
					{
					System.out.print(arr[i] + " ");
					}
				}
				for (int i = 0; i < count; i++) 
				{
				  System.out.print(0+" ");
				}

			System.out.println();
		}

	}

}
