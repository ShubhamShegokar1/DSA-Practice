import java.util.Scanner;
import java.text.DecimalFormat;
public class beyond 
{
	static double sum (int n)
	{
		if (n == 1 || n==0) 
			return 0;
		else
	 return (sum(n - 1)+Math.log(n)); 	 
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sum(n);
		 DecimalFormat formatt = new DecimalFormat("#.####");
		System.out.println(formatt.format(sum(n)));
	}
}