
import java.util.Scanner;
        import java.text.DecimalFormat;
public class BeyondFactorial
{
    static double sum (double n)
    {
        if (n == 1 || n==0)
            return 0;
        else
            return Math.log(n)+(sum(n - 1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextLong();
        double ans=sum(n);
        DecimalFormat formatt = new DecimalFormat("#.####");
        System.out.println(formatt.format(ans));
    }
}