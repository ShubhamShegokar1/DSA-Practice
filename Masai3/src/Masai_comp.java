import java.util.*;

public class Masai_comp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int l = 0; l < t; l++) 
		{
			int row=sc.nextInt();
			int col=sc.nextInt();
            int arr[][]=new int[row][col];

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<row;i++)
			{   int max=0;
				for(int j=0;j<col;j++)
				{
					if(max<arr[i][j])
					{
						max=arr[i][j];
					}
				}
				System.out.print(max+" ");

			}
			System.out.println();
		}

	}

}
