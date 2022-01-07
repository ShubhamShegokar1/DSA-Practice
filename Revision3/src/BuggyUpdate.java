import java.util.Scanner;

public class BuggyUpdate 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) 
		{	
			String str=sc.nextLine();
			String str2=sc.nextLine();
			
			String check="";
			int arr1[]= new int[3];
			int arr2[]= new int[3];
			int z=0;
            long temp=0;

            for(int i=0;i<str.length();i++) 
            {
				if (str.charAt(i) == '.') 
				{		
					 temp = Integer.parseInt(check);
					check = "";
					arr1[z]=(int) temp;
					z++;
				} 
				else 
				{
					check+= str.charAt(i);
				}
            }
            temp = Integer.parseInt(check);
			arr1[2]=(int) temp;

            check = "";
            z=0;
            temp=0;
            for(int i=0;i<str2.length();i++) 
            {
				if (str2.charAt(i) == '.') 
				{		
					 temp = Integer.parseInt(check);
					check = "";
					arr2[z]=(int) temp;
					z++;
				} 
				else 
				{
					check+= str2.charAt(i);
				}
            }
            temp = Integer.parseInt(check);
			arr2[2]=(int) temp;

            boolean b=false;
            for(int i=0;i<3;i++) 
            {
            	if(arr1[i]<arr2[i]) 
            	{
            		System.out.println("True");
            		b=true;
            		break;
            	}
            	if(arr1[i]>arr2[i]) 
            	{
            		System.out.println("False");
            		b=true;
            		break;
            	}            
            	
            }
           
		}
	}

}

