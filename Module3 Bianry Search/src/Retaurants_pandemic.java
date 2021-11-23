import java.util.Arrays;
import java.util.Scanner;

public class Retaurants_pandemic
{
    public static void main(String[] args)
    {
           Scanner sc = new Scanner(System.in);
           int test=sc.nextInt();
           for(int l=0;l<test;l++)
           {
               int n = sc.nextInt();
               int target = sc.nextInt();
               int arr[] = new int[n];
               for (int i = 0; i < n; i++)
               {
                 arr[i]=sc.nextInt();
               }
               Arrays.sort(arr);
               int left=1;
               int right=1000000000;
               int ans=0;
               while(left<=right )
               {
                   int mid = (left + right) / 2;
                   int count = 1;
                   int position = 0;

                   for(int i=1;i<n && count<target;i++)
                   {
                          if(arr[i]-arr[position]>=mid)
                          {

                          }
                   }
               }
               System.out.println(ans);
           }
    }
}
