import java.util.Scanner;

public class EtoPowerX
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       int n=sc.nextInt();
       int ans=go(x,n);
       ans=x+1;
        System.out.println(ans);
    }

    static  int count=0;
    private static int go(int x, int n)
    {
      if(n==0) {
          return count;
      }
       int fac=fact(n);
      count+=(1/fac)*(x^n);
     //   System.out.println(fac);
 return go(n-1,x);
    }

    private static int fact(int n)
    {
        if(n>0)
        {
           return fact(n-1)*n;
        }
        else
            return 1;
    }
}
