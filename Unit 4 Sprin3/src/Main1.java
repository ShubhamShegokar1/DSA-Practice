import java.util.Scanner;
public class Main1 
{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int k=sc.nextInt();
      int n=sc.nextInt();
      int arr[]= new int[n];
	  for(int j=0;j<n;j++)
	  {
		  arr[j]=sc.nextInt();
	  }
	  System.out.println(find(arr,0)); 
	  
	}

	private static int find(int[] arr, int index) {
		if(index==arr.length-1)
			return 0;
		
		
		
		return find( arr,  index);
	}
}
