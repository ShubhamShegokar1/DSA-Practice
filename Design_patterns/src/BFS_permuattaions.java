import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_permuattaions {
	public static void main(String[] args) 
	{
		isAnagram("anagram","nagaram");
	}
	 public static boolean isAnagram(String s, String t) {
	       int cnt1[]=new int[27];
	        int max=Math.max(s.length(), t.length());
	        for(int i=0;i<max;i++) {
	            if(i<s.length())  cnt1[s.charAt(i)-'a']++;
	            if(i<t.length())  cnt1[t.charAt(i)-'a']--;
	        }
	       
	         for(int i=0;i<27;i++){
	             if(cnt1[i]!=0) return false;
	         }           
	        return true;
	    }
}
