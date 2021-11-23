import java.util.HashMap;
import java.util.Scanner;

public class MasaiMonetarySystem {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  while(sc.hasNext()) {
			  int n=sc.nextInt();
			  sell(0,n);
		  }
		  sc.close();
	}
	  static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();   


	private static int  sell(int i, int n) 
	{
       if(n<=0) 
       {
    	   return 0;
       }
       if(n<=4) 
       {
    	   return n;
       }
	 map.put(sell(i, n),n);
	 return 1;
	}
}
