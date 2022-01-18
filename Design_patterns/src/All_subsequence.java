
public class All_subsequence {
	 static String str= "abcd";
	public static void main(String[] args) {
          solve("",0);
	}

	private static void solve( String string, int cur) {
	    
		System.out.println(string);
		if(cur==str.length()) {
			return;
		}
		
		for(int i=cur;i<str.length();i++) {
			string+=str.charAt(i);
			solve(string, i+1);
			String temp="";
			for(int j=0;j<string.length()-1;j++) 
			{
				temp+=string.charAt(j);
			}
			string=temp;
		}
	}
}
