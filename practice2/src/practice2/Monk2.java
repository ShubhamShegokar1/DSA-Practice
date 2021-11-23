package practice2;
import java.util.*;


public class Monk2
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        char[] a = sc.next().toCharArray();
        sc.close();
        for(int i=0;i<N;i++)
        {
            char s1=a[i];
            char s2=a[i+1];
            if(s1<s2)
            {
                System.out.println("Millionaire");
            }
        }
    }
}
