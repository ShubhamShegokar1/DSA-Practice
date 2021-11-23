import java.util.Scanner;

public class performMerging {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int ans[]=new int[n+n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<n)
		{
			 
			if( arr1[i]<=arr2[j]) {
				ans[k]=arr1[i];
			    i++;
			}	
			else if (arr1[i]>arr2[j]){
				ans[k]=arr2[j];
				j++;
			}
			k++; 
		
		}
		if(j==n) {
			for(int m=i;m<n;m++) 
			{
				ans[k]=arr1[m];
						k++;
			}
		}
		
		else if(i==n) {
			for(int m=j;m<n;m++) 
			{
				ans[k]=arr2[m];
						k++;
			}
		}
		
		for(int z=0;z<n+n;z++) {
			System.out.print(ans[z]+" ");
		}
	}

}
