package Searching;

import java.util.*;


public class reverse_array {
	 static List<Integer> add(Vector l1)
	 {
		 int s=2;
		 int e=l1.size()-1;
		 while(s<=e)
		 {
			Collections.swap(l1,s,e);
			 s++;
			 e--; 
		 }
		return l1;
	 	
	 }
	 
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add(11);
	l1.add(7);
	l1.add(3);
	l1.add(12);
	l1.add(4);
	System.out.println(l1.size());
	System.out.println(l1);
	add(l1);
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
	System.out.println(	add(l1));
}
}
