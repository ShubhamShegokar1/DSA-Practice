import java.util.Scanner;
import java.text.DecimalFormat;
public class MrRobotElliot 
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(sc.nextLine());
			String str=sc.nextLine();
			find(str,0,n-1);
		}
	}
	private static void find(String str,int start, int end) {
		if(start>end) {
			return;
		}
	   int mid=(start+end)/2;
	   System.out.print(str.charAt(mid));
	   find(str, start, mid-1);
	   find(str, mid+1, end);
	}
}