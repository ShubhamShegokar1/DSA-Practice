
public class Factory_Pattern 
{
	public static void main(String[] args) 
	{
		multiply("1323123124","4");

	}
	public static String multiply(String num1, String num2) 
	{
		StringBuilder sb= new StringBuilder();
        int carry=0;
        int index1=num1.length()-1;
        int index2=num2.length()-1;
     
        while(index1>=0 && index2>=0) 
        {
        	int temp=carry+(Integer.valueOf(num1.charAt(index1)-'0')* 
        			Integer.valueOf(num2.charAt(index2)-'0'));
    		//System.out.print(temp+" ");
             
        	if(temp>9)
        	{
        		int cur=temp;
        		while(cur>=10) 
        		{
        			cur=cur/10;
        		}
        		carry=cur;
        		sb.insert(0, temp%10);

        	} 
        	else
        	{
        		sb.insert(0,temp);
        		carry=0;
        	}
        	index1--;
        }
          System.out.println(sb);
		return sb.toString(); 
	}
}
