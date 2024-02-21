package stack_on_topic;
import java.util.*;
public class implementation_of_deque {
	public static void main(String[] args) {
		Deque d=new LinkedList();
		d.addFirst(1);
		d.addFirst(2);
		System.out.println(d);
		d.addLast(3);
		d.addLast(4);
		System.out.println(d);
		System.out.println(d.removeFirst());
		System.out.println(d.removeLast());
		System.out.println(d);
	}

}
