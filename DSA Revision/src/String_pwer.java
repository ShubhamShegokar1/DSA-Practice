import java.util.Scanner;
import java.util.Stack;

public class String_pwer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++)
		{
			//Stack <Character> stk= new Stack();
			//Stack <Integer> max= new Stack();

			String str= sc.nextLine();
			int len=str.length();
			int cnt=0;
			int max=0;
			for(int j=0;j<len-1;j++)
			{
				if(str.charAt(j)==str.charAt(j+1))
				{
					cnt++;
				}
				else
				{
					if(max<cnt)
					{
						max=cnt;
					}
					cnt=0;
				}
				 if(j==len-2)
				{
					if(max<cnt)
					{
						max=cnt;
					}
				}
			}
			
			System.out.println(max+1);

		}
	}
}
