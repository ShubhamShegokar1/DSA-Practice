import java.util.HashMap;
import java.util.Scanner;

public class MasaiMonetarySystem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) 
		{
			int n=sc.nextInt();
			HashMap<Integer,Long> map=new HashMap<Integer,Long>();
			System.out.println(sell(map,n));			   
		}
		sc.close();
	}
	private static long  sell( HashMap<Integer,Long> map,int n) 
	{
		long temp=0;
		if( n>=0)
		{
			if(map.get(n)!=null) {
				return map.get(n);
			}
		}

		if(n<=0) 
		{
			return 0;
		}
		if(n<=4 && n>0) 
		{
			return n;
		}

		temp=max(n,(sell(map,n/2)+sell(map,n/3)+sell(map,n/4)));
		map.put(n,temp);

		return map.get(n);	
	}

	private static long max(int a,long b) 	
	{
		long max=0;
		if(a<b) {
			max=b;
		}
		else {
			max=a;
		}
		return max;
	}
}
