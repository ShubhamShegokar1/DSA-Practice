import java.io.IOException;
import java.util.Scanner;

public class DetectiveL {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) 
		{
			int row = sc.nextInt();
			int column = sc.nextInt();
			int arr[][] = new int[row][column];
			for (int a = 0; a < row; a++)
			{

				for (int b = 0; b < column; b++) 
				{
					arr[a][b] = sc.nextInt();
				}
			}
			StringBuilder str= new StringBuilder();
			for (int j = 0; j < column; j++) 
			{
				for (int i = 0; i < row - j; i++) 
				{
					str.append(arr[i][j] + " ");
				}
				for (int z = j+1 ; z < column; z++) 
				{
					//str.append(arr[row - j - 1][z] + " ");
				}
			}
			System.out.println(str);
		}

	}
}