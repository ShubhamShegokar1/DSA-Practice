import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		int arr[]= new int[27];
		//int ascii='a';
		//System.out.println(ascii-96);
		for(int i=0;i<n;i++) {
			int temp=str.charAt(i);
			arr[temp-96]++;
		}
		int cnt=0;
		for(int i=0;i<=26;i++) {
			if(arr[i]>0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
//zomsein