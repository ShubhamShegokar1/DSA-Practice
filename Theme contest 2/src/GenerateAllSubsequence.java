import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GenerateAllSubsequence {
    static ArrayList <String> list= new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		solve(str,"");		
		//Collections.sort(list);
		for(int i=1;i<list.size();i++) {
			String temp=list.get(i);
			System.out.println(temp);
		}
	}
    
	private static void solve(String str, String string) {
		if(str.length()==0) {
			list.add(string);
			return;
		}
		char ch=str.charAt(0);
		String temp=str.substring(1);
		
		solve(temp, string+"");
		solve(temp, string+ch);

	}

}
