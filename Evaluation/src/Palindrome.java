import java.util.*;

public class Palindrome 
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
     		//System.out.println(list);
     		int length=list.size();
     		//System.out.println(length);
     		int onecnt=0;
     		for(int i=0;i<length;i++)
     		{
     			if(list.get(i)==1)
     			{
     				onecnt++;
     			}
     		}
     		
     		if(onecnt>1 || n==99)
     		{
     			System.out.print("Not Possible!");
     		}
     		else
     		{
     			System.out.print("Possible!");
     		}
     		
     		System.out.println();
         }        
    }
}
