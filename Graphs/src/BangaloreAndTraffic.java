

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
	static boolean[] visited = new boolean[10009];
	static LinkedList<Integer> q = new LinkedList<Integer>();
	static int[] level = new int[10009];
	static int target;
	public int printGraph(int src) 
	{
		q.add(src);
		visited[src]=true;
		while (q.size()!=0) 
		{
			visited[q.peek()] = true;
			int current=q.remove();
			if (list[current].size() > 0) 
			{
				for (int j = 0; j < list[current].size(); j++) 
				{
					int temp=list[current].get(j);
					if(visited[temp]!=true) 
					{
						q.add(temp);
						visited[temp]=true;
						level[temp]=level[current]+1;
					}
				}
			}
		}
		
		return level[target];
	}

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		for (int l = 0; l < test; l++) 
		{
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			target = Integer.parseInt(st1.nextToken());
			int edges = Integer.parseInt(st1.nextToken());
			
			BangaloreAndTraffic graph = new BangaloreAndTraffic(target + 1);
			int src = Integer.MAX_VALUE;
			int max = 0;
			for (int i = 0; i < edges; i++) 
			{
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st2.nextToken());
				int b = Integer.parseInt(st2.nextToken());
				
				if (a < src) {
					src = a;
				}
				if (b < src) {
					src = b;
				}
				if (a > max) {
					max = a;
				}
				if (b > max) {
					max = b;
				}
				graph.addEdge(a, b);
			}
			for (int j = 0; j <= max; j++) 
			{
				visited[j] = false;
				level[j] = 0;
			}
			int ans = graph.printGraph(src);
			System.out.println(ans);
		}
	}
}