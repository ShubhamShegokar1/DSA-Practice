import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int k=sc.nextInt();
         for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
         
         for(int i=k;i<n;i++) {
        	 System.out.print(arr[i]+" ");
         }
         for(int i=0;i<k;i++) {
        	 System.out.print(arr[i]+" ");
         }
	}
}
