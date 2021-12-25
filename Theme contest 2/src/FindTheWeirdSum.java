
import java.util.ArrayList;
import java.util.Scanner;

public class FindTheWeirdSum {
	static int max;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++) 
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			max=0;
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			b=false;
			ArrayList <Integer> list = new ArrayList<>();
			solve(arr,0,list);
			if(b) {
				System.out.println("Yes");
			}else
			System.out.println("No");
		}	
	}
	static boolean b;
	private static void solve(int[] arr, int i, ArrayList<Integer> list) {
		if(i==arr.length) 
		{
			int check=0;
			for(int j=0;j<list.size();j++) 
			{
				if(list.get(j)==max) {
					return;
				}
				check+=list.get(j);
			}
			if(check==max) {
				b=true;
			}
			//System.out.println(list+" "+check);
			return;
		}
		
		solve(arr, i+1, new ArrayList<>(list));
		list.add(arr[i]);
		solve(arr, i+1, new ArrayList<>(list));
	}
	


}
