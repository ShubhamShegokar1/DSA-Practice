import java.util.Arrays;
import java.util.Stack;
public class NextGreater2 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,3};
		int ans[]=nextGreaterElements(nums);
		for(int a:ans) {
			System.out.print(a+" ");
		}
	}
	public static int[] nextGreaterElements(int[] nums) 
    {
        Stack<Integer> stk = new Stack();
        int i=0;
        int n=nums.length;
        int arr[]= new int[n];
        Arrays.fill(arr, -1);
        while(i<n)
        {
          while(!stk.isEmpty() && stk.peek()<nums[i])
          {
              arr[stk.peek()]=nums[i];
              stk.pop(); 
          }
          stk.push(i);
          i++;
        }
     return arr;   
    }
}
