import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimilarText {
	  static String str1="";
	  static String str2="";
	  static int len1;
	  static int len2;
	  static int ans;
	  static int arr[]= new int[100000];
	public static void main(String[] args) throws IOException 
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1= new StringTokenizer(br.readLine());
    StringTokenizer st2= new StringTokenizer(br.readLine());
           str1=st1.nextToken();
           str2=st2.nextToken();
           len1=str1.length();
           len2=str2.length();
           solve(0,0);
           System.out.println(ans);
	}
    	private static int solve(int i, int j) {
    		
    		
    		if(i==len1 || j==len2) {
    			return 0;
    		}
    		if(arr[i+j]>0) {
    			return arr[i+j];
    		}
    		
    		if(str1.charAt(i)==str2.charAt(j)) {
    			ans++;
    			arr[i+j]= 1+solve(i+1, j+1);
    			return arr[i+j];
    		}
    		else {
    			arr[i+j]= max(solve(i+1, j),solve(i, j+1));
    			return arr[i+j];
    		}
			
    	}

    	private static int max(int i, int j) {
    		if(i<j) {
    			return j;
    		}
    		return i;
    	}
}
