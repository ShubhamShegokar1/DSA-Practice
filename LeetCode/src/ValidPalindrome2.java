
public class ValidPalindrome2 
{
	public static void main(String[] args) {
		 String str="aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
		    int j=str.length()-1;
	        int i=0;
	        while(i<j)
	        {
	            if(str.charAt(i)!=str.charAt(j) ){
	            	boolean ans=check(str.substring(i+1, j+1))||check(str.substring(i, j));
	            	System.out.println(ans);
	            	break;
	            }
	          if(str.charAt(i)<'a')
	            i++;
	            j--;
	        }
	       System.out.println(1);
	}

	private static boolean check(String temp) {
		    int j=temp.length()-1;
	        int i=0;
	        while(i<j)
	        {
	            if(temp.charAt(i)!=temp.charAt(j) ){
	            	return false;
	            }
	            i++;
	            j--;
	        }
		
		return true;
	}

}
