import java.util.Scanner;
class matrix_transversal

{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int T=sc.nextInt();
    for(int l=0;l<T ;l++)
    {
  //-----------------------------------  	
  
    int row=sc.nextInt();
    int column=sc.nextInt();
    int max=0;
    if(row<column)
    {
    	 max=column;
    }
    else
    {
    	max =row;
    }
    
    int q=sc.nextInt();
    int [][]arr= new int[row][column];
    for(int i=0;i<row ;i++)
    {
    	for(int j=0;j<column;j++)
    	{
         arr[i][j]=sc.nextInt()	;
        }
    }
 
    if(row!=1 && column!=1)
    {
    if(q==1)
    {
    	for (int i = 0; i < row; i++) 
    	{
          if (i % 2 == 0) 
    		{                
    			for (int j = 0; j < column; j++) 
    			{
    				
    				System.out.print(arr[i][j]+" ");    			
    				
    			}
    		}

    		else 
    		{
    			for (int j = column-1; j >= 0; j--) 
    			{
    				
    				System.out.print(arr[i][j]+" ");    
    				
    			}
    		}

    	}

 	}
    
    
    ///------------------------------------------------------------
    else
    {
    
    	for (int i = 0; i < row; i++) 
    	{

    		if (i % 2 == 0) 
    		{                   
    			for (int j = column-1; j >= 0; j--) 
    			{
    				
    				System.out.print(arr[i][j]+" ");
    				
    			}
    		}

    		else 
    		{
    			for (int j = 0; j < column; j++) 
    			{
    				
    				System.out.print(arr[i][j]+" ");    			
    				
    			}
    		}

    	}

    }
    
    }
    else
    {
    	System.out.println(arr[0][0]);
    }
    System.out.println();

    }
  }
}

