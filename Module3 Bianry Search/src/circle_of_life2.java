import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class circle_of_life2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int q=0;q<test;q++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n * 2];
            for (int i = 0; i < n * 2; i++)
            {
                arr[i] = sc.nextInt();
            }
            ArrayList <Float> list = new ArrayList<>();
            int k = sc.nextInt();
            int i=0;
            while(i<2*n-1)
            {

                float total=  (arr[i]*arr[i]+arr[i+1]*arr[i+1]);

                DecimalFormat formatter = new DecimalFormat("#.#####");
                formatter.setRoundingMode(RoundingMode.CEILING);
               // total=formatter.format(total);
                System.out.print(formatter.format(total)+" ");
                total= (float) Math.sqrt(total);

                list.add(total);
                i=i+2;
            }
            System.out.println(list);
            float ans=list.get(k-1);
           // DecimalFormat formatter = new DecimalFormat("#.####");
            //System.out.println(formatter.format(ans));
            System.out.println(ans);


        }
    }
}