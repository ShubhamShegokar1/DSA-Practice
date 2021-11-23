import java.util.*;

public class Is_it_Happy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> list= new ArrayList<>();
		for (int l = 0; l < t; l++) 
		{
		int cnt=0;	
			list.clear();
			int n=sc.nextInt();
		while(n>1)
		{
			cnt++;
			list.clear();
			while (n > 0) 
			{
			    list.add( n % 10);
			    n = n / 10;
		
			}
			//System.out.println(list);
			int len =list.size();
			for(int i=0;i<len;i++)
			{
				n=list.get(i)*list.get(i)+n;
			}
			//System.out.println(n);
            if(n==1)
            {
            	System.out.print("true");
            	break;
            }else if(cnt==10)
            {
            	System.out.print(false);
            	break;
            }
		}
		System.out.println();

		}
		
		
		
		}
	}

