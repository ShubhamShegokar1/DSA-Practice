
public class Equals 
{

	
	String str2;
	Equals(String str)
	{
		this.str2=str;
	}
	static String str = new String("shubham");
	static String str1 = new String("shubham");
	public static void main(String[] args) {
	System.out.println(str.equals(str1));
	System.out.println(str==str1);

	Equals obj= new Equals("a");
	Equals obj1= new Equals("a");
	System.out.println(obj.equals(obj1));
	}
}
