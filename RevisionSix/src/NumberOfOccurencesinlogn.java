import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfOccurencesinlogn {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		int left = 0;
		int right = n - 1;
		int mid = 0;
		int cnt = 0;
		while (left <= right) 
		{
			mid = (left + right) / 2;
			if (arr[mid] == target) 
			{
				int temp = mid;
				while (arr[temp] == target) 
				{
					//System.out.println(arr[temp]+" "+temp);
					temp--;
					cnt++;
					if (temp == -1) 
					{
						break;
					}
				}
                mid+=1;
                if(mid<n) {
				while (arr[mid] == target) 
				{
					//System.out.println(arr[mid]+" "+mid);
					mid++;
					cnt++;
					if (mid == n) 
					{
						break;
					}
				}
                }
				break;
			} 
			else if (arr[mid] < target) 
			{
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println(cnt);

	}
}
