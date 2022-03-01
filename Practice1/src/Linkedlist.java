
class SLL
{
	Node head;
	static class Node
	{
		int data;	
		Node next;
		public Node(int data) 
		{
			this.data = data;
		}
	}
	
	public static void insert(SLL sll, int data)
	{
		Node newNode= new Node(data);
		newNode.next=null;
		if(sll.head==null) {
			sll.head=newNode;
		}
		else {
			Node temp=sll.head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	static void printList(SLL list) 
	{
		Node temp=list.head;
		while(temp!=null) 
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
}

public class Linkedlist {

	public static void main(String[] args) {
		SLL list = new SLL();
		SLL.insert(list, 1);
        SLL.insert(list, 2);
        SLL.insert(list, 3);
        SLL.insert(list, 4);
        SLL.printList(list);
    	SLL.insert(list, 1);
        SLL.insert(list, 2);
        SLL.insert(list, 3);
        SLL.insert(list, 4);
        SLL.printList(list);

	}

}
