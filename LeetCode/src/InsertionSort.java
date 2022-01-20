import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
	  int arr[]= {6,4,2,1,0,-4};
      int len =arr.length;
      Arrays.sort(arr);
	  for(int i=0;i<len;i++) {
		  int j=i-1;
		  while(j>=0) 
		  {
			  if(arr[i]<arr[j]) 
			  {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				  i--;
			  }
			  j--;
		  }
	  }
      for(int a:arr) {
    	  System.out.print(a+" ");
      }
	}

}
