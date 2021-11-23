import java.util.Scanner;

public class Point_one
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests= sc.nextInt();
        for(int l=0;l<tests;l++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            boolean b=true;
            for (int i = 0; i < n ;i++)
            {
                arr[i] = sc.nextInt();
            }
            //1
            //4
            //0 0 0 1

            int left=0;
            int right=n-1;
            while(left<=right && b==true)
            {
                int mid=(left+right)/2;
                if(arr[mid]<1)
                {
                  left=mid;
                }
                if(arr[mid]==1)
                {
                    b=false;
                    while(mid>0 && arr[mid]==arr[mid-1])
                    {
                      mid--;
                    }
                    System.out.println(mid);
                    break;
                }

                if(mid<n-1 && arr[mid+1]==1)
                {
                    b=false;
                    System.out.println(mid+1);
                    break;
                }

            }

            if(b==true)
            {
                System.out.println(-1);
            }
        }


    }
}
