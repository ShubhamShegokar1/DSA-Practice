import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		long odd=0;
		long even=0;
		for (int l = 0; l < test; l++) 
		{
			int temp=sc.nextInt();
			if(temp%2==0) {
				even+=temp;
			}else {
				odd+=temp;
			}
		}
		if(even>odd) {
			System.out.println("Even");
		}else if(odd>even){
		   System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
		
	}
}
