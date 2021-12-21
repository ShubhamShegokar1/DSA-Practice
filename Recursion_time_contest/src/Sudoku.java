import java.util.Scanner;
import java.util.Stack;
import java.text.DecimalFormat;
public class Sudoku 
{
	static int arr[][]=new int[9][9];
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	
		solve();
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//			System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
     }
	private static void solve() {
		
		
	}
	
}