
import java.util.ArrayList;
import java.util.Scanner;

public class DArrayAndPhraseReturns 
{
   static int row;
   static int column;
   static char arrCheck[]= {'m','a','s','a','i','s','c','h','o','o','l'};
   static char[][] arr = new char[100][100];
   static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		row=sc.nextInt();
		column=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < row; i++) {
			String str = sc.nextLine();
			int z = 0;
			for (int j = 0; j < 2 * column; j++) 
			{
				if (j % 2 == 0 || j == 0) 
				{
					arr[i][z] = str.charAt(j);
					z++;
				}
			}
		}
		
		boolean temp=false;
		for (int i = 0; i < row &&temp==false; i++) 
		{
			for (int j = 0; j < column &&temp==false; j++) 
			{
				if (arr[i][j] == 'm') 
				{
					solveit(i, j, n, 0);
				}
				if(status==true) {
					System.out.println("YES");
					temp=true;
					break;
				}
			}
		}
		if(temp==false) {
			System.out.println("NO");
		}
	
	}
	static boolean status;
		public static void solveit(int i,int j,int n,int z)
		{
			if(z>=11) {
				status=true;
				return ;
			}
			if(i<0 || i>=row || j<0 || j>=column  ) {
				return ;
			}
			if( arr[i][j]!=arrCheck[z]) {
					return ;
			}
			solveit(i-1, j-1, n, z+1);
			solveit(i+1, j+1, n, z+1);
			solveit(i-1, j+1, n, z+1);
			solveit(i+1, j-1, n, z+1);	
			
			solveit(i, j+1, n, z+1);
			solveit(i, j-1, n, z+1);
			solveit(i-1, j, n, z+1);
			solveit(i+1, j, n, z+1);
	}
}
