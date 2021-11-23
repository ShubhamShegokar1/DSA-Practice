import java.util.Scanner;

public class EasyButRecursion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int j=0;j<test;j++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ans=0;
            int ans=find(n-1, arr);
            System.out.println(ans);
        }
    }

    static int ans=0;
    private static int find(int n, int arr[]) {
        ans+=arr[n];
        if(n==0) {
            return ans;
        }
        return find(n-1,arr);
    }
}
