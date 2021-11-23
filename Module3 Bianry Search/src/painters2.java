import java.text.DecimalFormat;
import java.util.Scanner;
public class painters2
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int l=0;l<test;l++)
        {
            int n= sc.nextInt();
            int painters=sc.nextInt();
            int arr[]=new int[n];
            long left=0;
            long right=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(left<arr[i])
                {
                    left=arr[i];
                }
                right+=arr[i];
            }

            while(left<=right)
            {
                long mid=(left+right)/2;
               int requires=Painters(arr, n , painters, mid);
               if(requires>painters){
                  left=mid+1;
               }else{
                  right=mid-1;
               }
            }
            DecimalFormat formatter = new DecimalFormat("#");
            System.out.println(formatter.format(left));
        }
    }

    private static int Painters(int[] arr, int n, int painters, long mid) {
        long total=0;
        int temp=1;

        for(int i=0;i<n;i++)
        {
            total+=arr[i];
            if(total>mid)
            {
                total=arr[i];
                temp++;
            }
        }
     return temp;
    }
}