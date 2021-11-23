import java.util.Scanner;

public class Boats
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double limit=sc.nextInt();
            double arr[] = new double[n];
            for (int i = 0; i < n ;i++)
            {
                arr[i] = sc.nextInt();
            }
           int boat=0;
            int i=0;
           while(i<n)
           {
               int total=0;
               int cnt =0;
               while(total<limit && cnt<2 && i<n)
               {
                   total+=arr[i];
                   i++;
                   cnt++;
               }
               if(total>limit)
               {
                   i--;
               }
               boat++;
           }
        System.out.println(boat);
    }
}
