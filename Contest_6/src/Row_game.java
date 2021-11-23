import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Row_game
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=0;l<t;l++)
		{
			ArrayList <Boolean> list = new ArrayList<>();
			LinkedHashSet<Integer> set = new LinkedHashSet<>();
			int row = sc.nextInt();
			int column = sc.nextInt();
			int[][] arr = new int[row][column];
			//int check[]=new int[column];

			for (int i = 0; i < row; i++) 
			{
				for(int j=0;j<column;j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}

			for(int j=0;j<column;j++)
			{
				set.add(arr[0][j]);
			}

			Iterator itr = set.iterator();
			int ans=0;

			while (itr.hasNext()) 
			{
				//System.out.println(itr.next());
				int x=(int) itr.next();
				//System.out.println(x);
				boolean b=false;
				list.clear();
				for (int i = 1; i < row; i++) 
				{
					b=false;
					for(int j=0;j<column;j++)
					{
						if(x==arr[i][j])
						{
							//System.out.print(x+" "+arr[i][j]+"    ");
							b=true;
						}
					}
					list.add(b);
				}
				int cnt=0;
				//System.out.println(list);
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i)==true)
					{
						cnt++;
					}
				}
				if(cnt==row-1)
				{
					ans++;
				}

			}   
			 System.out.println(ans);
		}
	}
}