import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Essentially, the strategy pattern allows us to change the 
 * behavior of an algorithm at runtime. Typically, we would 
 * start with an interface which is used to apply an algorithm, 
 * and then implement it multiple times for each possible algorithm.
 */

interface Operation 
{
	public int action(int a, int b);
}

class Addition implements Operation 
{
	@Override
	public int action(int a, int b) {
		return a + b;
	}
}

class Subtraction implements Operation 
{
	@Override
	public int action(int a, int b) {
		return a - b;
	}
}

class Multiplication implements Operation {
	@Override
	public int action(int a, int b) {
		return a * b;
	}
}

class Divide implements Operation {
	@Override
	public int action(int a, int b) {
		return a / b;
	}
}

class Context {
	private Operation operation;

	public Context(Operation operation) {
		this.operation = operation;
	}

	public int executeStrtegy(int a, int b) {
		return operation.action(a, b);
	}
}

public class Strategy_Pattern 
{
	public static void main(String[] args) throws IOException 
	{
		Context context = new Context(new Addition());
		System.out.println(context.executeStrtegy(5, 5));
		
		Context context1 = new Context(new Subtraction());
		System.out.println(context1.executeStrtegy(5, 5));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	}
}


