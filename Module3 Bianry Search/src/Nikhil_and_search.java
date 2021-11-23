import java.util.Arrays;
import java.util.Scanner;


public class Nikhil_and_search
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            double arr[] = new double[n];
            for (int i = 0; i < n ;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int queries =sc.nextInt();
            for(int i=0;i<queries;i++)
            {
                int left=0;
                int right=n-1;
                int mid=0;
                int input=sc.nextInt();
                if(input==0)
                {
                    boolean flag=false;
                    int target=sc.nextInt();
                    //1s---------------------------------------------
                    while(left<=right)
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
                            while(mid-1>=0 && arr[mid]==arr[mid-1])
                            {
                                mid--;
                            }
                            flag=true;
                            System.out.println(n-mid);
                            break;
                        }
                    }
                    if(flag==false)
                        System.out.println(n-left);
                }
                //2d-----------------------------------------------
                else
                {
                    boolean flag=false;
                    int target=sc.nextInt();
                    while(left<=right)
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
                            while(mid+1<n && arr[mid]==arr[mid+1])
                            {
                                mid++;
                            }
                            flag=true;
                            System.out.println(n-(mid+1));
                            break;
                        }
                    }
                    if(flag==false)
                        System.out.println(n-(left));
                }
                //2nd--------------------------------------
            }
        }
    }

// 1 2 3  5 5 5 5 5 5 6