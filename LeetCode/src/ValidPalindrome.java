
public class ValidPalindrome 
{
	public static void main(String[] args) {
		String str="0P";
		System.out.println(check(str));
	}

	private static boolean check(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			while((str.charAt(i)<'a' || str.charAt(i)>'z') && (str.charAt(i)<'A' || str.charAt(i)>'Z') && (str.charAt(i)<'0' || str.charAt(i)>'9') && i<j) 
			{
				i++;
			}

			while((str.charAt(j)<'a' || str.charAt(j)>'z') && (str.charAt(j)<'A' || str.charAt(j)>'Z')&& (str.charAt(j)<'0' || str.charAt(j)>'9') && i<j) 
			{
				j--;
			}


			if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
				return false;
			}

			
			i++;	
			j--;

		}
		return true;
	}

}
