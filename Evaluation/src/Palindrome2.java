import java.util.*;

public class Palindrome2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
         for(int k=0;k<t;k++)
         {
     		int n = Integer.parseInt(sc.nextLine());
     		ArrayList <Integer>list= new ArrayList<Integer>();
     		list.clear();
     		String str= sc.nextLine();
     		
     		
     		
     		int count=0;
     		for(int i=0;i<n;i++)
     		{
     			count=0;
     		 	for(int j=0;j<n;j++)
     		 	{
     		 		if(str.charAt(i)==str.charAt(j))
     		 		{
     		 			count++;
     		 		}
     		 	}
     		 	list.add(count);
     		}
     		System.out.println(list);
     		
     		
     		
     		
     		int evencount=0;
     		int oddcount=0;
     		for(int i=0;i<n;i++)
     		{
     			 	if(list.get(i)%2==0)
     		 		{
     		 			evencount++;
     		 		}
     			 	else
     			 	{
     			 		oddcount++;
     			 	}
     		 	
     		}
     		if(evencount%2==0 && oddcount!=0)
     		{
     			
     		}
     		else
     		{
     			
     		}
     		System.out.println(evencount);
     		System.out.println(oddcount);
     		System.out.println();
         }        
    }
}
