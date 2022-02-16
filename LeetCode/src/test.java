
public class test {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3};
		int n = arr.length;
		StringBuilder str = new StringBuilder();
		int carry=1;
		for (int i = n-1; i > -1; i--) 
		{
			if(arr[i]+carry>9 && i==0) 
			{
				str.insert(0, 0);
				str.insert(0, 1);
			}
		    else if(arr[i]+carry>9)
			{
				carry=1;
				str.insert(0, 0);
			}
			else 
			{
				str.insert(0, arr[i]+carry);
				carry=0;
			}
		}
		int len=str.toString().length();
		String temp=str.toString();
		int ans[]= new int[len];
		for(int i=0;i<len;i++)
		{
			ans[i]=Integer.valueOf(temp.charAt(i)-'0');
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(ans[i]);
		}	
	}
}
