import java.util.Scanner;
public class Kazama_Shinchan
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]= new int[n];
            for (int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
            }
        int target=sc.nextInt();
        int left=0;
        int right=n-1;
        boolean flag=true;
        int mid=0;
        while(left<=right )
        {
            mid=(left+right)/2;
            if(arr[mid]>target)
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
                System.out.println(mid);
                break;
            }

        }
        if(flag==true )
        {
            System.out.println(left);
        }
    }
}
//7
//1 4 6 9 11 15 33
//5