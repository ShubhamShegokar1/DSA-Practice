import java.util.Scanner;

class ArrayEquation
{
	public static void main(String[] args)
	{
		    Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++) {
	        arr[i]=sc.nextInt(); 			
		}
		int evenSum=0;
		int evenCount=0;
		int oddCount=0;
		int oddSum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				evenSum+=arr[i];
				evenCount++;
			}else {
				oddSum+=arr[i];
				oddCount++;
			}
		}
		int ans=(evenSum*evenCount)+(oddCount*oddSum);
		System.out.println(ans);
	}
	
}