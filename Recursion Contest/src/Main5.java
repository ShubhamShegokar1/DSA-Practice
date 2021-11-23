import java.util.Scanner;

public class Main5
{

    static void find(int i,int j ,int n)
    {
      if(n==0)
      {
          bool[i][j]=true;
          return;
      }
        if(i-1>=1 && j-2>=1)
        {
            find( i-1, j-2,n-1); //2 1
        }
         if(i-2>=1 && j-1>=1)
        {
            find( i-2, j-1, n-1);
        }

        if(i+1<=10 && j-2>=1)
        {
            find( i+1, j-2, n-1);
        }
        if(i+2<=10 && j-1>=1)
        {
            find( i+2, j-1, n-1);
        }


        if(i+2<=10 && j+1<=10)
        {
            find( i+2, j+1, n-1);
        }
        if(i+1<=10 && j+2<=10)
        {
            find( i+1, j+2, n-1);
        }


        if(i-2>=1 && j+1<=10)
        {
            find( i-2, j+1, n-1);
        }
         if(i-1>=1 && j+2<=10)
        {
            find( i-1, j+2, n-1);
        }






    }
    static  boolean[][] bool= new boolean[11][11];

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int cnt=0;
        find(i,j,k);
        for(int one=0;one<=10;one++)
        {
            for(int two=0;two<=10;two++)
            {
                if(bool[one][two])
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
