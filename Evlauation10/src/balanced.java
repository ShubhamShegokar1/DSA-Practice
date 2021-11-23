import java.util.Scanner;
import java.util.Stack;

public class balanced 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	 int test=Integer.parseInt(sc.nextLine());
	 for(int l=0;l<test;l++)
	 {
		 int n=Integer.parseInt(sc.nextLine());
		 String str=sc.nextLine();
		 Stack<Character> stk = new Stack();
		 //2
		 //(()) ()(
		 int i=0;
		while(i<2*n)
		{
			 if(str.charAt(i)==')')
			 {
				 int add=n;
				 while(add-2>0)
				 {
					System.out.print("(");
					add--;
				 }
				 if(n>=2)
				 {
					 System.out.print("()()");
				 }
				 else if(n==1)
				 {
					 System.out.println("-1");
				 }
				 
				 
				 int minus=n;
				 while(minus-2>0)
				 {
					System.out.print(")");
					minus--;
				 }
				 break;
			 }
			 i++;
			
		 }
		System.out.println();
		 
	 }
  }
}
