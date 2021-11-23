import java.util.*;
public class Remove_duplicates 
{
public static void main(String[] args) 
{
  Scanner sc = new Scanner(System.in);
  
  int t=sc.nextInt();
  for(int l=0;l<t;l++)
  {   
	  ArrayList <Integer> list= new ArrayList<Integer>();
	  int n= sc.nextInt();
	  int arr[]= new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      int count=0;
      
      for(int i=0;i<n-1;i++)
      {
    	  if(arr[i]!=arr[i+1] )
    	  {
    		  count++;
    	  }
      }
      System.out.println(count+1);      
      for(int i=0;i<n-1;i++)
      {
    	  if(arr[i]!=arr[i+1] )
    	  {
    			  System.out.print(arr[i]+" ");
    		  
    	  }
    	  if(i==n-2 )
    	  {
    		  System.out.print(arr[n-1]+" ");
    	  }
     }
	  System.out.println();
  }
 }
}
