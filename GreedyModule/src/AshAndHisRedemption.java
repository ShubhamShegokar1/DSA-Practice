import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AshAndHisRedemption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			ArrayList<Integer> ash = new ArrayList<>();
			ArrayList<Integer> gary = new ArrayList<>();

			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				ash.add(sc.nextInt());
			}
			for (int i = 0; i < n; i++) {
				gary.add(sc.nextInt());
			}

			Collections.sort(ash);
			Collections.sort(gary);
			int i = 0;
			boolean b = false;
			while (i < n) 
			{
				if (gary.get(i) >= ash.get(i)) 
				{
					b = true;
					break;
				}
				i++;
			}
			if (b == false)
				System.out.println("Ash Finally Wins");
			else
				System.out.println("Train Hard Again");
		}
	}
}
