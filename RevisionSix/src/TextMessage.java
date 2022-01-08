import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TextMessage {
	int vertex;
	LinkedList<Integer> list[];

	public TextMessage(int vertex) {
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
	public static void main(String[] args) throws IOException 
	{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   StringTokenizer st= new StringTokenizer(br.readLine());
	       int n=Integer.parseInt( st.nextToken());
	       int times=Integer.parseInt( st.nextToken());
	       TextMessage graph = new TextMessage(n+1);
	       for(int l=0;l<times;l++)
	       {
			   StringTokenizer st1= new StringTokenizer(br.readLine());
		       int a=Integer.parseInt( st1.nextToken());
		       int b=Integer.parseInt( st1.nextToken());
		       graph.addEdge(a, b);
	       }
	      System.out.println( graph.printGraph(1,n));
	  }
    static LinkedList<Integer> q= new LinkedList<>();
    static int visited[]= new int[1000001];
    static int level[]= new int[1000001];
	private  int printGraph(int src,int target) 
	{
		q.add(src);
		visited[src]=1;
		while(!q.isEmpty()) 
		{
			int temp=q.peek();
			visited[temp]=1;
			q.remove();
			if(list[temp].size()>0) 
			{
				for(int i=0;i<list[temp].size();i++) 
				{
					int curr=list[temp].get(i);
					if(curr==target) {
						return level[temp]+1;
					}
					if(visited[curr]==0) {
						q.add(curr);
						visited[curr]=1;
						level[curr]=level[temp]+1;
					}
				}
			}
		}
		return -1;
	}
}
