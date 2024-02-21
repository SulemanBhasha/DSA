
package stack_on_topic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Quee_using_two_stack {
		static Stack<Integer> s1=new Stack<>();
		static Stack<Integer> s2=new Stack<>();
		public static boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
		public static void add(int data)
		{
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
//			s2.push(data);
		}
		public static int remove(){
			if(isEmpty())
			{
				System.out.println("Queue empty");
				return -1;
			}
			return s1.pop();
		}
		public static int peek(){
			if(isEmpty())
			{
				System.out.println("Queue empty");
				return -1;
			}
			return s1.peek();
		}
		public static void main(String[] args) {
			Queue q=new LinkedList();
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(1);
			q.add(2);
			q.add(3);
			while(!isEmpty()){
				System.out.println(peek());
				System.out.println(remove());
			}
			
			
		}
}
