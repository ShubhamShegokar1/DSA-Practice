
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ManageForumMallParking 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList <Integer> list = new ArrayList<>();
		int max=0;
	    while(sc.hasNext()) 
	    {
	    	list.add(sc.nextInt());
	    	if(max<list.get(list.size()-1)) {
	    		max=list.get(list.size()-1);
	    	}
	    }
	   // System.out.println(list);
	    int rows=list.size()/2;
	    int columns=max;
	    int arr[][]= new int[rows][columns];
	   
	    for(int i=0;i<list.size()/2;i++) 
	    {
           int start=list.get(i)-1;
           int end=list.get(i+rows)-1;
            int column=start;
         //  System.out.println(start+" "+ end);
	    	while(start<=end) 
	    	{
	    		arr[i][column]=1;
	    		start++;
	    		column++;
            }
	    	
	    }
	   // for(int i=0;i<rows;i++) {
	   // 	for(int j=0;j<columns;j++) {
	   // 		System.out.print(arr[i][j]+" ");
	   // 	}
	   // 	System.out.println();
	   // }
	   // System.out.println();
	    
	    boolean b=true;
	    // System.out.println(columns+" "+rows);
	    for(int i=0;i<columns;i++) 
	    {
	    	int cnt=0;
	    	for(int j=0;j<rows;j++) 
	    	{
	    		if(arr[j][i]==1) 
	    		{
	    			cnt++;
	    		}
	    	}
	    	if(cnt>k) 
	    	{
	    		b=false;
	    		//break;
	    	}
	    }
	    
	    if(b==true) {
	    	System.out.println("Possible");
	    }
	    else {
	    	System.out.println("Not Possible");
	    }
	    
	}
}
