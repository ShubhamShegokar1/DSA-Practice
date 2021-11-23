import java.util.Arrays;
import java.util.Scanner;

public class danceNight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int boys = sc.nextInt();
			int girls = sc.nextInt();
			int arr1[] = new int[boys];
			int arr2[] = new int[girls];
		
			for (int i = 0; i < boys; i++) 
			{
				arr1[i] = sc.nextInt();
			}
			for (int i = 0; i < girls; i++) 
			{
				arr2[i] = sc.nextInt();
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
//			for (int i = 0; i < boys; i++) 
//			{
//				System.out.print(arr1[i]+" ");
//			}
//			System.out.println();
//			for (int i = 0; i < girls; i++) 
//			{
//				System.out.print(arr2[i]+" ");
//			}
			int i=0;
			int j=0;
			while(i<boys && j<girls)
			{
				if(arr1[i]>arr2[j])
				{
					j++;
					i++;
				}
				else {
					j++;
				}
				
			}
			if(i==boys)
			System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
