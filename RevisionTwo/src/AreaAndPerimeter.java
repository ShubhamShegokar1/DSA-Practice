import java.util.Scanner;

public class AreaAndPerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int len = sc.nextInt();
			int bre = sc.nextInt();
            System.out.println(len*bre +" "+2*(len+bre));
		}
	}
}
