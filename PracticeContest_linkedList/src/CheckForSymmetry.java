import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckForSymmetry {
	public static void main(String[] args) throws IOException 
	{ 
	      Scanner sc = new Scanner(System.in);
	      int test=Integer.parseInt(sc.nextLine());
	      for(int l=0;l<test;l++) 
	      {
  		     boolean ans[]= new boolean[2];
		     int n=sc.nextInt();
		     sc.nextLine();
	         char arr[][]= new char[n][n];
	         for(int a=0;a<n;a++)
				{
	     		    String str=sc.nextLine();
					for(int b=0;b<n;b++)
					{
						arr[a][b]=str.charAt(b);
					}
				}
	            boolean b=true;
	            //Vertical
	             int p1=0;
	             int p2=n-1;
	             while(p1<p2 && b==true) 
	             {
	            	 int i=0;	            	 
	            	 while(i<n){
	            		 if(arr[i][p1]!=arr[i][p2]) {
	            			 b=false;
	            			 break;
	            		 }
	            		 i++;
	            	 }
	            	 if(i==n) {
	            		 p1++;
	            		 p2--;
	            	 }
	             }
	             ans[0]=b;
	                  b=true;
		              p1=0;
		              p2=n-1;
	             while(p1<p2 && b==true) 
	             {
	            	 int i=0;	            	 
	            	 while(i<n)
	            	 {
	            		 if(arr[p1][i]!=arr[p2][i]) {
	            			 b=false;
	            			 break;
	            		 }
	            		 i++;
	            	 }
	            	 if(i==n) {
	            		 p1++;
	            		 p2--;
	            	 }
	             }
	            ans[1]=b;
				if(ans[0]==true && ans[1]==true ){
					System.out.println("BOTH");
				}
				else if(ans[0]==false && ans[1]==false){
					System.out.println("NO");
				}
				else if(ans[0]==true){
					System.out.println("VERTICAL");
				}
				else{
					System.out.println("HORIZONTAL");
				}
	            
	      }
	}
}