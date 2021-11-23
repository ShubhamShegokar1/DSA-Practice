import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class Excel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int l=0;l<n;l++)
		{
			String str = sc.nextLine();
			ArrayList <Double> list= new ArrayList<>();
			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++)
			{
				arr[i] = str.charAt(i);
			}
		
			double num=0;
			for(int i=0;i<str.length();i++)
			{
				double ascii=str.charAt(i);
				ascii=ascii-64;
				num=ascii;
				if(i>0)
				{
					ascii=(list.get(0)*26)+num;
					DecimalFormat   format = new DecimalFormat  ("0.#");

					if(i==str.length()-1)
						System.out.print(format.format(ascii));
					list.clear();

				}
				if(str.length()==1)
				{
					System.out.print(ascii);
				}
				list.add(ascii);
			}
			System.out.println();
		}
	}

}
