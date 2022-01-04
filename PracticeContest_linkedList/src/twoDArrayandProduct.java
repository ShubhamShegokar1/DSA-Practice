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
			for (int i = 0; i < row && b == false; i++) {
				for (int j = 0; j < column; j++) {
					if (j + 2 >= column) 
					{
						break;
					} 
					else 
					{
						int product = arr[i][j] * arr[i][j + 1] * arr[i][j + 2];

						if (product == target) {
							//System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
							cnt++;
						}
					}
				}
			}
			
			
			for (int j = 0; j < column && b == false; j++) {
				for (int i = 0; i < row - 2; i++) {

					int product = arr[i][j] * arr[i + 1][j] * arr[i + 2][j];
					//System.out.println(arr[i][j] + " " + arr[i + 1][j] + " " + arr[i + 2][j]);

					if (product == target) {
						 //System.out.println(arr[i][j]+" "+arr[i+1][j]+" "+arr[i+2][j]);
						cnt++;

					}
				}
			}
			
			
			for(int i=0;i<row;i++) {
				int x=i;
				int y=0;
				while(x>=0 && y<column && x-2>-1 && y+2<column) {
					int product = arr[x][y] * arr[x -1][y+1] * arr[x - 2][y+2];
					if (product == target) {
						cnt++;
					}
					x--;
					y++;
				}
			}
			for(int j=0;j<column;j++) {
				int x=row-1;
				int y=j;
				while(x>=0 && y<column && x-2>-1 && y+2<column) {

					//System.out.println(arr[x][y] +" "+ arr[x -1][y+1] +" "+ arr[x - 2][y+2]);
					
					int product = arr[x][y] * arr[x -1][y+1] * arr[x - 2][y+2];
					if (product == target) {
						cnt++;
					}
					
					x--;
					y++;
				}
			}
		//=======================================================
			for(int j=0;j<column;j++) {
				int x=row-1;
				int y=j;
				while(x>-1 && y>-1 && x-2>-1 && y-2>-1) {
				
					int product = arr[x][y] * arr[x -1][y-1] * arr[x - 2][y-2];
					if (product == target) {
						cnt++;
					}
					
					x--;
					y--;
				}
			}
			for(int j=column-1;j>0;j--) {
				int x=0;
				int y=j;

				while(x<row && y<column && x+2<row && y+2 <column) {
					
					//System.out.println(arr[x][y] +" "+ arr[x +1][y+1] +" "+ arr[x + 2][y+2]);
					
					int product = arr[x][y] * arr[x +1][y+1] * arr[x + 2][y+2];
					if (product == target) {
						cnt++;
					}
					
					x++;
					y++;
				}
			}
		
			System.out.println(cnt);
			
			

	}
}
