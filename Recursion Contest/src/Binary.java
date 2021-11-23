import java.util.Scanner;
public class Binary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int j=0;j<test;j++) {
            long n=sc.nextInt();
            System.out.println( find(n));
        }
    }
    private static long find(long n) {
        if(n==0){
            return 0;
        }
        return n%2+10 * find(n/2);
    }
}
