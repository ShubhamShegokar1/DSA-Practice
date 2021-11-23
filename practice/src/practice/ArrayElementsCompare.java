package practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayElementsCompare {

	public static  void method()
	{
		Scanner sc = new Scanner(System.in);
		
        int arr[]= {1,2,3,4,5};
        int arr2[]= {2,3,4,1,7};
        int n=arr.length;
        int count=0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if (arr[i] == arr2[j])
				{
                    count++;
				}
			}
		}
		if(count==n)
		{
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) 
	{
      
		ArrayElementsCompare.method();
		
	}

}
