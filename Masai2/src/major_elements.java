import java.util.*;

public class major_elements {
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
			int count=0;
			for (int i = 0; i < n; i++)
			{
				if(arr[i]==arr[i+1])
				{
			      count++;
			      if(count>n/2)
			      {
			    	  System.out.print(arr[i]);
			    	  break;
			      }
			      
				}
				else
			      {
			    	  System.out.print(-1);
			    	  break;

			      }
			}
			System.out.println();
		}

	}

}
