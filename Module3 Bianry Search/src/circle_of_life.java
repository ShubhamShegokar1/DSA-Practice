import java.text.DecimalFormat;
import java.util.Scanner;
public class circle_of_life
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int q=0;q<test;q++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n*2];
            for (int i = 0; i < n*2; i++)
            {
                arr[i] = sc.nextInt();
            }
            int k=sc.nextInt();
            double left=0;
             String str="1000000000000";
             double right=Double.parseDouble(str);
            double mid=0;
            while(right-left>=0.00001)
            {
                mid=(left+right)/2;
                if(checkRadius(mid,n ,arr,k))
                {
                    right=mid;
                }
                else {
                    left=mid;
                }
            }
            DecimalFormat formatter = new DecimalFormat("#.0000");
            System.out.println(formatter.format(mid));
            //System.out.println(mid);
        }
    }

    private static double calculate(int a , int b)
    {
        double total=0;
        total=a*a+b*b;
        return total;
    }

    private static boolean checkRadius(double mid ,int n,int arr[],int k) {
        int count=0;
        for(int i=0;i<n*2-1;i=i+2)
        {
            if(calculate(arr[i],arr[i+1])<=mid *mid)
            {
                count++;
            }
        }
        if(count>=k)
            return true;
        else
            return false;
    }
}