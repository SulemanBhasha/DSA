package arcadis;

import java.util.Stack;

public class validParanthsis {
	public static void main(String[] args) {
		char arr[]={')','(',')',']'};
		int k=0;
		Stack <Character>s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(ch=='('||ch=='{'||ch=='[')
			{
				s.push(ch);
			}
			else
			{
				if(s.isEmpty())
				{
					 k=1;
					break;
				}
				if((s.peek()=='{' && ch=='}' )||( s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']'))
				{
					s.pop();
				}
				else
				{
					System.out.println("not valid");
					break;
				}
			}
		}
		if(s.isEmpty() && k!=1)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("not valid");
		}
	}
}
