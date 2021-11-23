package practice;

public class TestImpl extends Node
{ 
	public static void main(String[] args) {
		

		Node llist = new Node();
		 
	    llist.push(20);
	    llist.push(4);
	    llist.push(15);
	    llist.push(10);

	    /*Create loop for testing */
	    llist.head.next.next.next.next = llist.head;

	    if (detecLoop(head))
	        System.out.println("Loop found");
	    else
	        System.out.println("No Loop");
	}
	static boolean detecLoop(Node first) 
	{
		return false;
		
	}
	
}

 
class Node {

	Node next;
	String name;
	public static Node head=null;
	public Node tail= null;
	public Node getNext(String new_data) 
	{
		head.next=next;
		return next;
	}
	public void push(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setNext(Node next)
	{
		if(head==null)
		{
	        Node new_node = new Node();
	        new_node.next=head;
            head=new_node;
		}
		this.next = next;
	}
	

}