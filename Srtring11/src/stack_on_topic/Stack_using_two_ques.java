package stack_on_topic;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_two_ques {
	
	static class Stack{
		static Queue<Integer> q1=new LinkedList<Integer>();
		static Queue<Integer> q2=new LinkedList<Integer>();
		public static boolean isEmpty()
		{
			return q1.isEmpty() && q2.isEmpty();
		}
		private  static void add(int data) {
			if(!q1.isEmpty())
			{
				q2.add(data);
			}else{
				q2.add(data);
			}
		}
		private static int pop() {
			if(isEmpty()){
				System.out.println("empty stack");
				return -1;
			}
			int top=-1;
			if (!q1.isEmpty()) {
				while(!q1.isEmpty()){
				top=q1.remove();
				if(q1.isEmpty())
					break;
				}
				q2.add(top);
			} else {
					while(!q2.isEmpty())
					{
						top=q2.remove();
						if(q2.isEmpty())
						{
							break;
						}
						q1.add(top);
					}
			}
			return top;
		}
		
		
		public static void main(String[] args) {
			
		}
	} 
	
}
