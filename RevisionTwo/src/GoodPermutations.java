import java.util.Scanner;

public class GoodPermutations 
{
		static int n;
		static int cnt;
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
		    n=sc.nextInt();
			String str="";
		    for(int i=0;i<n;i++) {
		    	str+=i+1+"";
		    }
		   solve(str,"");
		   System.out.println(cnt);
		}
		private static void solve(String stringg, String ans) 
		{
			if(stringg.length()==0) 
			{  
				boolean b=false;
				for(int i=0;i<n;i++) 
				{
					int temp=ans.charAt(i)-48;
					if(temp%(i+1)!=0 && (i+1)%temp!=0) {
						b=true;
					}
				}
				if(b==false) {
					cnt++;
				}
				return;
			}
			
			for(int i=0;i<stringg.length();i++) 
			{
				char ch=stringg.charAt(i);
				String left=stringg.substring(0,i);
				String right=stringg.substring(i+1);
	            String temp=left+right;
	            solve(temp, ans+ch);
			}
		}

	}