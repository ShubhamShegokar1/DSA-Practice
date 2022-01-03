import java.util.Scanner;

public class ConsecutiveEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++)
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int cnt=0;
			boolean b=false;
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2==0){
					cnt++;
				}else {
					cnt=0;
				}
				if(cnt>=3) {
					b=true;
					System.out.println("Yes");
					break;
				}
				
			}
			if(b==false) {
				System.out.println("No");
			}

		}
	}

}
