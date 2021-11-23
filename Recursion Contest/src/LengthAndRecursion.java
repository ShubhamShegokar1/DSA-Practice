import java.util.Scanner;

public class LengthAndRecursion
{
    static int find(String str)
    {
       if(str.equals(""))
       {
           return 0;
       }
        return find(str.substring(1))+1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int ans=find(str);
        System.out.println(ans);
    }
}
