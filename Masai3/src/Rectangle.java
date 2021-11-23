import java.util.*;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int l = 0; l < t; l++) 
		{

			int len=sc.nextInt();
			int b=sc.nextInt();
			System.out.print(len*b+" "+2*(len+b));
			System.out.println();
		}

	}

}
