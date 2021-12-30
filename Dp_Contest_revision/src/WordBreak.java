import java.util.HashSet;
import java.util.Scanner;
public class WordBreak {
	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		 int test=sc.nextInt();
		 for(int l=0;l<test;l++) 
		 {
			 int n=sc.nextInt();
			 int m=sc.nextInt();
			 sc.nextLine();
			 HashSet<String> dictionary= new HashSet<String>();
			 String sentence =sc.nextLine();
			 for(int i=0;i<m;i++) 
			 {
				 dictionary.add(sc.nextLine());
			 }
			  if(solve(sentence,dictionary)) {
				  System.out.println("No");
			  }else
			  System.out.println("Yes");
			 
		 }
 	}

	private static boolean solve(String sentence, HashSet<String> dictionary) {
             int dp[]= new int[sentence.length()];
             
             for(int i=0;i<sentence.length();i++) 
             {
            	 for(int j=0;j<=i;j++) 
            	 {
            		 String str=sentence.substring(j,i+1);
            		 if(dictionary.contains(str)) 
            		 {
            			 if(j>0) 
            			 {
            				 dp[i]+=dp[j-1];
            			 }
            			 else 
            			 {
            				 dp[i]+=1;
            			 }
            		 }
            	 }
             }

             
		return dp[sentence.length()-1]==0;
	}

}
