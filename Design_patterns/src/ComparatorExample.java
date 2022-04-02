
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

class Person {
	String name;
	private static int k;
	Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class ComparatorExample {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Shubham",12));
		list.add(new Person("yeloow",11));
		list.add(new Person("yummy",2));
		list.add(new Person("anything",19));
		list.add(new Person("Height",87));
		list.add(new Person("Minal",38));
   
	
		List<Person> unsortedCustomerList = list;
		Comparator<Person> nameComparatorLEx = (cust1, cust2) -> cust1.getName().compareTo(cust2.getName());
		Comparator<Person> ageComparatorLEx = (cust1, cust2) -> cust2.getAge().compareTo(cust1.getAge());

		List<Person> sortedList = unsortedCustomerList.stream().sorted(ageComparatorLEx
				.thenComparing(nameComparatorLEx)) 
				.collect(Collectors.toList()); 

        int cnt=1;
        int temp1=0;
        int temp2=0;
		for(int i=0;i<sortedList.size();i++) 
		{
			  if(i>0) temp1=sortedList.get(i-1).getAge();
			  temp2=sortedList.get(i).getAge();
		      if(i>0 && temp1!=temp2){
		    	  cnt=i+1;
		      }
			System.out.println(cnt+" "+sortedList.get(i).getName());
		}
		
	}

}
