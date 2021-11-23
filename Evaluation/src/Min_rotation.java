import java.util.*;

public class Min_rotation
{

	public static void main(String[] args)
	{
      		Scanner sc = new Scanner(System.in);

		String str=sc.nextLine();
		
		int i=1;
		while(i<str.length())
		{
			i++;
			if(str.substring(0, i).equals(str.substring(i, i+i))==true)
			{
				//System.out.println(str.substring(0, i));
				//System.out.println(str.substring(i, i+i));
				System.out.println(i);
				break;
			}
			
		}
	
		
	}

}