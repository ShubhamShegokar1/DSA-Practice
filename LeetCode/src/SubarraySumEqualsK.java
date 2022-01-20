
public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int subarraySum(int[] arr, int k) {
        int len=arr.length;
        long total=0;
        int ans=0;
        int start=0;
        for(int i=0;i<len;i++)
        {
            total+=arr[i];
            while(total>k && start<i){
                total-=arr[start];
                start++;
            }
            if(total==k){
                ans++;
            }
        }
        return ans;
	}
}
