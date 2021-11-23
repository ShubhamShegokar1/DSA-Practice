import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Distinct_String {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		ArrayList<String> list = new ArrayList<>();
		for (int l = 0; l < T; l++)
		{
			list.clear();
			int n = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine();

			for (int i = 0; i < str.length(); i++)
			{
				StringBuffer strbuf = new StringBuffer();
				for (int k = i; k < str.length(); k++) 
				{
					strbuf.append(str.charAt(k));
					list.add(strbuf.toString());
				}
			}

			Collections.sort(list);
			//System.out.println(list);
			// System.out.println(list.size());
			int count = 0;
			for (int i = 0; i < list.size() - 1; i++) 
			{

				if (list.get(i).equals(list.get(i + 1)) == false)
				{
					count++;
					//System.out.println(count);
				}
     		}
			 System.out.println(count+1);
		}
	}
}