import java.util.Scanner;
class Mul2D
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int row=sc.nextInt();
    int column=sc.nextInt();
    int n=sc.nextInt();
    int arr[][]=new int[row][column];
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<column;j++)
    	{
         	arr[i][j]=sc.nextInt();
    	}
    }
    
    
    // for row------------
    int rowcount=0;
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j+2<column;j++)
    	{
    		if(arr[i][j]*arr[i][j+1]*arr[i][j+2]==n)
    		{
    			rowcount++;
    		}
    	}
    }
    // System.out.println(rowcount);
    //column -------------------
    
    int colcount=0;
    for(int i=0;i+2<row;i++)
    {
    	for(int j=0;j<column;j++)
    	{
    		if(arr[i][j]*arr[i+1][j]*arr[i+2][j]==n)
    		{
    			colcount++;
    		}
    	}
    }
  //System.out.println(colcount);
    
    int diacount=0;
    int diacount1=0;
    for(int i=0;i+2<row;i++)
    {
    	for(int j=0;j+2<column;j++)
    	{
    		if(arr[i][j]*arr[i+1][j+1]*arr[i+2][j+2]==n)
    		{
    			diacount++;
    		}
    	}
    }
    //System.out.println(diacount);

	for (int i = 0; i<row-2; i++)
    {
    	for(int j=column-1;j-2 >=0 ;j--)
    	{
    		if(arr[i][j]*arr[i+1][j-1]*arr[i+2][j-2]==n)
    		{
    			diacount1++;
    		}
    	}
    }
  
  // System.out.println(diacount1);
 System.out.println(diacount+rowcount+colcount+diacount1);
  	
   
  }
}

