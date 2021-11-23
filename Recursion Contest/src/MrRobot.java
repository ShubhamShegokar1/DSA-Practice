import java.text.DecimalFormat;
import java.util.Scanner;

public class MrRobot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int j=0;j<test;j++){
            int size=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            find(size,str);
        }
    }
    private static void find(int size, String str) {

        int mid=str.length()/2;
        System.out.println(str.charAt(mid));
    }
}