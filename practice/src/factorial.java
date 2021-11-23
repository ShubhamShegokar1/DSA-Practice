import java.util.Scanner;

public class factorial {

	static long r=1;
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		long i=n;
        while(i>=1)
        {
        	
          r= r*i;   
          i--;

        }
        System.out.println(r);

	}

}



