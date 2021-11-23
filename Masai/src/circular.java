import java.util.Scanner;
class circular
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int T=sc.nextInt();
    for(int l=0;l<T;l++)
    {
    	
    	
    	
    int n =sc.nextInt();
    
    int [][]arr= new int[n][n];
    for(int i=0;i<n ;i++)
    {
    	for(int j=0;j<n;j++)
    	{
         arr[i][j]=sc.nextInt()	;
        }
    }
    if(n>1)
    {
    for(int i=n-1;i>=0 ;i--)
    {
    	   		System.out.print(arr[i][0]+" " );
    }
    for(int i=1;i<n-1 ;i++)
    {
    		System.out.print(arr[0][i]+" " );	
    }
    for(int i=0;i<n ;i++)
    {
    		System.out.print(arr[i][n-1]+" " );	
    }
    for(int i=n-2;i>0 ;i--)
    {
    	    
    		System.out.print(arr[n-1][i]+" " );	
    }

    System.out.println();
    }
    
    else
    {
    	System.out.println(arr[0][0]);
    }
    
    
    }
  }
}

/*
 
17 22 6 7 1 9 13 12 1 12 7 2 7 14 2 4
1 8 2 23 11 18 4 13 12 8 15 1 3 1 6 14
23 13 19 11 11 24 13 7 8 22 10 13 5 5 24 4
2 2 6 6 18 1 23 11 15 4 14 17 15 7 13 10
12 14 15 2 17 12 14 4 8 17 6 24 24 6 1 19
12 8 12 18 7 23 22 20 19 11 16 20 17 18 16 16
11 7 8 1 22 2 11 23 19 24 16 8 11 15 14 20
10 8 8 16 13 2 10 5 6 7 17 13 6 5 10 10
2 3 8 3 6 5 17 19 21 7 10 7 11 10 22 4
18 21 14 11 8 3 10 11 10 13 5 9 9 13 15 21
3 6 13 12 13 10 3 6 12 18 9 20 11 12 3 24
2 2 6 6 18 1 23 11 15 4 14 17 15 7 13 10
12 14 15 2 17 12 14 4 8 17 6 24 24 6 1 19
12 8 12 18 7 23 22 20 19 11 16 20 17 18 16 16
17 22 6 7 1 9 13 12 1 12 7 2 7 14 2 4
1 8 2 23 11 18 4 13 12 8 15 1 3 1 6 14
*/









