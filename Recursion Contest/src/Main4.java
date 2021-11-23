import java.util.Scanner;

public class Main4
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=find(n);
        System.out.println(count);
    }

    private static int find(int n)
    {
      if(n==0 || n==1)
      {
          return 1;
      }
      else if (n == 2)
          return 2;
      else
          return find(n-3)+find(n-2)+find(n-1);
    }
}
