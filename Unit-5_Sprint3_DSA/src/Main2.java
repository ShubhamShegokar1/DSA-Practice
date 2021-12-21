import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++) {
			int n=sc.nextInt();
			ArrayList<String> list = new ArrayList<>();
			solve(list,n,n, new StringBuilder());
			for(int j=0;j<list.size();j++) {
				System.out.println(list.get(j));
			}
		}
	}

	private static void solve(ArrayList<String> list, int left, int right, StringBuilder stringBuilder) {
		if(right==0) {
			list.add(stringBuilder.toString());
			return;
		}
		if(left>0) {
			solve(list, left-1, right, stringBuilder.append("("));
			stringBuilder.deleteCharAt(stringBuilder.length()-1);
		}
		if(left<right) {
			solve(list, left, right-1, stringBuilder.append(")"));
			stringBuilder.deleteCharAt(stringBuilder.length()-1);
		}
	}
   
}
