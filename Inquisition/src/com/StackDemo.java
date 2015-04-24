package com;
import ds.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack arStack=new Stack(10);
		
		
		arStack.push(3);
		arStack.push(7);
		arStack.push(2);
		arStack.push(-4);
		arStack.push(-9);
		
		arStack.display();
		System.out.println("----");
		arStack.pop();
		arStack.display();
		
		
		
		
		
	}

}
