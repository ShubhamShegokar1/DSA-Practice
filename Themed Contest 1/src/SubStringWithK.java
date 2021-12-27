import java.util.Arrays;
import java.util.Scanner;

public class SubStringWithK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		int ans=0;		
       
		for(int i=0;i<n;i++) 
		{
			 int arr[]= new int[26];		
			 int count=0;
			for(int j=i;j<n;j++)
			{
				if(arr[str.charAt(j)-'a']==0) 
				{
					count++;
				}
				
				arr[str.charAt(j)-'a']++;
				
				if(count==k) 
				{
					ans++;
				}
			}
			
		}
		System.out.println(ans);
	}

}
