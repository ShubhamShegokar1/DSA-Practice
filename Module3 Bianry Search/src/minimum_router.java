import java.util.Scanner;


public class minimum_router
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]= new int[n];
            int rounters=sc.nextInt();
            int right=0;

            for (int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
               right=arr[i];
            }
            int left=0;
            while(left<=right)
            {
                int mid=left+right/2;
            }
    }
}
