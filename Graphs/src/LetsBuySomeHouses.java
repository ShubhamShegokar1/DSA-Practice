import java.util.Scanner;

public class LetsBuySomeHouses {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++)
		{
			int n = sc.nextInt();
			int arr[] = new int[10000];
			int cnt=0;
			for(int i=0;i<2*n;i++) {
					arr[sc.nextInt()]=1;
			}
			for(int i=0;i<10000;i++) {
				if(arr[i]==1) {
					cnt++;
				}
			}
			System.out.println(cnt);
			
		}
	}

}
