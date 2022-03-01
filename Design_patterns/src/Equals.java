
public class Equals 
{


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str2 == null) ? 0 : str2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals other = (Equals) obj;
		if (str2 == null) {
			if (other.str2 != null)
				return false;
		} else if (!str2.equals(other.str2))
			return false;
		return true;
	}
	String str2;
	Equals(String str)
	{
		this.str2=str;
	}
	static String str = new String("shubham");
	static String str1 = new String("shubham");

	public static void main(String[] args) 
	{
		System.out.println(str.equals(str1));
		System.out.println(str==str1);

		Equals obj= new Equals("a");
		Equals obj1= new Equals("a");

		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);

	}
}
