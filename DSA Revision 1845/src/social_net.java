import java.util.Scanner;

public class social_net 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<13)
		{
			System.out.println("1 Kms");
		}
		else if(n<18)
		{
			System.out.println("5 Kms");
		}
		else if(n<30)
		{
			System.out.println("10 Kms");
		}
		else
		{
			System.out.println("You can have friends from anywhere");
		}
	}

}
