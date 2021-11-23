import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GenerateAllSubsequence {
	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        String str =sc.nextLine();
        find(str,"",0);
       
    }

	private static void find(String str, String newStr, int curr) {
		if(newStr.length()>0) {
			System.out.println(newStr);
		}
		
		if(curr==str.length()) {
			return;
		}
		
		for(int i=curr;i<str.length();i++) {
			newStr+=str.charAt(i);
			find(str, newStr, i+1);
			String temp="";
			for(int j=0;j<newStr.length()-1;j++) {
				temp+=newStr.charAt(j);
			}
			newStr=temp;
		}
	}

    }