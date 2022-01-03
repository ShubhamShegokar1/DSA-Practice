import java.util.Scanner;

public class MasaiPalindromic {
    static int cnt;
    static int max=0;
    static String str="";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 str = sc.nextLine();
		int n = str.length();
        
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= i; j--) {
                if(str.charAt(i)==str.charAt(j)) 
                {
                	cnt=1;
                	boolean b=solve(i,j);
                	if(b) cnt=(j-i)+1;
                	if(cnt>max) 
                	{
                		max=cnt;
                	}
                }
			}
		}
		System.out.println(max);
	}

	private static boolean solve(int i, int j) {
      while(i<=j ) {
    	  if(str.charAt(i)!=str.charAt(j)) {
    		  return false;
    	  }
    	  else {
    		  i++;
    		  j--;
    	  }
      }
	return true;
	}

}
