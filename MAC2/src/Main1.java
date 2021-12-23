import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++) 
		{
			int n=sc.nextInt();
			int oddCnt=0;
			int evenCnt=0;
			for(int i=1;i<=Math.sqrt(n)+1;i++) 
			{
				if(i%2==0 && n%i==0) 
				{
					evenCnt++;
				}
				else if(i%2!=0 && n%i==0) 
				{
					oddCnt++;
				}
			}
			if(evenCnt>oddCnt) {
				System.out.println("Even Skewed");
			}
			else if(evenCnt<oddCnt) {
				System.out.println("Odd Skewed");
			}
			else {
				System.out.println("Not Skewed");
			}
		}
	}
}
