import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CollegeEventAndTheCR {
	int vertex;
	LinkedList<Integer> list[];
	public CollegeEventAndTheCR(int vertex) 
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
		 list[destination].addFirst(source);
	}

	static int components=0;
	static ArrayList <Boolean> visited= new ArrayList<>();
	public int printGraph() 
	{
		for (int i = 0; i <visited.size(); i++) 
		{		
			if(visited.get(i)==false) 
			{
		    components++;
			solve(i);
 			}
		}
		return components;
	}


	private void solve(int i) 
	{
		if(visited.get(i)==true) {
			return;
		}
		visited.set(i, true);
		if (list[i].size() > 0) 
		{
			 for (int j = 0; j < list[i].size(); j++)
			 {
				 int temp=list[i].get(j);
				 if(visited.get(temp));
				 solve(temp);
			 }
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++)
		{
			int students = sc.nextInt();
			int edges = sc.nextInt();
			visited.clear();
			components=0;
            for(int i=0;i<students;i++) {
            	visited.add(false);
            }
			CollegeEventAndTheCR graph = new CollegeEventAndTheCR(students);
			for (int i = 0; i < edges; i++) 
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				graph.addEdge(a, b);
			}
			int ans=graph.printGraph();
			System.out.println(ans);
		}
	}
}