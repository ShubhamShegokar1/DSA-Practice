import java.util.Scanner;

public class UnitsConsumed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 long n=sc.nextLong();
		 int cnt=0;
		 while(n>60) {
	        	cnt++;
	        	n=n-60;
	        }
		 if(n==0 && cnt>1) {
			 System.out.println(cnt+"hrs");
		 }
		 else if(cnt>1 && n>0) {
			 System.out.println(cnt+"hrs "+n+"mins");
		 }
		 else {
			 System.out.println(cnt+"hr "+n+"mins");
		 }
		}

}
