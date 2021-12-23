import java.util.Scanner;
import java.util.regex.*;

public class EncryptIt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    int n=str.length();
		int k=sc.nextInt();	
	    for(int i=0;i<n;i++) 
	    {
	    	int temp=(char)str.charAt(i);
	    	if((temp>64 && temp<91) || 
	    			(temp>96 && temp<123)||
	    			(temp>47 && temp<58)
	    			)
	    	{
	    		if(temp>96 && temp<123) 
	    		{
	    			for(int j=0;j<k;j++) 
	    			{
	    				temp+=1;
	    				if(temp==123) {
	    					temp=97;
	    				}
	    			}
	    			char temp1=(char)temp;
	    			System.out.print(temp1);
	    		}
	    		else if(temp>47 && temp<58) 
	    		{
	    			for(int j=0;j<k;j++) 
	    			{
	    				temp+=1;
	    				if(temp==58) {
	    					temp=48;
	    				}
	    			}
	    			char temp1=(char)temp;
	    			System.out.print(temp1);
	    		}
	    		else if(temp>64 && temp<91) 
	    		{
	    			for(int j=0;j<k;j++) 
	    			{
	    				temp+=1;
	    				if(temp==91) {
	    					temp=65;
	    				}
	    			}
	    			char temp1=(char)temp;
	    			System.out.print(temp1);
	    		}
	    		
	    	}
	    	else {
    			System.out.print(str.charAt(i));
    		}
    		
    		
    		
	    }
	    
	}
}
