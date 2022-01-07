import java.util.ArrayList;
import java.util.Scanner;

public class GenerateAllSubstrings {
    static int n;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) 
		{
			 n = sc.nextInt();
			 sc.nextLine();
			String str= sc.nextLine();
			ArrayList <String> list = new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				int x=0;
				int y=i;
			    while(x<n) {
					String newStr="";

			    	for(int z=i;z<=x;z++) {
			    		newStr+=""+str.charAt(z);
			    	}
			    	if(newStr.length()>0) {
			    	list.add(newStr);
			    	}
			    	x++;
			    }
			}
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		}
	}

	private static void solve(int i, String str) {
	   if(i==n) {
		   return;
	   }
		int x=0;
		int y=i;
	    while(x<n) {
	    	for(int z=i;z<=x;z++) {
	    		System.out.print(str.charAt(z));
	    	}
	    	x++;
	    	System.out.println();
	    }
	    solve(i+1, str);
	}
}
