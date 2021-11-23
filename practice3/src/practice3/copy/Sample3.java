package practice3.copy;
import java.util.*;
class Sample3 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);	
			System.out.println("Enter n");
			int n =sc.nextInt();
			System.out.println("Enter String");
			List <String> list=new ArrayList<String>();
			for(int i=0;i<n+1;i++)
			{
				list.add(sc.nextLine());
			}
			
			System.out.println("Enter String to checck");
			 String check=sc.nextLine();
				for (int j = 1; j < list.size(); j++) // list shubham
				{
					 int count=0;

					String str1 = list.get(j);
					for (int i = 0; i < check.length(); i++) // string shu
					{
						if (check.charAt(i) == str1.charAt(i)) 
						
						{
							count++;
						}
						else
						{							
						}						
						if(count==check.length())
						{
							System.out.println("Results---"+str1);
						}else
						{							
						}
					}
				}		
	}
}