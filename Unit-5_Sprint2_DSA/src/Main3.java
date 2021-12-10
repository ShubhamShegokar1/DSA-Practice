import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++) 
		{
			int n=Integer.parseInt(sc.nextLine());
			String str=sc.nextLine();
			int eCount=0;
			int vCount=0;
			for(int i=0;i<n;i++) {
				if(str.charAt(i)=='E') {
					eCount++;
				}
				if(str.charAt(i)=='V') {
					vCount++;
				}
			}
			
			
		}
		
	}
}
