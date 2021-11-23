package practice3;


public class Monk 
{

	public static void main(String[] args) 
	{
	   abc obj = abc.method();
	   abc ob2=abc.method();
	}

}

 class abc
 {
	 static abc a = new abc();
	 
	 private abc()
	 {
		 
	 }
	 
	
	public  static  abc   method()
	 {
		System.out.println("shubhsmn");
       return a;
	}
 }
