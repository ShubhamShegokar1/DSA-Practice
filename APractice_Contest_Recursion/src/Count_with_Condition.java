import java.util.ArrayList;
import java.util.Scanner;

public class Count_with_Condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<Integer> path = new ArrayList<>();
		int check = 0;
		boolean b = find(arr, 0, path, target, 0);
		if (b == false)
			System.out.println("no");
		else
			System.out.println("yes");


	}
    static boolean bb=false;
	private static boolean find(int[] arr, int i, ArrayList<Integer> path, int target, int check) {
		
	
		if (i == arr.length) {
			if (path.size() > 0) {
				for (int j = 0; j < path.size(); j++) {
					// System.out.print(path.get(j)+" ");
					check += path.get(j);
				}
			}
			if (check == target) {
				//System.out.println("yes1");
				return bb=true;
			}
		} else {
			check = 0;
			find(arr, i + 1, path, target, check);
			path.add(arr[i]);
			find(arr, i + 1, path, target, check);
			path.remove(path.size() - 1);
		}
		return bb;
	}

}