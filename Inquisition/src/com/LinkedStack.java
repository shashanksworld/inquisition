package com;
import ds.Node;
public class LinkedStack {

	static Node node=null;
	static Node top=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(1);
		push(5);
		push(7);
		push(9);
		display();
		pop();
		display();
		
		
		
	}
	public static boolean push( int val)
	{
			if(node==null)
			{
					node=new Node(val);
					top=node;
					System.out.println("top :"+top.data);
			}
			else
			{	node=new Node(val);
				node.next=top;
				top=node;
				System.out.println("top :"+top.data+" next ="+top.next.data);
				
			}
		return true;
	}
	
	public static void display()
	{Node t=top;
		while(t!=null)
		{
			System.out.print(t.data+"->");
			t=t.next;
		}
		System.out.println("null");
	}
	
	
	public static void pop()
	{
		System.out.println(top.next.data);
		top=top.next;
	}
	

}
