package practice;
import java.util.*;
class practice
{ 

	public static void main(String[] args)
	{  
		int t=0,count=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter two no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(b<a)
	{
		t=a;
		a=b;
		b=t;
	}
	
	for(int i=1;i<=b;i++) 
	{   
      count=a+count++;
     }
	
	System.out.println(count);
	
	}
	
}