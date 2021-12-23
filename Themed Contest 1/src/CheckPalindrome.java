import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 int n=Integer.parseInt(sc.nextLine());
	 String str=sc.nextLine();
	 int i=0;
	 int j=n-1;
	 boolean b=false;
	 while(i<=j) 
	 {
		 if(str.charAt(i)!=str.charAt(j)) 
		 {
			 System.out.println("No");
			 b=true;
			 break;
		 }
		 i++;
		 j--;
	 }
     if(b==false) {
    	 System.out.println("Yes");
     }
	}

}
