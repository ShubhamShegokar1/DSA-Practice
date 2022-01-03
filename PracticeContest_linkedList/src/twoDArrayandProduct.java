import java.util.Scanner;

public class twoDArrayandProduct {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
			int row = sc.nextInt();
			int column = sc.nextInt();
			int target=sc.nextInt();
			int arr[][] = new int[row][column];
			for (int i = 0; i < row; i++) 
			{
				for (int j = 0; j < column; j++) 
				{
                  arr[i][j]=sc.nextInt();
				}
			}
		
			boolean b=false;
			int cnt=0;
//			for (int i = 0; i < row && b == false; i++) {
//				for (int j = 0; j < column; j++) {
//					if (j + 2 >= column) {
//						break;
//					} else {
//						int product = arr[i][j] * arr[i][j + 1] * arr[i][j + 2];
//
//						if (product == target) {
//							System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
//							cnt++;
//						}
//					}
//				}
//			}
//			
//			
//			for (int j = 0; j < column && b == false; j++) {
//				for (int i = 0; i < row - 2; i++) {
//
//					int product = arr[i][j] * arr[i + 1][j] * arr[i + 2][j];
//					System.out.println(arr[i][j] + " " + arr[i + 1][j] + " " + arr[i + 2][j]);
//
//					if (product == target) {
//						 System.out.println(arr[i][j]+" "+arr[i+1][j]+" "+arr[i+2][j]);
//						cnt++;
//
//					}
//				}
//			}
//			
			
			for(int i=0;i<row;i++) {
				int x=i;
				int y=0;
				while(x>=0 && y<column ) {
					
					System.out.print(arr[x][y]+" ");
					x--;
					y++;
				}
				System.out.println();
			}
			for(int j=0;j<column;j++) {
				int x=j;
				int y=0;
				while(x>=0 && y<column ) {
					//System.out.println(x+" "+y);
					System.out.print(arr[x][y]+" ");
					x--;
					y++;
				}
				System.out.println();
			}
			
		//	System.out.println(cnt);
			
			

	}
}
