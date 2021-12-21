package practice;
import java.util.Scanner;
public class Fibonacci 
{
	static int arr[]= new int[10+1];
	public static void main(String[] args) 
	{
	  System.out.println( find(10));
	  for(int i=0;i<11;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static int find(int i) {
		if(i<=1) {
			return i;
		}
		if(arr[i]!=0) {
			return arr[i];
		}
		arr[i]= find(i-1)+ find(i-2);
		return arr[i];
	}
}       
