
public class Tree {
     
	 Tree left;
	 Tree right;
	 int data;
	public Tree(int val) {
		this.left = null;
		this.right = null;
		this.data=val;
	}
}

class Solution1
{
	public static void main(String[] args) {
          Tree t =new Tree(3);
          t.left=new Tree(3);
          t.right=new Tree(4);
         
	}
}
