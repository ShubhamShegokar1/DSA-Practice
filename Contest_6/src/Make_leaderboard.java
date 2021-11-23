import java.util.*;
public class Make_leaderboard
{	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int no=Integer.parseInt(sc.nextLine());
		String line[]= new String[no];
		int arr[]= new int[no];

	    for (int x = 0; x < no; x++) 
	    {
	        String InputValue = sc.nextLine();
	        String[] Value = InputValue.split(" ");
	        line[x] = Value[0];
	        arr[x] = Integer.parseInt(Value[1]);
	    }
	    
	    for (int i = 0; i < arr.length; i++)   
	    {  
	    	for (int j = i + 1; j < arr.length; j++)   
	    	{  
	    		int tmp = 0;  
	    		String temp1="";
	    		if (arr[i] < arr[j])   
	    		{  
	    			tmp = arr[i];  
	    			arr[i] = arr[j];  
	    			arr[j] = tmp;  
	    			
	    			temp1 = line[i];  
	    			line[i] = line[j];  
	    			line[j] = temp1;  
	    		}  
	    	}
	    	//System.out.println(arr[i]);
	    } 
	    int i=0;
	    int j=1;
	   
	    while(i<no-1)
	    {
	    
	    	if(arr[i]==arr[i+1])
	    	{
	    		if(line[i].charAt(i)>line[i+1].charAt(i))
	    		{
	    			String temp;
	    			temp=line[i];
	    			line[i]=line[i+1];
	    			line[i+1]=temp;
	    		}
	    	System.out.println(j+" "+line[i]);
	    	System.out.println(j+" "+line[i+1]);
	    	
	    	j=j+2;
	    	i=i+2;
	    	}
	    	else if(i<no-2)
	    	{
	    		System.out.println(j+" "+line[i]);
	    		i++;
		    	j++;
	    	}
	    	else
	    	{
	    		System.out.println(j+" "+line[i]);
	    		j++;
	    		i++;
	    	}
	    	
	    	
	    }
	    System.out.println((j)+" "+line[no-1]);
	    System.out.println();
    }
}