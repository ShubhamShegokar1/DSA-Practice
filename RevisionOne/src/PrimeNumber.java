import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int l=0;l<test;l++)
        {
        	int n=sc.nextInt();
        	boolean b=false;
        	int a=0;
        	
       
        	for(int i=2;i<n;i++) {
        		if(n%i==0) {
        			a=1;
        			break;
        		}
        	}
        	if(n==1 ) {
        		System.out.println("No");
        	}
        	else if(a==0 || n==2) {
        		System.out.println("Yes");
        	}
        	else {
        		System.out.println("No");
        	}
        }
	}

}
