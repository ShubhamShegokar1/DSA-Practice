import java.util.Scanner;

public class BattleOfOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long evenCount=0;
        long oddCount=0;
		for(int i=0;i<n;i++)
		{
			int temp=sc.nextInt();
			if(temp%2==0) {
				evenCount+=temp;
			}
			else {
				oddCount+=temp;
			}
		}

		if(evenCount>oddCount) {
			System.out.println("Even");
		}else if(oddCount>evenCount) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}

}
