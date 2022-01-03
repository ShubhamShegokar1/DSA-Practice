import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++) 
		{	
          int n=sc.nextInt();
          int arr[]= new int[n];
          int ans[]=new int[n];
          for(int i=0;i<n;i++) {
        	  arr[i]=sc.nextInt();
          }
          Stack <Integer> stk= new Stack();
          int i=0;
          for(int z=0;z<n;z++)
          {
        	while(!stk.isEmpty() && arr[stk.peek()]<arr[z]){
        		ans[stk.peek()]=arr[z];
        		stk.pop();
        	}
        	  
        	  stk.push(z);
          }
          
          for(int j=0;j<n;j++) {
        	  if(ans[j]==0) {
        		  System.out.print(-1+" ");
        	  }else
        	  System.out.print(ans[j]+" ");
          }
          System.out.println();
		}
	}

}
