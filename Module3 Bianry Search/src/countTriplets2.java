import java.util.Scanner;

public class countTriplets2
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
              for(int k=j+1;k<n && b==false;k++)
              {
                  if(arr[k]-arr[i]<=ok)
                  {
                      count++;
                  }
                  else
                  {

                  }
              }
            }
            i++;
        }
        System.out.println(count);
    }
}
