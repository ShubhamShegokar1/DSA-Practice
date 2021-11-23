import java.util.Arrays;
import java.util.Scanner;

public class Discover_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int testCases=sc.nextInt();
            double arr[]= new double[n];
            for (int i=0;i<n;i++)
            {
               arr[i]=sc.nextDouble();
            }
            Arrays.sort(arr);
            //10 20 30 40 50
            for(int i=0;i<testCases;i++)
            {
                double target=sc.nextDouble();
                int left=0;
                int right=n-1;
                boolean flag=true;
                while(left<=right )
                {
                    int mid=(left+right)/2;
                    if(arr[mid]>=target)
                    {
                       right=mid-1;
                    }
                    else
                    {
                      left=mid+1;
                    }
                    if(arr[mid]==target)
                    {
                        flag=false;
                        System.out.println("YES");
                        break;
                    }
                }
                if(flag==true)
                {
                    System.out.println("NO");
                }
            }

    }
}
