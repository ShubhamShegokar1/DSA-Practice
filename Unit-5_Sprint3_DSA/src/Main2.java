import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println( find(n));		
	}
    static int arr[]= new int[51];
	private static int find(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(arr[n]!=0) {
			return arr[n];
		}
		
		arr[n]=find(n-1)+find(n-3)+find(n-4);
		return arr[n];
	}
}
