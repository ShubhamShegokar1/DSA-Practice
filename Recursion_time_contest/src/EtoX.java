import java.util.Scanner;

public class EtoX
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextInt();
        int n=sc.nextInt();
        double cnt=1;
        System.out.format("%.4f",find(x,n,cnt));
    }
    private static double find(double x,int n, double cnt) {
        if(n==0) {
            return 1;
        }
        double ans=fact(cnt);
        return  (1/ans)* Math.pow(x, cnt)+find(x,n-1,cnt+1);
    }
    //-------------------------------
    private static double fact(double cnt){
        if(cnt==0){
            return 1;
        }
        return cnt* fact(cnt-1);
    }
}

