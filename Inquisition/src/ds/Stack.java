package ds;

public class Stack {
	
	int size;
	int top;
	int []stack=null;
	
	public Stack(int size)
	{
		this.size=size;
		top=-1;
		stack=new int [size];
	}
	
	public void push(int val)
	{
			if(top==size-1)
			{
				System.out.println("stack is full");
			}
			else
			{
				top=top+1;
				stack[top]=val;
			}
			
	}
	
	public boolean isEmpty()
	{
			return top==-1;
	}
	public int pop()
	{
			if(!isEmpty())
			{int temp=stack[top];
				top=top-1;
				return temp;
			}else
				System.out.println("stack is empty");
			return -1;
	}
	public void display()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.println(stack[i]);
		}
	}
	

}
