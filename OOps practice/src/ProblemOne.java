import java.util.ArrayList;

/*
Create an abstract class “Publication” with data members ‘noOfPages’, ‘price’, ‘publisherName’ etc.
 with their accessor/modifier functions. Now create two sub-classes “Book” and “Journal”. 
 Create a class Library that contains a list of Publications. Write a main() function 
 and create three Books and two Journals, add them to library and print the details of all publications.
 */

abstract class Publication {
	int noOfPages;
	int price;
	String publisherName;

	public Publication(int noOfPages, int price, String publisherName) {
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}

	public String toString() {
		return "Publication [noOfPages=" + noOfPages + ", price=" + price + ", publisherName=" + publisherName + "]";
	}

}

class Book extends Publication 
{
	Book(int noOfPages, int price, String publisherName) 
	{
		super(noOfPages, price, publisherName);
	}

}

class Journal extends Publication 
{
	Journal(int noOfPages, int price, String publisherName)
	{
		super(noOfPages, price, publisherName);
	}

}

class Library
{
	ArrayList<Publication> list = new ArrayList<>();
	
	void add(Publication publication){
		list.add(publication);
	}
	
	void display(){
		System.out.println(list);
	}
}

public class ProblemOne {
	public static void main(String[] args) 
	{
		Library library= new Library();
		Publication obj = new Book(100, 20, "Jungle Book");
		Publication obj1 = new Journal(10, 200, "Journal");
		library.add(obj1);
		library.display();
	}
}











