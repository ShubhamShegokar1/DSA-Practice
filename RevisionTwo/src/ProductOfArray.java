import java.util.Scanner;

public class ProductOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int n=sc.nextInt();
			int arr[]= new int[n];
			int product=1;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				product*=arr[i];
			}
			
			int i=0;
			while(i<n) {
				long temp=product;
				int quotient =0;
				while(temp>=arr[i]) {
					temp=temp-arr[i];
					quotient++;
				}
				System.out.print(quotient+" ");
				i++;
			}
			System.out.println();
		}
	}
}
