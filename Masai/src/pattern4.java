import java.util.*;
class pattern4
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int [n];
     int space=0;
    for(int i=0;i<n;i++)
    {
    System.out.print("*"+" ");
    }
    
    
    System.out.println();
    for(int i=0;i<n-1;i++)
    {
		System.out.print("*");
		
		space=(n-2)*2+1;
		for(int k=0;k<space;k++)
		{
		System.out.print(" ");
		}
		System.out.print("*");
     System.out.println();
	
    }
  }  
}

