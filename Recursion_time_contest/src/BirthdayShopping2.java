import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BirthdayShopping2 {
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int k=sc.nextInt();
			List<List<Integer>> bigList=new ArrayList();
			subsets(1,n,new ArrayList(),bigList,k);
			for(int i=0;i<bigList.size();i++) {
				System.out.println(bigList.get(i));
			}
		}

		private static void subsets(int start, int n, List<Integer> arrayList, List<List<Integer>> bigList, int k) 
		{
			 
         if(arrayList.size()==k) {
        	bigList.add(new ArrayList(arrayList)); 
        	return;
         }
         
         
		for(int i=start;i<=n;i++) 
		{
		  arrayList.add(i);
		  subsets(start+1, n, arrayList, bigList, k);
		  arrayList.remove(arrayList.size()-1);
		 }
		}
	}

