import java.util.Scanner;
import java.util.Stack;

public class ReverseVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) {
			String str= sc.nextLine();
			Stack <Character> stk = new Stack<>();
			for (int i = 0; i < str.length(); i++) 
			{
				char temp = str.charAt(i);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					stk.push(temp);
				}
			}
			StringBuilder sb= new StringBuilder();
			for (int i = 0; i < str.length(); i++) 
			{
				char temp = str.charAt(i);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					sb.append(stk.peek());
					stk.pop();
				}
				else {
					sb.append(temp);
				}
			}
			System.out.println(sb);
		}
	}
}
