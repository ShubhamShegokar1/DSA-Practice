import java.util.Scanner;

public class Everything_related_to_BS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int l=0;l<n;l++)
        {
            arr[l]=sc.nextInt();
        }
        int target=sc.nextInt();

        int left=0;
        int right=n-1;
        boolean b= false;
        int lowerBound=0;
        int upperBound=0;
        int count=1;
        while(left<=right && b==false)
        {
           int mid=(left+right)/2;
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
                b=true;
                int mid1=mid;
                while(mid>0  && arr[mid]==arr[mid-1])
                {
                    mid--;
                    count++;
                }
                lowerBound=mid;
                while(mid1<n  && arr[mid1]==arr[mid1+1])
                {
                    mid1++;
                    count++;
                }
                upperBound=mid1;
            }
            //System.out.println(upperBound);
        }
        if(b==true)
        System.out.println(lowerBound+" "+upperBound+" "+count);
        else
        System.out.println(-1+" "+-1+" "+0);
    }
}
