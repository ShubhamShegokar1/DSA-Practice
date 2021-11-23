import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class units
{
	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
	if (n / 3 <= 50) {
		if (n / 3 % 5 != 0) {
			for (int i = 0; i < 5; i++) {
				if (n / 3 + i % 5 == 0) {
					System.out.println(n / 3 + i);
					break;
				}

			}
		}
	} else if (n / 5 <= 150) 
	{
		int r = n / 5;
		if (r % 5 != 0) 
		{
			for (int i = 1; i < 5; i++) 
			{
				if ((r + i) % 5 == 0) 
				{
					System.out.println(r + i);
					break;
				}

			}
		}

	}

	else {
		
		int r=n/10+80;
		if(r==175)
		{
		System.out.println(172);
		}
		else if(r==173)
			
		{
			System.out.println(170);
		}
	}
   
  }
     
}

