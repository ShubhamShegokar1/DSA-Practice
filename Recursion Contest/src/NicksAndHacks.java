import java.util.Scanner;
public class NicksAndHacks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            count=1;
            bool=false;
            int n=sc.nextInt();
            if(find(n))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    static int count=0;
    static boolean bool=false;
    private static boolean find(int n)
    {
        if(count==n){
          return true;
        }
        else if(count>n || n%2!=0 ) {
            return false;
        }
        else if(bool==false){
            count = count * 10 * 20;
        }
        else {
        count+= count * 10 * 20;
       }
        bool=true;

        //200
        System.out.println(count+" "+count/20);
        if(count==n || (count/10)==n || (count/20)==n){
            return true;
        }

        else if(count/10>n) {
            count=count/20;
        }

        if(count==n) {
            return true;
        }

        return find(n);
    }
}
