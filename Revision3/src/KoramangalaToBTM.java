import java.util.Scanner;

public class KoramangalaToBTM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int index=0;
		int value=arr[0];
		int cnt=0;
		while (index < n - 1) 
		{
			int tempIndex=0;
			//System.out.println(index);
			int currValue=0;
			for (int z = index+1; z <= index + value && tempIndex!=n-1; z++) 
			{
				//System.out.print(z+" ");
				if (z >= n-1) 
				{
					tempIndex = n-1;
				}
 
				if (currValue < arr[z]) 
				{
					currValue = arr[z];
					tempIndex = z;
				}
			}
		
			value=currValue;
			index=tempIndex;
		   System.out.println(value+" "+index);
			cnt++;
		}
		System.out.println(cnt);
		
	}

}
