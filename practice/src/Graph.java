import java.util.LinkedList;
import java.util.Scanner;

public class Graph 
{
	int vertex=0;
	LinkedList<Integer> list[];

	public Graph(int vertex) 
	{
		this.vertex=vertex;
		this.list=new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) 
		{
			list[i] = new LinkedList<>();
		}
	}

	public void addEdge(int src, int dest) {
		list[src].addFirst(dest);
		list[dest].addFirst(dest);
	}
	
	public void print() {
		for(int i=0;i<vertex;i++) 
		{
			int temp=list[i].size();
			if(temp>0) 
			{
				System.out.print(i+"  ");
				for(int j=0;j<temp;j++) {
					System.out.print(list[i].get(j)+" ");
				}
			}
			System.out.println();
		}
	}


	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Graph graph= new Graph(n+1);
		for(int i=0;i<m;i++) 
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph.addEdge(a, b);
		}
		graph.print();
	}
}
