import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	int vertex;
	LinkedList<Integer> list[];

	public Graph(int vertex) {
		this.vertex = vertex;
		list = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			list[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {

		// add edge
		list[source].addFirst(destination);

//		// add back edge ((for undirected)
 //list[destination].addFirst(source);
	}

	public void printGraph() {
		for (int i = 0; i < vertex; i++) {
			if (list[i].size() > 0) {
				System.out.print("Vertex " + i + " is connected to: ");
				for (int j = 0; j < list[i].size(); j++) {
					System.out.print(list[i].get(j) + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Graph graph = new Graph(N+1);
		for (int i = 0; i < M; i++) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.addEdge(a, b);
		}
		graph.printGraph();
	}
}