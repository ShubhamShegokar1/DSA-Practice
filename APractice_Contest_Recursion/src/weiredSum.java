import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class weiredSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int m = 0; m < test; m++) 
		{	
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();	
			}
			Arrays.sort(arr);
			int arr1[] = new int[n-1];
			for (int i = 0; i < n-1; i++) 
			{
				arr1[i] = arr[i];
			}
			 b = false;
			ArrayList<Integer> path = new ArrayList<>();
		     find(arr1, 0, path,arr[n-1] );
		     if(b==false) {
		    	 System.out.println("No");
		     }
		   }
	}
  static boolean b=false;
	private static void find(int[] arr, int i, ArrayList<Integer> path, int target) {
		if(b==true) {
			return;
		}
		if(i==arr.length) 
		{
			if(path.size()>0) {
			  int check=0;
			  for(int j=0;j<path.size();j++)  
			  {
				  check+=path.get(j);
			  }
			  
			  if(check==target) {
				b=true;
				System.out.println("Yes");
				return ;
			  }
			}	
		}
		else {
			find(arr,i+1,path,target);
			path.add(arr[i]);
			find(arr,i+1,path,target);
			path.remove(path.size()-1);
		}
		return;
	}

}
