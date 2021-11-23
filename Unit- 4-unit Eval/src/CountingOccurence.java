import java.util.Scanner;

class CountingOccurence
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test=Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++) 
		{	    	    
			int count[]=new int[10];
			int n=Integer.parseInt(sc.nextLine());
			String str=sc.nextLine();
			
			for(int i=0;i<str.length();i++) {
				int temp=Character.getNumericValue(str.charAt(i));
				//System.out.println(temp+" ");
				count[temp]++;
			}
			for(int a:count) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	
	}

}