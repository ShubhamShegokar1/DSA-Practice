package arrayList;

import java.util.*;

public class Int_ArrayList {

	public static void main(String[] args)  
	{
       List <String> list= new ArrayList <String>();
       list.add("22");
       list.add("33");
       list.add("1");
list.sort(null);	
System.out.println("list1"+list);


List <String> list1= new ArrayList<String> ();
list1.add("222");
list1.add("333");
list1.add("21");
System.out.println(list1);

Collections.copy(list1,list);

System.out.println("list1"+list);
System.out.println("copy"+list1);
}
}