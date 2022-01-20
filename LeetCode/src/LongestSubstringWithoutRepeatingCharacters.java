import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

//	 public static int lengthOfLongestSubstring(String str) {
//	        int n=str.length();
//	        int arr[]=new int[27];
//	        int ans=0;
//	        int cnt=1;
//	        for(int i=0;i<n;i++)
//	        {
//	            arr[str.charAt(i)-'a']++;
//	            System.out.println(arr[str.charAt(i)-'a']+ " "+cnt);
//	            if(arr[str.charAt(i)-'a']>1 || i==n-1)
//	            {
//	                if(ans<cnt) ans=cnt; 
//	                cnt=0;
//	                Arrays.fill(arr,0);
//	            }
//	            if(cnt==26){
//	                ans=26;
//	                break;
//	            }          
//	            cnt++;
//	           
//	        }
//	        return ans;
//	    }
	 public static int lengthOfLongestSubstring(String str) {
	        int n=str.length();
	        int ans=0;
	        HashSet <Character> set = new HashSet<>();
	        int cnt=0;
	        for(int i=0;i<n;i++)
	        {
	
	            if(set.add(str.charAt(i))==false)
	            {
	                set.add(str.charAt(i));
	                if(ans<cnt) ans=cnt; 
	                cnt=0;
	            }
	            if(cnt==26){
	                ans=26;
	                return ans;
	            }          
	            cnt++;
	           
	        }
	        return ans;
	    }
}
