import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EncryptIt 
{

	public static void main(String[] args) throws IOException 
	{
		  BufferedReader br = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        StringTokenizer st
		            = new StringTokenizer(br.readLine());
          String str=st.nextToken();
          int len= str.length();
          StringTokenizer st2
          = new StringTokenizer(br.readLine());
          int k=Integer.parseInt(st2.nextToken());
          
          for(int i=0;i<len;i++)
          {
        	 int temp=str.charAt(i);
        	 if(temp>='a'&& temp <='z' || temp>='A'&& temp <='Z' || temp>='0'&& temp <='9')
        	 {
        		 
        		 if(temp>='a'&& temp <='z') 
        		 {
        			 int start='a';
        			 int end='z';
        			 solve(temp,k,start,end); 
        		 }
        		 else if(temp>='A'&& temp <='Z' )
        		 {
        			 int start='A';
        			 int end='Z';
        			 solve(temp,k,start,end);
        		 }
        		 else {
        			 int start='0';
        			 int end='9';
        			 solve(temp,k,start,end);
        		 }
        		 
        	 }
        	 else {
        		 System.out.print(str.charAt(i));
        	 }
          }
          
	}

	private static void solve(int temp, int k, int start, int end) {
		int ascii=temp+k;
		
		if(ascii>end) 
		{
			for(int j=0;j<k;j++) 
			{
				temp+=1;
				if(temp==end+1) 
				{
					temp=start;
				}
			}
			char temp1=(char)temp;
			System.out.print(temp1);
		}
		else 
		{
			char temp2=(char) (ascii);
			System.out.print(temp2);
		}

	}

}

