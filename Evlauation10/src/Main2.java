import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 
{
	public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
		 int test=Integer.parseInt(sc.nextLine());
		 
		 for(int l=0;l<test;l++)
		 {
			 ArrayList<Integer> list= new ArrayList<>(); 
			 int len=Integer.parseInt(sc.nextLine());
             String str=sc.nextLine();
             int p=0;
             int i=0;
             int n=0;
             int g=0;
             for(int j=0;j<len;j++)
             {
            	if(str.charAt(j)=='p')
            	{
            		p++;
            	}
            	if(str.charAt(j)=='i')
            	{
            		i++;
            	}
            	if(str.charAt(j)=='n')
            	{
            		n++;
            	}
            	if(str.charAt(j)=='g')
            	{
            		g++;
            	}
             }
             
             list.add(p);
             list.add(i);
             list.add(n);
             list.add(g);
             Collections.sort(list);
             System.out.println(list.get(0));
			 
		 }
	  }
}
