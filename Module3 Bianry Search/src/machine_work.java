import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class machine_work
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int goal=sc.nextInt();
        int arr[] = new int[n];
        boolean b=true;
        for (int i = 0; i < n ;i++) {
            arr[i] = sc.nextInt();
        }
        long ans=0;
        long min=1;
        long max= (long) 1e18;
        while(min<=max) {
            long mid=(min+max)/2;
            double work=0;
            for(int i=0;i<n;i++) {
                work+=(mid/arr[i]);
                if (work >= goal)
                    break;
            }
            if(work>=goal) {
                max=mid-1;
                ans =  mid;
            }
            else
            {
                min=mid+1;
            }
        }
        DecimalFormat formatter = new DecimalFormat("#");
        System.out.println(formatter.format(ans));

    }
}