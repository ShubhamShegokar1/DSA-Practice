package conversion;

public class Conversion
{

	public static void main(String[] args) 
	{
		//Character array to String
	
      char ch='c';
      char ch4[]= {'s','h','u','b','h','a','m'};
      String strh=String.valueOf(ch4);
      System.out.println(strh);
		
                   //------- Character to String

      String s  = Character.toString(ch);             
      System.out.println("Converted char to String "+s);
	
      
                    //-----Character to Integer
      
      char ch1='7';
      int i=ch;                                     
      System.out.println("Converted char to Integer "+i);
      
      
      
                      //-------- Integer to Character 
      int i1=5;
      char ch2=(char)i1;
      int i3=8;
      
                      // --------Integer to Long      
      long l=(long)i3;
      
      String s1 ="9";  
      boolean var4 = true;
      Integer obj= Integer.valueOf(i3);
      Boolean boo=Boolean.valueOf(var4);
      
      
                     //--- String to Integer
      
      int z=Integer.parseInt(s1);
      
      if(boo instanceof Boolean)
      {
    	  System.out.println("Done");
      }
      
	}
}