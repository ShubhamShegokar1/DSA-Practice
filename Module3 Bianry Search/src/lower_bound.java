import java.util.Scanner;


public class lower_bound
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int target=sc.nextInt();
            int arr[]= new int[n];
            for (int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
            }

            int left=0;
            int right=n-1;
            boolean flag=true;
            int mid=0;
            while(left<=right )
            {
              mid=(left+right)/2;
              if(arr[mid]<target)
              {
                left=mid+1;
              }
              if(arr[mid]>target)
              {
                right=mid-1;
              }
              if(arr[mid]==target) {
                  flag = false;
                  while (mid < n - 1 && arr[mid] == arr[mid + 1]) {
                      mid++;
                  }
                  if (mid == n - 1)
                      System.out.println(n - 1);
                  else
                      System.out.println(mid + 1);
                  break;
              }
            }
        if(flag==true && n%2==0)
        {
            System.out.println(mid);
        }
        else if(flag==true)
        {
            System.out.println(mid+1);
        }
    }
}
