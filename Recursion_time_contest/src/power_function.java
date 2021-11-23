import java.util.Scanner;
public class power_function 
{
	public static void fun(int a,int b,int ans)
	{
		if(b==1)
		{
			System.out.println(ans);
			return;
		}
		ans=ans*a;
		fun(a,b-1,ans);
		
	}
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
 
	 int a=sc.nextInt();
	 int b=sc.nextInt();
     int ans=a;
     if(b>0 && a>0)
     {
	   fun(a,b,ans);
     }
     else
     {
    	 System.out.print(1);
     }
	}

}
