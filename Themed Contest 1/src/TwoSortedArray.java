import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TwoSortedArray {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int test = Integer.parseInt(st.nextToken());
			for (int l = 0; l < test; l++) 
			{
				StringTokenizer st1 = new StringTokenizer(br.readLine());

				int n=Integer.parseInt(st1.nextToken());
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				StringTokenizer st3 = new StringTokenizer(br.readLine());

				int arr1[] = new int[n];
				int arr2[] = new int[n];
				for(int i=0;i<n;i++)
        		{
        		    arr1[i]= Integer.parseInt(st2.nextToken());
        		}
				for(int i=0;i<n;i++)
        		{
        		    arr2[i]= Integer.parseInt(st3.nextToken());
        		}
				
				int i = 0;
				int j = n-1;
				int cnt = 0;
				while (i < n && j>-1) 
				{
					if (arr1[i] == arr2[j]) 
					{
						cnt++;
						i++;
						j--;
					} 
					else if (arr1[i] < arr2[j]) 
					{
						i++;
					} 
					else if (arr1[i] > arr2[j]) 
					{
						j--;
					}

				}
				System.out.println(cnt);
			}
		}

	}

}
