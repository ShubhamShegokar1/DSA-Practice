import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TeamofHeroes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int i=0;
			int j=n-1;
			boolean b=false;
			while(i<j) {
				if(arr[i]+arr[j]==k) {
					b=true;
					System.out.println("Yes");
					break;
				}
				else if(arr[i]+arr[j]<k) {
					i++;
				}
				else {
					j--;
				}
				
			}
			if(!b){
			System.out.println("No");
			}
		}
	}
}
