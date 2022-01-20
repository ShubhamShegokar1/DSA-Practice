import java.util.Stack;

public class TwentySix {

	public static void main(String[] args) 
	{
	     int x=1;
	     if(x<0) {
	    		System.out.println(false);
	     }
	     String str=x+"";
	     int len=str.length();
	     int i=0;
	     int j=len-1;
	     while(i<len/2) {
	    	 if(str.charAt(i)!=str.charAt(j)) {
	    		System.out.println(false);
	    	 }
	    	 i++;
	    	 j--;
	     }
	     
	     System.out.println(true);
	}
}
