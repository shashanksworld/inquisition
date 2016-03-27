package ds;

public class Node {
	
	public int data;
	public Node next=null;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}
	public Node(int data,Node n)
	{
		this.data=data;
		this.next=n;
		
	}
}
