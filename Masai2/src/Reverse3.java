import java.util.*;
public class Reverse3 
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
		     int count1=-1;
		     int count2=-1;
			for (int i = 0; i < n; i++)
			{
              //System.out.println(i);
				for (int g = 0; g < arr[i].length(); g++)
				{
					count1++;
					if (arr[i].charAt(g) == 'a' || arr[i].charAt(g) == 'e' || arr[i].charAt(g) == 'i'
							|| arr[i].charAt(g) == 'o' || arr[i].charAt(g) == 'u')
					{
						System.out.println(arr[i].charAt(g));
						System.out.println("count1 "+count1);
                        break;						
					}
				}
				
				for (int j = arr[i].length() - 1; j >= 0; j--) 
				{
					count2++;
					if (arr[i].charAt(j) == 'a' || arr[i].charAt(j) == 'e' || arr[i].charAt(j) == 'i'
							|| arr[i].charAt(j) == 'o' || arr[i].charAt(j) == 'u') 
					{
						System.out.println(arr[i].charAt(j));
                        count2=arr[i].length()-1-count2;
                        System.out.println("count2 "+count2);

                       break;
					}
				}
				
				 char temp1 = arr[i].charAt(count1);
				 char temp2 = arr[i].charAt(count2);
              // System.out.println(arr[i].charAt());
               //System.out.println(arr[i].charAt(second.get(q)));
                 System.out.println(temp1+" "+temp2);
                 //System.out.println(arr[2]);
                 //System.out.println(arr[5]);

                 
			}
		  for(int i=0;i<n;i++)
		  {
			  System.out.print(arr[i]);
		  }
 }
}
