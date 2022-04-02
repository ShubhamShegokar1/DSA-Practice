import java.io.*;

class Person implements Serializable
{
    String name;
    String Adhar;

    public Person(String name, String adhar) {
        this.name = name;
        Adhar = adhar;
    }

    public String getName() {
        return name;
    }

    public String getAdhar() {
        return Adhar;
    }
}

public class Serialization {
    public static void main(String[] args) throws Exception {
        Person person= new Person("Shubham","7139726398");
        FileOutputStream fos=new FileOutputStream("file2.txt",true);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.writeObject("shubham");

        FileInputStream fis= new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Person person= (Person) ois.readObject();
        System.out.println(person.Adhar+" "+person.name);
    }
}
