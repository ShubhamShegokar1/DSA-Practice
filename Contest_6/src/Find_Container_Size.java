import java.util.Arrays;
import java.util.Scanner;

class Find_Container_Size 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		int len=str.length();
		int arr[]= new int[len];
		for(int i=0;i<len;i++)
        {
			int ascii=str.charAt(i);
			ascii=ascii-96;
			arr[i]=ascii;
        }

	
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt(); 
			int cnt=0;
			int max=0;
			int arrcopy[]= new int[(b-a)+1];
			int index=0;
			for(int k=a-1;k<b;k++)
			{
				arrcopy[index]=arr[k];
				index++;
			}
			//--------------------
			int length=arrcopy.length;
			for(int k=0;k<length;k++)
			{
				System.out.print(arrcopy[k]+" ");
			}
			System.out.println();
			Arrays.sort(arrcopy);
			for(int k=0;k<length;k++)
			{
				System.out.print(arrcopy[k]+" ");
			}
			//------------------------------------
			int newlen=arrcopy.length;
			max=arrcopy[newlen-1];			
			
			int counter=0;
			for(int j=length-1;j>0;j--)
			{
				if( arrcopy[j]==arrcopy[j-1] )
				{
					counter++;
					if(counter==1 && counter>0)
					{
						cnt=arrcopy[j]+cnt;
					}
				}
			}
			System.out.println(max+cnt);	
		}

	}
}