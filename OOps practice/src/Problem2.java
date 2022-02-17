/*
 Create Abstract Class SortingAlgorithm
 Create 3 classes i.e SelectionSort, Insertion Sort, and BubbleSort, and extend them to SortingAlgorithm
 Include the sort(arr[], n) function in each of the above classes implementing the respective algorithm.

- **void** **sort(arr[], n)** Takes 2 parameter i.e
    - **arr[] —> Array containing n elements**
    - **n  —> Size of the array**
    From the **SortingRunner** class,

- Call the three sort functions from the **SortingAlgorithm** object with array size.

**Output:** Print the array each time After calling to sort function.
*/

abstract class SortingAlgorithm
{
	abstract int[] algorithm(int arr[]);
}

class BubbleSort extends SortingAlgorithm
{	
	
	int[] algorithm(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n;i++) 
		{
			for(int j=1;j<n;j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}
	
}

class SelectionSort 
{

	void algorithm() {
		
	}
	
}

class InsertionSort 
{
	void algorithm() {
		
	}

}
public class Problem2 {
	public static void main(String[] args) 
	{
		int arr[]= {8,7,6,5,4,3,2,1,0};
		SortingAlgorithm obj = new BubbleSort();
		int ans[]=obj.algorithm(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
