import java.util.ArrayList;
import java.util.Scanner;
class building
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int T=sc.nextInt();
    for(int l=0;l<T;l++)
    {
    	int height=sc.nextInt();
        int price=sc.nextInt();
        int arr[]=new int[height];
        int count=0;
        for(int i=0;i<height;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int temp=0;
for(int i=0;i<height;i++)
{     
	if(arr[temp]<arr[i])
	{ 
		temp=i;
		count++;
	}
}
        System.out.println((count+1)*price);
    }
  }
     
}

