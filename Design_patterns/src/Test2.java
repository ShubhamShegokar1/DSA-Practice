import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Test2 
{

	public static void main(String[] args) 
	{
		int arr[]= {0,1,2,3,4,5,8}; 
        int n=arr.length;
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			
			if(i!=arr[i]) {
				System.out.println(i);
				b=true;
				break;			
			}			
		}
		if(b==false) {
			System.out.println(arr.length);
		}
		
	}
}
