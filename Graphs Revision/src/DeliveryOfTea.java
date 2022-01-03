import java.awt.PrintGraphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;import javax.swing.LookAndFeel;

public class DeliveryOfTea {
	
	static int vertex; 
	static LinkedList<Integer> list[];
	public DeliveryOfTea (int vertex)
	{
		this.vertex=vertex;
		list=new LinkedList[vertex];
		for(int i=0;i<vertex;i++) {
			list[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination) {
		 list[source].addFirst(destination);
		 list[destination].addFirst(source);
	}
	
	static int minTime=Integer.MAX_VALUE;
	static int n=0;
	static ArrayList<Boolean> visited = new ArrayList<>();
    public static int loopGraph() 
    {
    	for(int i=0;i<n;i++) 
    	{
    		ans=0;
    		if(visited.get(i)==false) 
    		{
    			int ans=solve(i);
    			if(ans<minTime) {
    				minTime=ans;
    			}
    		}
    	}
    	return minTime;
    }
	
	static int ans=0;
	private static int solve(int i) {
		if(visited.get(i)==true){
			return 0;
		}
	   visited.set(i, true);

		if (list[i].size() > 0) 
		{
			 for (int j = 0; j < list[i].size(); j++)
			 {
				 int temp=list[i].get(j);
				 
				 solve(temp);
			 }
		}
		return ans;
	}
	


	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int l=0;l<test;l++) 
        {
            n=sc.nextInt();
        	DeliveryOfTea graph = new DeliveryOfTea(n);
        	visited.clear();
        	ans=0;
            for(int i=0;i<n;i++) {
            	visited.add(false);
            }
        	for(int i=0;i<n-1;i++)
        	{
        		int a=sc.nextInt();
        		int b=sc.nextInt();
				graph.addEdge(a, b);
        	}
        	
        	System.out.println(loopGraph());
        	
        }
	}

}
