import java.util.Scanner;
public class Main1
{
    static int cnt=0,n1=0,n2=1,n3=0;
    static void fibb(int n)
    {
        if(n>0)
        {
            n3=n2+n1;
            n1=n2;
            n2=n3;
            if(n==1)
            {
                System.out.println(n3);
            }
            fibb(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        fibb(n-1);

    }
}