import java.util.Scanner;

public class ArrayandProduct {
    static int row;
    static int column;
    static int ans;
    static int target;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    row = sc.nextInt();
		column = sc.nextInt();
	    target=sc.nextInt();
		int arr[][] = new int[row][column];
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < column; j++) 
			{
              arr[i][j]=sc.nextInt();
			}
		}
	
		countHorizantally(0,0,arr);
		countVertically(0,0,arr);
		countDiagonallyLeft(0,0,arr);
		countDiagonallyRight(0,column-1,arr);

       System.out.println(ans);
	}
	
    static boolean DiagonallyRight[][]= new boolean[100][100];

	private static void countDiagonallyRight(int i, int j, int[][] arr) {
		if(i+2==row || j-2==-1) {
			return;
		}
		if(DiagonallyRight[i][j]==true) {
			return;
		}
		//System.out.println(arr[i][j]+" "+arr[i+1][j+1]+" "+arr[i+2][j+2]);
		DiagonallyRight[i][j]=true;
		if((arr[i][j]*arr[i+1][j-1]*arr[i+2][j-2])==target) {
		ans++;
		}
		countDiagonallyRight(i+1,j-1,arr);
		countDiagonallyRight(i,j-1,arr);
		countDiagonallyRight(i+1,j,arr);
	}
	
	
	
    static boolean DiagonallyLeft[][]= new boolean[100][100];
	private static void countDiagonallyLeft(int i, int j, int[][] arr) {
		if(i+2==row || j+2==column) {
			return;
		}
		if(DiagonallyLeft[i][j]==true) {
			return;
		}
		//System.out.println(arr[i][j]+" "+arr[i+1][j+1]+" "+arr[i+2][j+2]);
		DiagonallyLeft[i][j]=true;
		if((arr[i][j]*arr[i+1][j+1]*arr[i+2][j+2])==target) {
			ans++;
		}
		countDiagonallyLeft(i+1,j+1,arr);
		countDiagonallyLeft(i+1,j,arr);
		countDiagonallyLeft(i,j+1,arr);
	}
	
	
	///////vertically
    static boolean vertical[][]= new boolean[100][100];
	private static void countVertically(int i, int j, int[][] arr) {
		if(i+2==row || j==column) {
			return;
		}
		if(vertical[i][j]==true) {
			return;
		}
		vertical[i][j]=true;
		if((arr[i][j]*arr[i+1][j]*arr[i+2][j])==target) {
			ans++;
		}
		
		countVertically(i+1, j,arr);
		countVertically(i, j+1,arr);
		
	}
	
  
    static boolean horizontal[][]= new boolean[100][100];
	private static void countHorizantally(int i, int j, int[][] arr) {
		if(i==row || j+2==column) {
			return;
		}
		if(horizontal[i][j]==true) {
			return;
		}

		horizontal[i][j]=true;

		if((arr[i][j]*arr[i][j+1]*arr[i][j+2])==target) {
			ans++;
		}
		
		countHorizantally(i, j+1,arr);
		countHorizantally(i+1, j,arr);
	}

}
