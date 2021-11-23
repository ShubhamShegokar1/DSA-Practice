import java.util.Scanner;
class Masai
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int seven=0; 
    int five=0;	
    int threefive=0;
   
    for(int i=0;i<1000;i++)
    {
       seven=7*i; 
       
       five=5*i;

       threefive=35*i;	
    
    if(seven==n && seven!=0)
    {
    	System.out.println("Masai");
    	break;
    }

    
    else if(five==n && five!=0)
    {
    	System.out.println("School");
    	break;
    }
    
    else if(threefive==n )
    {
    	System.out.println("Masai School");
    	break;
    }
    else if(seven>n  && five>n  && threefive>n ) 
    {
    	
    	System.out.println("Hurray!");
    	break;
    }
    
    }

  }
}

