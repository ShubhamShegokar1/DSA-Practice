package practice3;
import java.util.*;
class Sample {
    public static void main(String args[] ) 
     { 
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list= new ArrayList<Integer>();
        ArrayList <Integer> list1= new ArrayList<Integer>();

        list.add(sc.nextInt());
        list.add(sc.nextInt());
        sc.skip("[\r\n]+");
        String s = sc.nextLine();
        
        int lengthOfString=list.get(0);
        
        int Query=list.get(1)*2;
        int Q= list.get(1);
        String str=s.substring(0, lengthOfString);
        
        for(int i=0;i<Query;i++)
        {
         list1.add(sc.nextInt());
        }
    	int j=0;
        for(int i=0;i<Q;i++)
        {
        	int a=list1.get(j);
        	int b=list1.get(j+1);
        	System.out.println("a+b"+a +b);
             j=j+2;
             String str1=(str.substring(a, b));
             System.out.println(str);
             
        }
    }
}
