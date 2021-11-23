import java.util.*;

public class prefix {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
			int t = Integer.parseInt(sc.nextLine()); 
			for (int l = 0; l < t; l++) 
			{
				int n = Integer.parseInt(sc.nextLine()); 
				String[] arr = new String[n];

				for (int i = 0; i < n; i++)
				{
					arr[i] = sc.nextLine();
				}
				for (int i = 0; i < n; i++)
				{
					System.out.print(arr[i]+" ");
				}
				
				
				int count=0;
				for (int i = 0; i < n; i++)
				{   count++;
					while(count<1+i && count<n)
					{
						System.out.println(arr[i]);
					}
					
				}	
				
				
				System.out.println();
			}
	}
}
