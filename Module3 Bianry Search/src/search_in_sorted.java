import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class search_in_sorted
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int target=sc.nextInt();
            int arr[]= new int[n];

            int temp=Integer.MAX_VALUE;
            int min=0;
            for (int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
               if(temp>arr[i])
               {
                temp=arr[i];
                min=i;
               }
            }

             int left=0;
             int right=0;
            if(target >= arr[min] && target<=arr[n-1])
            {
                left=min;
                right=n-1;
            }
            else
            {
                left=0;
                right=min-1;
            }

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
              if(arr[mid]==target)
              {
                  flag=false;
                  System.out.println(mid );
                  break;
              }
            }
        if(flag==true )
        {
            System.out.println(-1);
        }

    }
}
