import java.util.*;
public class Reverse 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 int n = Integer.parseInt(sc.nextLine()); 
	      String arr[] = new String[n];
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=sc.nextLine();
					  
		  }
		  sc.close();
		  for(int i=0;i<n;i++)
		  {
			  int count1=0;
			  int count2=0;
			  char ch1='a';
			  char ch2='a';
			  
			  for(int j=0;j<arr[i].length();j++)
			  {
			     if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' ||arr[i].charAt(j)=='i' 
			    		 ||arr[i].charAt(j)=='o' ||arr[i].charAt(j)=='u'  )
			     {
			    	 count1=j;
			    	 ch1=arr[i].charAt(j);
			     }
			  }	  
			  
			  
			  for(int j=n-1;j>=0;j--)
			  {
				  if(arr[i].charAt(i)=='a' || arr[i].charAt(i)=='e' ||arr[i].charAt(i)=='i' 
				    		 ||arr[i].charAt(i)=='o' ||arr[i].charAt(i)=='u'  )
					  {
				     	   count2=j;
				    	 ch2=arr[i].charAt(j);
					  }
		  
    		 }
			  if(count1==count2)
			  {
				  char temp1='a';
				  char temp2='a';
				  temp1=arr[i].charAt(count1) ;
				  temp2=arr[i].charAt(count2) ;

				  System.out.println(temp1);
				  System.out.println(temp1);
				  arr[i].charAt(temp2);
				  arr[i].charAt(temp1);
          System.out.println(arr[i]);
				  
			  }
  		   
	}
 }
}
