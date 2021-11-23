import java.util.Scanner;

public class countTriplets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         int ok=sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         int count=0;
        int i=0;
        while(i<n-2)
        {
            boolean b=false;
            for(int j=i+1;j<n-1 && b==false;j++)
            {
              int left=j+1;
              int right=n-1;
              int k=0;
              while (b==false && k<n && left<=right)
              {
                   k=(left+right)/2;
                  if(arr[k]-arr[i]<=ok)
                  {
                      left=k+1;
                  }
                  else
                  {
                      b=true;
                      while(k-1>=0 && arr[k]==arr[k-1])
                      {
                          k--;
                      }
                      count+=k;
                  }

              }
            }
            i++;
        }
        System.out.println(count);
    }
}
