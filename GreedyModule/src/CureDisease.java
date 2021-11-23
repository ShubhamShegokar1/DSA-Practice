import java.util.Arrays;
import java.util.Scanner;

public class CureDisease {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		  int n=sc.nextInt();
			int arr[] = new int[n];
			int arr1[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) 
			{
				arr1[i] = sc.nextInt();
			}
		    int i=0;
		    boolean b=false;
			while(i<n)
			{
				if(arr[i]<=arr1[i])
				{
					b=true;
					System.out.println("No");
					break;
				}
				i++;
			}
			if(b==false)
			System.out.println("Yes");
	
	}
}
