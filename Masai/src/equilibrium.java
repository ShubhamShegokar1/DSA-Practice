import java.util.*;
class equilibrium
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
   
    ArrayList <Integer> list= new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
    	list.add(sc.nextInt());
    }
   
 //mid value   
    int sum=0;
    
    for(int i=0;i<n;i++)
    {
    	sum=sum+list.get(i);
    }
    
    
    int mid =sum/2;
    
    //  left side sum of elements
 
    int count1=0;
    int No1=0;
    int Left_Index=0;

    for(int i=0;i<n;i++)
    {
    	count1=count1+list.get(i);
    	if(mid<count1)
    	{
  
    		No1=list.get(i);
    		Left_Index=list.indexOf(No1);
    		break;
    	}
    	
    }
    
    
    //  right side sum of elements

    
    int count2=0;
    int No2=0;
    int Right_Index=0;
    for(int i=n-1;i>-1;i--)
    {
    	count2=count2+list.get(i);
    	if(mid<count2)
    	{
    	
    		No2=list.get(i);
    		Right_Index=list.indexOf(No2);
    		break;
    	}
    	
    }
   
    // check indexx  same  or not 
    
   if(Left_Index==Right_Index && count1== count2)
   {
	   System.out.println(list.indexOf(No1)+1);
   }
   else
   {
	   System.out.println(-1);
   }
    
  }
}
