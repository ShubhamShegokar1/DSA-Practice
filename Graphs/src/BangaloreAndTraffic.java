
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BangaloreAndTraffic {
	int vertex;
	LinkedList<Integer> list[];

	public BangaloreAndTraffic(int vertex) {
		this.vertex = vertex;
		list = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			list[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		list[source].addFirst(destination);
		list[destination].addFirst(source);
	}

	public int printGraph(int src, int target, ArrayList<Boolean> visited, LinkedList<Integer> q, ArrayList<Integer> level) 
	{
		q.add(src);
		visited.set(src, true);
		while (q.size()!=0) 
		{
			int current=q.poll();
			if (list[current].size() > 0) 
			{
				for (int j = 0; j < list[current].size(); j++) 
				{
					int temp=list[current].get(j);
					if(visited.get(temp)!=true) 
					{
						q.add(temp);
						visited.set(temp, true);
						level.set(temp, level.get(current)+1);
					}
				}
			}
		}
		
		return level.get(target);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
        for(int l=0;l<test;l++) 
        {
        	ArrayList<Boolean> visited = new ArrayList<>();
    		LinkedList<Integer> q = new LinkedList<Integer>();
           ArrayList<Integer> level = new ArrayList<>();	
		int target = sc.nextInt();
		int edges = sc.nextInt();
		visited.clear();
		level.clear();
		for (int i = 0; i <= target; i++) 
		{
			visited.add(false);
			level.add(0);
		}
		BangaloreAndTraffic graph = new BangaloreAndTraffic(target+1);
		int src=Integer.MAX_VALUE;
		for (int i = 0; i < edges; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a<src) {
				src=a;
			}
			if(b<src) {
				src=b;
			}
			graph.addEdge(a, b);
		}
		int ans=graph.printGraph(src,target,visited,q,level);
		System.out.println(ans);
        }
	}
}