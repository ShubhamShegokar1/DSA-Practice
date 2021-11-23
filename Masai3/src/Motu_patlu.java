import java.util.*;
class Motu_patlu

{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	
	if((n%5>0 || n%5==0) && n>5 )
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			count++;
			int multiple=5*i;
			if(multiple>=n)
			{
				System.out.println(count-1);
				break;
			}
		}
	}
	else if(n<=4 && n>0)
	{
		System.out.println(1);
	}
	
	
	
		
	
  }  
}

