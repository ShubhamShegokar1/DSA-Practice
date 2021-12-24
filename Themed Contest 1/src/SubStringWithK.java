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
        int arr[]= new int[26];
		for(int i=0;i<n;i++) 
		{
			int cnt=0;
			Arrays.fill(arr, 0);
			for(int j=i;j<n;j++) 
			{
				if(arr[str.charAt(j)-'a']==0) {
				  // System.out.print(str.charAt(j));
				   cnt++;
				}
				arr[str.charAt(j)-'a']++;
				if(cnt==k) {
					ans++;
				}
				if(cnt==k) {
					break;
				}
			}
			//System.out.println();
		}
		System.out.println(ans);
	}

}
