import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CanTheyBeEqual 
{
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	     StringTokenizer st= new StringTokenizer(br.readLine());
	     int test=Integer.parseInt(st.nextToken());
	     for(int l=0; l<test;l++) 
	     {
		     StringTokenizer st2= new StringTokenizer(br.readLine());
		     int n=Integer.parseInt(st2.nextToken());
		     StringTokenizer st3= new StringTokenizer(br.readLine());
		     StringTokenizer st4= new StringTokenizer(br.readLine());
             String str1=st3.nextToken();
             String str2=st4.nextToken();
             int cnt1[]= new int[27];
             int cnt2[]= new int[27];
             for(int i=0;i<n;i++) {
            	 int temp=str1.charAt(i)-'a';
            	 int temp2=str2.charAt(i)-'a';
            	 cnt1[temp]++;
            	 cnt2[temp2]++;
             }
             boolean b=false;
             for(int i=0;i<27;i++) {
            	 if(cnt1[i]!=cnt2[i]) {
            		 System.out.println("No");
            		 b=true;
            		 break;
            	 }
             }
             if(b==false)
             System.out.println("Yes");
	     }
	}
}
