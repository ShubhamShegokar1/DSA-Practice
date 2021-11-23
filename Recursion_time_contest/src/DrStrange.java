import java.util.ArrayList;
import java.util.Scanner;

public class DrStrange {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
        int n=sc.nextInt();
        int arr[]= new int[n];
        int j=0;
        for(int i=1;i<=n;i++) {
        	arr[j]=i;
        	j++;
        }
        ArrayList <Integer> list = new ArrayList<>();
        find(arr,0,list);
 	}

	private static void find(int arr[], int curr, ArrayList <Integer> list) {
	
				
		if(list.size()>0) {
			System.out.println(list);
		}
		
		if(curr==arr.length ) {
			return ;
		}
		
	
     for(int i=curr;i<arr.length;i++) {
    	 list.add(arr[i]);
    	 find(arr, curr+1, list);
    	 System.out.println("sdkisk"+list.get(list.size()-1));
    	 list.remove(list.size()-1);
     }
		
	}

}
