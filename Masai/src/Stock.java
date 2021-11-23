import java.util.Scanner;
class Stock
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[7];
    for(int i=0;i<7;i++)
    {
    	arr[i]=sc.nextInt();
    }
    
    int r=0;
    
   
    	if(arr[0]==1)
    	{
    	  r=110*5+r;	
    	}
    	
    	 if(arr[1]==1)
    	{
    	  r=120*2+r;	
    	}
    	 
    	 if(arr[2]==1)
    	{
      	  r=42*2+r;
      	}
    	 
    	 if(arr[3]==1)
    	{
      	  r=3*53+r;	      	 

      	}
    	 
    	 if(arr[4]==1)
    	{
      	  r=2*40+r;	      	

      	}
    	 
    	 if(arr[5]==1)
    	{
      	  r=32*5+r;	      	 

      	}
    	 
    	 if(arr[6]==1)
    	{
      	  r=126*2+r;
      	  System.out.println(r);
      	}
    	 
       //	System.out.println(r);
       System.out.println(r*n);
    
  }
}

