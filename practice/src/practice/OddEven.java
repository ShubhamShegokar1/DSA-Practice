package practice;


public class OddEven 
{

	public void check(int n)
	{
		if(n%2==0)
		{
			System.out.println("Even no");
			
		}else
		{
			System.out.println("Odd");
		}
		
	}
	
public static void main(String[] args) 
{
	
    OddEven obj=new OddEven();
    obj.check(6);

}
}
