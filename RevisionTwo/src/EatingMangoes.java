import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EatingMangoes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st1= new StringTokenizer(br.readLine());
        int test=Integer.parseInt(st1.nextToken());
	    for(int l=0;l<test;l++) 
	    {
		    StringTokenizer st2= new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st2.nextToken());
			int arr[]= new int[n];
		    StringTokenizer st3= new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(st3.nextToken());
			}
			long minTime=0;
			int currHeight=0;
			for(int i=0;i<n;i++)
			{
			  	 if(currHeight<arr[i]) {
			  		 minTime+=arr[i]-currHeight;
			  	 }
			  	 else
			  	 {
			  		 minTime+=currHeight-arr[i];	 
			  	 }
			  	 currHeight=arr[i];
			  	 minTime+=2;
			}
			System.out.println(minTime-1);
	    }
	}

}
