class MultithreadingDemo implements Runnable 
{
   	public void run()
	{
		System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		
	}
}

public class Multithreading 
{
	public static void main(String[] args)
	{
		int n = 8; 
		for (int i = 0; i < n; i++) 
		{
			MultithreadingDemo object= new MultithreadingDemo();
		}
	}
}