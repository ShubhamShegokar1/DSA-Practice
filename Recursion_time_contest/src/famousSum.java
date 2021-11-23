import java.util.Scanner;
public class famousSum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int temp=0;
		for(int j=0;j<str.length();j++) {
			int n1=Integer.parseInt(String.valueOf(str.charAt(j)));
			temp+=n1;
		}
		Long n=sc.nextLong();
		str=""+temp;
		int num=Integer.parseInt(str);
		//System.out.println(num*n);
		find(num*n);
	}

	private static void find(long l) {
         int temp=0;
		while (l > 0) {
		    temp+= l % 10;
		    l = l / 10;
		}
		l=temp;
		if(l<10) {
			System.out.println(l);
			return;
		}

		find(l);
	}
}
