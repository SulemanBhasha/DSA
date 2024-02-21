package stack_on_topic;
 import java.util.*;
public class interLeave_queue {
	public static void main(String[] args) {
		Queue <Integer>q=new LinkedList();
		for(int i=1;i<11;i++){
			q.add(i);
		}
		interLeave(q);
	}

	private static void interLeave(Queue<Integer> q) {
		Queue <Integer> s=new LinkedList<>();
		int size=q.size();
		for(int i=0;i<size/2;i++)
		{
			s.add(q.remove());
			
		}
		while(!s.isEmpty())
		{
			q.add(s.remove());
			q.add(q.remove());
		}
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
		
	}

}
