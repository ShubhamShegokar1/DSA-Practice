package arrayList;

import java.util.*;
import java.util.List;

public class StringArray_list {

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		System.out.println("Enter Names");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++)
		{
			list.add(sc.nextLine());
		}
		list.sort(null);
		System.out.print(" " + list);

		System.out.println("Enter Element to be fetch");
		int j = sc.nextInt();
		System.out.println(list.get(j));
	}

}
