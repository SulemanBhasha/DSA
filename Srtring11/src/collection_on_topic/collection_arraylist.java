package collection_on_topic;

import java.util.ArrayList;

public class collection_arraylist {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		ArrayList l2=new ArrayList();
		l2.add(40);
		l2.add(50);
		l2.add(60);
		l2.add(70);
		System.out.println(l1);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
	}

}
