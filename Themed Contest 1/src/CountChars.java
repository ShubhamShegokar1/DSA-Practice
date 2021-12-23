import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt=1;
		for (int i = 1; i < str.length(); i++) 
		{
			 if(str.charAt(i)==str.charAt(i-1)) {
				 cnt++;
			 }else {
				 System.out.print(str.charAt(i-1)+""+cnt);
				 cnt=1;
			 }
		}
		System.out.println(str.charAt(str.length()-1)+""+cnt);
		
	}
}
