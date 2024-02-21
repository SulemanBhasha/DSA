package stack_on_topic;

import java.util.Stack;

public class reversestackusingrecursion {
	public static void pushAtBottom(Stack s, int top)
	{
		s.push(top);
	}
	public static void popAtBottom(Stack s)
	{
		
		if(s.isEmpty())
		{
			return;
		}
		int top=(int) s.pop();
		popAtBottom( s);
		pushAtBottom(s,top);
	}
	public static void main(String[] args) {
	
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		popAtBottom( s);
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
		
		
	}

}
