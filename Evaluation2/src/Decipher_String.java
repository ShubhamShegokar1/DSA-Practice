import java.util.*;

public class Decipher_String 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < T; l++) 
		{
			int n = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine();
			ArrayList <Integer> list= new ArrayList<>();

			for (int i=0; i < str.length(); i++)
			{
				int res = 0;

				char c = str.charAt(i);
				 if (c < '0' || c > '9') continue;
				res = res * 10 + c - '0';
				list.add(res);
				//System.out.println(res);
			}
			//System.out.println(list);
            int j=-1;
			for(int i=0;i<str.length();i++)
			{				
				if (str.charAt(i) >='a' && str.charAt(i) <= 'z')
				{
					   j++;
						for(int k=0;k<list.get(j);k++)
						{
							System.out.print(str.charAt(i));
						}
				}
				
			}
		}

	}

}
