

//Cpunt * between the two lines

package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class mountBlue {

	public static void main(String[] args) 
	{		
       ArrayList <Integer>list= new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String");
       String str=sc.nextLine();
       
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)=='|')
    	   {
    		   list.add(i);
    	   }
    	   
       }
       
       for(int i=str.length()-1;i>0;i--)
       {
    	   if(str.charAt(i)=='|')
    	   {
    		   
    		   list.add(i);
    	   }
    	   
       }
       
     int count=0;
       for(int i=list.get(0);i<list.get(1);i++)
       {
    	   if(str.charAt(i)=='*')
    	   {
            count++;
    	   }
       }    	  
    System.out.println("Count :"+count);

    }

}


// Program done