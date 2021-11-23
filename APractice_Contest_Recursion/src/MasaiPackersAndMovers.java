import java.util.Scanner;

public class MasaiPackersAndMovers {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    int target=sc.nextInt();
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int j=0;j<n;j++) {
    	arr[j]=sc.nextInt();
    }
    System.out.println(find(arr,0,target,0));
 }
// 9 9 9 10
// 10 9 9 9
// 9 10 9 9
// 9 9 10 9
static int count=0;
private static int find(int[] arr, int i,int target,int check) {	
	if(i==arr.length) {	
	return 0;
	}
	while(check<target ) {
		check+=arr[i];
		if(check==target) {
			count++;
			break;
		}
	}
	
    find(arr,i,target,check+arr[i+1]); 
	return count;
 }
}