import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class CodingPractice
{
    public  static int painter(long arr[], int n, long mid)
    {
        long total=0;
        int noOfPainters=1;
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
            if(total>mid)
            {
                total=arr[i];
                noOfPainters++;
            }

        }
        return noOfPainters;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();
            long painters = sc.nextInt();
            long arr[] = new long[n];
            long left = -1;
            long right = 0;
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                long l = Long.parseLong(str);
                arr[i] = l;
                right += arr[i];
                if (left < arr[i]) {
                    left = arr[i];
                }
            }
            while (left <= right) {
                long mid = left + (right - left) / 2;
                int paintersCount = painter(arr, n, mid);
                if (paintersCount > painters) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
            DecimalFormat formatter = new DecimalFormat("#");
            System.out.println(formatter.format(left));

    }
}
