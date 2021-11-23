import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Make_leaderboard3 
{	
	public static void main(String [] args)
	{
        ArrayList<String>[] list = new ArrayList[100000];
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for (int x = 0; x < n; x++) 
		{
			String InputValue = sc.nextLine();
			String[] Value = InputValue.split(" ");
			String name = Value[0];
			int index = Integer.parseInt(Value[1]);
            list[index].add(name);
		}
		for (int i = 0; i < 100000; i++) 
		{
            for (int j = 0; j < list[i].size(); j++)
            {
                System.out.print(list[i].get(j) + " ");
            }
        }
	}
}