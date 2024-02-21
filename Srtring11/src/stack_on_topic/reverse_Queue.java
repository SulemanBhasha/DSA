package stack_on_topic;
import java.util.*;
public class reverse_Queue {
 public static void main(String[] args) {
	Queue <Integer>q=new LinkedList<>();
	for (int i = 1; i < 6; i++) {
		q.add(i);
	}
	reversal(q);
}

private static void reversal(Queue<Integer> q) {
	Stack <Integer> s=new Stack();
	while(!q.isEmpty())
	{
		s.push(q.remove());
		
	}
	while(!s.isEmpty())
	{
		q.add(s.pop());
	}
	while(!q.isEmpty())
	{
		System.out.println(q.remove());
	}
}
}
