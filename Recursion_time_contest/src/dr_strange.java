import java.util.Scanner;
public class dr_strange 
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int j=0;
      for(int i=1;i<=n;i++) {
    	  arr[j]=i;
    	  j++;
      }
      fun(0,arr);
	}

	private static void fun(int i, int[] arr) {
		if(i==arr.length) {
			return;
		}
		for(int j=0;j<=i;j++) {
	    	  System.out.print(arr[j]+" ");
	      }
		System.out.println();
		fun(i+1, arr);
	}
}
