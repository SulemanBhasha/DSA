package arcadis;

import java.util.Stack;

public class validParantahsis {
	public static void main(String[] args) {
		String str="((({{}}[])))";
		int k=0;
		char arr[]=str.toCharArray();
		Stack <Character> s=new Stack<Character>();
		for (int i = 0; i < arr.length; i++) {
			char ch=arr[i];
			if(ch=='(' || ch=='{' || ch=='[')
			{
				s.push(ch);
				
			}
			else
			{
				if(s.isEmpty())
				{
					System.out.println("not a valid palindrome");
					k=1;
					break;
				}
				if((s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']') || (s.peek()=='{' && ch=='}'))
						{
						s.pop();
						}
				else
				{
					System.out.println("not a valid");
					break;
				}
			}
			
		}
		if(s.empty() && k!=1)
		{
			System.out.println("valid");
		}
		
	}
}
