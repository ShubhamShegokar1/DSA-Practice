package ComparatorAndComprable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person  {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args)
    {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Shubham",12));
        list.add(new Person("yeloow",11));
        list.add(new Person("yummy",2));
        list.add(new Person("anything",19));
        list.add(new Person("Height",87));
        list.add(new Person("Minal",38));

        Comparator<Person> compare= Comparator.comparing(Person::getAge);
        List <Person> sortedByAge= list.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        for(Person p : sortedByAge) System.out.println(p);
    }
}
