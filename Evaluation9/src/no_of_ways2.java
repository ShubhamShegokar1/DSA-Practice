import java.util.Scanner;

public class no_of_ways2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++)
		{
		  int n=sc.nextInt();
		  
		  int checkFor3=n;
		  int ans=1;
		  if(n>3)
		  {
			  while(checkFor3>=3)
			  {
			   checkFor3=checkFor3-3;
			   ans=checkFor3+ans;
			  }
		  }
		  int checkFor5=n;
		  if(n>5)
		  {
			  while(checkFor5>=5)
			  {
			   checkFor5=checkFor5-5;
			   ans=checkFor5+ans;
			  }
		  }
		  System.out.println(ans);
		  
		}
	}
}
