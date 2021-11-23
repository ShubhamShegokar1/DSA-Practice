import org.w3c.dom.Node;

import java.util.Scanner;
/*
class Node{
  int data;
  Node next;

  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/
class Solution
{


    public static Node insertAtTail(Node a, int val)
    {
         Node head = null;
         Node tail = null;
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = a;
            tail = a;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
        return a;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int element=sc.nextInt();
            Node head=null;
            insertAtTail(head,element);
        }
    }
}
