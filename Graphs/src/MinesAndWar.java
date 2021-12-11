import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MinesAndWar {
	int vertex;
	LinkedList<Integer> list[];

	public MinesAndWar(int vertex) 
	{
		this.vertex = vertex;
		list = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) 
		{
			list[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		 list[source].addFirst(destination);
	}

	static boolean []arr= new boolean[401];
	static int maxDamage=0;
	static int bombNo=0;
	static int N;
	static int cnt;
	public void printGraph() {
		for (int i = 0; i <N+1; i++) 
		{
			for (int j = 0; j < 400; j++) 
			{
				arr[j] = false;
			}
			cnt=0;
			solve(i);
			if (maxDamage < cnt) 
			{
				maxDamage = cnt;
			}
		}
		System.out.println(maxDamage);
	}


	private void solve(int i) {
		if(arr[i]==true) {
			return ;
		}
		cnt++;
	    arr[i]=true;
		if (list[i].size() > 0) 
		{
			 for (int j = 0; j < list[i].size(); j++)
			 {
			  	  int temp=list[i].get(j);			
				 solve(temp);
			 }
		}
	}

	public static void main(String[] args) {
	     	Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			int M = sc.nextInt();
 
			MinesAndWar graph = new MinesAndWar(N+1);
			for (int i = 0; i < M; i++) 
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				graph.addEdge(a, b);
			}
			graph.printGraph();
		}
}