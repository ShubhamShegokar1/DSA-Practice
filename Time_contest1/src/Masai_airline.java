import java.util.Scanner;
class Masai_airline
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = Integer.parseInt(sc.nextLine());
		int arr1[]=new int[n];
		int arr2[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int i=0;
		
		while(i<n)
		{
			if( arr1[i]<16 && arr2[i]<8)
			{
				System.out.println("Boarding");
			}
			else
			{
					System.out.println("Stop");
			}
			i++;
		}
		
		
	}
}