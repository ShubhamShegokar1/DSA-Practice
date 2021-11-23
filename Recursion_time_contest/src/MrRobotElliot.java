import java.util.Scanner;
import java.text.DecimalFormat;
public class MrRobotElliot 
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			int t=Integer.parseInt(sc.nextLine());
			String str=sc.nextLine();
			find(str,0,str.length());
		}
	}
	private static void find(String str,int start, int end) {
		String permanent=str;
		if(str.length()<=5) {
			return;
		}
	   int mid=str.length()/2;
	   System.out.print(str.charAt(mid));
	   
	   find(str, start, mid);
	}
}