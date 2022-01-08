import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Gifts 
{

	public static void main(String[] args) throws IOException 
	{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st= new StringTokenizer(br.readLine());
       int test=Integer.parseInt( st.nextToken());
       for(int l=0;l<test;l++)
       {
    	 StringTokenizer st1= new StringTokenizer(br.readLine());
         int n=Integer.parseInt( st1.nextToken());
         int arr[]=new int[n];
    	 StringTokenizer st2= new StringTokenizer(br.readLine());
         for(int i=0;i<n;i++) 
         {
             arr[i]=Integer.parseInt( st2.nextToken());
         }
            int cnt = 0;
            int feq[]=new int[100001];
		    for(int i = 0; i < n; i++)
		    {
			  if(feq[arr[i]]>0) {
				  
			  }
		      feq[arr[i]]++;
		    }
		System.out.println(cnt);
         
       }

	}

}

