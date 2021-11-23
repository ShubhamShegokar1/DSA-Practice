import java.util.Scanner;

public class maximize 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	 int test=Integer.parseInt(sc.nextLine());
	 for(int l=0;l<test;l++)
	 {
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 int k=sc.nextInt();
		 int n=1;
		 int ans=0;
		 while(ans<k)
		 {
		  ans=(a*n*n)+(b*n)+c;
		  n++;
		 }
		 System.out.println(n-2);
	 }
  }
}
