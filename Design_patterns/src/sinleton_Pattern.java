
  class ABC {
 
	public String str;
	private static ABC obj=null;
	private ABC(String str) {
		this.str=str;
	}
	
	public static ABC getInstance(String str)
	{
		if(obj==null){
			obj=new ABC(str);
			return obj;
		}
		return obj;
	}

}
class sinleton_Pattern
{
	public static void main(String[] args) {
	   ABC obj= ABC.getInstance("shubham");
	   System.out.println(obj.str);
	   
	   ABC obj1= ABC.getInstance("");
	   obj1.str="sjdfn";
	   
	   System.out.println(obj1.str);
	   System.out.println(obj.str);
	   System.out.println(obj.hashCode()+" "+obj1.hashCode());

	   sinleton_Pattern obj2= new sinleton_Pattern();
	  
 	}
}

