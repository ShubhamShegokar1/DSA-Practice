import java.util.ArrayList;
import java.util.Scanner;
public class Main2 
{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();      
    	  }
      ArrayList<Integer> list= new ArrayList<>();
       System.out.println( find(arr,0,list));
	}
  static int count=0;
	private static int find(int[] arr,int i, ArrayList <Integer> list) 
	{
		if(i==arr.length) 
		{
			if(list.size()>0) 
			{
				int check=0;
				  for(int j=0;j<list.size();j++)  
				  {
					  check+=list.get(j);
				  }
				  
				  if(check%2!=0) {
					 count++;
				  }
			}
		}
		else {
			find(arr,i+1,list);
			list.add(arr[i]);
			find(arr,i+1,list);
            list.remove(list.size()-1); 
		}
		return count;
	}
}
