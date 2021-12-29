import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StrangeAndPossibilities {
	static ArrayList <List<Integer>> subsets= new ArrayList<>();
    static int n;
	public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      n= sc.nextInt();
      ArrayList <Integer> list= new ArrayList<>();
      for(int i=1;i<=n;i++) {
    	  list.add(i);
      }      
      solve(list,new ArrayList<>(),0 );
  	Collections.sort(subsets, (o1, o2) -> 
	{
        int k = Math.min(o1.size(), o2.size());
        for (int i = 0; i < k; i++) 
        {
            if (o1.get(i) == o2.get(i))
            {
                continue;
            }
            else
            {
                return o1.get(i) - o2.get(i);
            }
        }
        return 1;
    });
   
   
	for (int i = 0; i < subsets.size(); i++) {
			for (int j = 0; j < subsets.get(i).size(); j++) {
				System.out.print(subsets.get(i).get(j) + " ");
			}
			System.out.println();
		}
 	}

	private static void solve(ArrayList<Integer> list,List<Integer> arrayList, int i) {
		if(i==list.size()) {
		  subsets.add(arrayList);
		  return;
		}
		
		solve(list ,new ArrayList<>(arrayList), i+1);
		arrayList.add(list.get(i));
		solve(list ,new ArrayList<>(arrayList), i+1);
	}
}
