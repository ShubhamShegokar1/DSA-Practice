import java.util.Scanner;
public class solve_it 
{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int cnt=0;
      while( sc.hasNextInt())
      {
    	  cnt++;
          System.out.println(cnt);

      }
      sc.close();
	}
}
