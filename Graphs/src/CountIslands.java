import java.util.Scanner;

public class CountIslands {

	 static int cnt=0;
     static int row=0;
     static int column=0;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			cnt=0;
		   row=sc.nextInt();
		   column=sc.nextInt();
		  int arr[][]= new int[row][column];	
		  for(int i=0;i<row;i++) 
		  {
			  for(int j=0;j<column;j++) 
			  {
				  arr[i][j]=sc.nextInt();
			  }
		  }
		  
		  
		 
		  for(int i=0;i<row;i++) 
		  {
			  for(int j=0;j<column;j++) 
			  {
				 if(arr[i][j]==1) 
				 {
					cnt++;
					findAllOne(arr,i,j);	
					
				 }
			  }
		  }
		  
		  System.out.println(cnt);
		  
		}

	}

	private static void findAllOne(int arr[][], int i, int j) {
		
		if(i<0 || i>=row || j<0 || j>=column || arr[i][j]!=1) {
			return ;
		}
		arr[i][j]=2;
		findAllOne(arr, i-1,  j);
		findAllOne(arr, i+1,  j);
		findAllOne(arr, i,    j-1);
		findAllOne(arr, i,  j+1);
	
		return ;
	}

}
