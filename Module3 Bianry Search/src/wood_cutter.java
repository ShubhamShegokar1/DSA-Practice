import java.util.Arrays;
import java.util.Scanner;


public class wood_cutter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double needed=sc.nextDouble();
        int arr[]= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int left=1;
        int right=2000000000;
        double total=0;
        boolean flag=true;
        int mid=0;
        while(flag==true && left<=right)
        {
            mid=(left+right)/2;
            total=0;
            ////////-----------------------------
            for(int i=0;i<n;i++)
            {
                int diff= arr[i]-mid;
                if(diff<=0)
                {
                    continue;
                }
                else
                {
                    total += diff;
                }
            }
            //--------------------
            if(total>=needed)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }

        }
        if(total<needed)
            System.out.println(mid-1);
        else
            System.out.println(mid);
    }
}
