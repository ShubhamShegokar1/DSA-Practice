
/*
 Write two interfaces “Fruit” and “Vegetable” containing methods ‘hasAPeel’ and ‘hasARoot’. 
 Now write a class “Tomato” implementing Fruit and Vegetable. 
 Instantiate an object of Tomato. Print the details of this object.
 */

interface Fruit
{
	void hasAPeel();
}

interface Vegetable
{
	void hasAPeel();
}

class Tomato implements Fruit, Vegetable {
	
	public void hasAPeel() {
		System.out.println("Yes");
	}

	public void hasARoot() {
		System.out.println("No");
	}
}


class Runner
{
	public static void main(String[] args) {
		Tomato tomato= new Tomato();
		tomato.hasAPeel();
		tomato.hasARoot();
	}
}