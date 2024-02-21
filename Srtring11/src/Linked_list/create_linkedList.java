package Linked_list;

import java.util.LinkedList;

public class create_linkedList {
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data)
		
		{
			this.data=data;
			this.next=null;
		}
	}
	
//	adding first
	
	public void AddFirst( String data)
	{
		Node newNode =new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(String data)
	{
		Node newNode =new Node(data);
		if(head==null)
		{
			head=newNode;
			return;	
		}
		Node currNode=head;
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void printList()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
	}
	public static void main(String[] args) {
		create_linkedList  l=new create_linkedList();
		l.AddFirst("a");
		l.AddFirst("is");
		l.addLast("hello");
		l.printList();
		LinkedList l1=new LinkedList();
		l1.peek();
	}
	
}
