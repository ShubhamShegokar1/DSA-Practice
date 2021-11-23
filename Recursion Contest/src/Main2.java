import java.util.Scanner;
public class Main2
{
    public static int sumWithRecursion(int cnt,int n, int arr[])
    {
        if(n==0)
        {
            return cnt;
        }
     int add=arr[n]-arr[n-1];
     if(add<0)
     {
         add=add*-1;
     }
     cnt+=add;
     n--;

     return  sumWithRecursion(cnt,n,arr);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int test =sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int cnt=0;
            int n=sc.nextInt();
            int arr[]= new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }

           int ans=sumWithRecursion(cnt, n-1,arr);
            System.out.println(ans);
        }
    }
}
