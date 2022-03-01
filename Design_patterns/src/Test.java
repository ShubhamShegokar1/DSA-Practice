import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		return i2.compareTo(i1);
		
	}
}

public class Test {
	public static void main(String[] args) {
	    
		int disks[] = { 1,2};
		SolveTower(2,disks);
	}
	 static void SolveTower(int n, int[] arr){
	      
	      int max=n;
	      int index=0;
	      Queue <Integer> q= new PriorityQueue<Integer>(new MyComparator());
	      for(int i=0;i<n;i++)
	      {
	          q.add(arr[i]);
	         
	          while(!q.isEmpty() && q.peek()==max){
	              System.out.print(q.poll()+" ");
	              max--;
	          }
	          System.out.println();
	      }

}
	 }
