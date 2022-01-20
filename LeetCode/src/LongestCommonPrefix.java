
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String str[] = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}
	  public static String longestCommonPrefix(String[] str) {
	        int min=300;
	        int len=str.length;
	        for(int i=0;i<len;i++)
	        {
	             if(min>str[i].length())
	             {
	                 min=str[i].length();
	             }
	        }
	        
	        StringBuilder sb =new StringBuilder();
	           for(int j=0;j<min;j++)
	           {
	               sb.append(str[0].charAt(j));
	           }
	        
	       
	        
	        for(int i=0;i<len;i++)
	        {
	            for(int j=0;j<sb.length();j++)
	            {
	                if(str[i].charAt(j)!=sb.charAt(j)){
	                    sb.delete(j,sb.length());
	                }
	            }
	        }
	        return sb.toString();
	    }
}
