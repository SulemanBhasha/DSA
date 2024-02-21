package stack_on_topic;

import java.util.*;

public class reverse_String_using_stack {
	 public static String reverse(String str)
	 {
		 Stack s=new Stack();
		 for(int i=0;i<str.length();i++)
		 {
			 s.push(str.charAt(i));
		 }
		 StringBuilder str2= new StringBuilder("");
		 while(!s.isEmpty())
		 {
			 str2.append(s.pop());
		 }
		 String st=str2.toString();
		 return st; 
	 }
	public static void main(String[] args) {
		System.out.println(reverse("hello"));
	}
}
