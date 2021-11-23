package Abstraction;

interface inte
{
	void draw();
}


abstract class draw implements inte
{
	public void draw()
	{
		System.out.println("In draw class");
	}
}




class draw1 implements inte
{
	public void draw() 
	{
		System.out.println("In draw1 class");
	}
}



class fina 
{
	public static void main(String[] args) {
		inte i= new draw1();
		i.draw();
	}
}