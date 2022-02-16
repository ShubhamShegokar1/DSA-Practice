
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

class Person {
	String name;
	Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class ComparatorExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		ArrayList<Person> list = new ArrayList<>();
		
		for (int i = 0; i < test; i++) 
		{
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			String str = st1.nextToken();
			Integer n = Integer.parseInt(st1.nextToken());
			Person p = new Person(str, n);
			list.add(p);
		}
		
		List<Person> unsortedCustomerList = list;
		Comparator<Person> nameComparatorLEx = (cust1, cust2) -> cust1.getName().compareTo(cust2.getName());
		Comparator<Person> ageComparatorLEx = (cust1, cust2) -> cust2.getAge().compareTo(cust1.getAge());

		List<Person> sortedList = unsortedCustomerList.stream().sorted( ageComparatorLEx// 1st compare Name
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
