package practice3;

import java.util.*;

class Sample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		int n = 6;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(1);// 4
		list.add(1);// 5

		int minimum = Collections.min(list);
		int another = 0;
		
		
		for (int i = 0; i < 6; i++) 
		{
			if ( list.get(i)== minimum)
			{
				System.out.println("I :"+list.get(i));
				another = list.get(i);
				System.out.println(list.indexOf(another));

			}
		}

	}
}