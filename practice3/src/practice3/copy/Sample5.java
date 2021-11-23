package practice3.copy;

import java.util.*;
import java.io.*;
class Sample5{
    public static void main(String args[] ) throws Exception {
     
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer>list1 = new ArrayList<Integer>(); 
        System.out.println("Enter 2 nos");
        for(int k=0;k<2;k++)
        {
            list1.add(sc.nextInt());
        }
        sc.nextLine();

         
        System.out.println("Enter string");
        String str= sc.nextLine();
     //   int n=list1.get(1)*2;
        
        ArrayList <Integer>list2 = new ArrayList<Integer>(); 
      System.out.println("Enter test");
        for(int i=0;i<2;i++)
        {
            list2.add(sc.nextInt());
        }
        
		int count = 0;
		int i=0;
		//----------------------------------
		 int size=list2.size();
		while(size>i)
		{
		 for (int z = list2.get(i); z < list2.get(i+1); z++) 
		{
			System.out.print(" z :----"+str.charAt(z));
			System.out.println("\n");
			for (int j =str.charAt(i); j < str.length(); j++) 
			{
				System.out.print(str.charAt(j));
			}
			i=i+2;
		}
		}
				
		/*for (int j = z; j < list2.get(i+1); j++) 
		{
			if (str.charAt(z) == str.charAt(j))
			{
				count++;
			}
		}*/
		i++;

        System.out.println(count);
        
    }
}
