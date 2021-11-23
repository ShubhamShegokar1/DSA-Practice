import java.util.Arrays;
import java.util.Scanner;

class permutation_of_string 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int arr1[]= new int[str1.length()];
		int arr2[]= new int[str1.length()];

		for(int i=0;i<str1.length();i++)
		{
            int ascii=str1.charAt(i)-96;
            arr1[i]=ascii;
		}
		for(int i=0;i<str2.length();i++)
		{
			 int ascii=str2.charAt(i)-96;
	          arr2[i]=ascii;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		 if (Arrays.equals(arr1, arr2))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	}
}