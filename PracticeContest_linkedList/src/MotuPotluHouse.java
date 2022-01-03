import java.util.Scanner;

public class MotuPotluHouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int cnt1=0;
        int cnt2=0;
        while(n>10000) {
        	
        	if(n-10000<10000) {
        		break;
        	}
        	cnt1++;
        	n=n-10000;
        }

        while(n>1000) {
        	if(n-1000<1000) {
        		break;
        	}
        	cnt2++;
        	n=n-1000;
        }
      
        int cnt3=0;
        while(n>5) {
        	cnt3++;
        	n=n-5;
        }
        System.out.println((cnt1*2000)+(cnt2*200)+(cnt3)+1);
	}
}
