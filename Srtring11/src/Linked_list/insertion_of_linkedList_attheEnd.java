package Linked_list;

import java.util.LinkedList;

public class insertion_of_linkedList_attheEnd {
	 Node head;
	class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		
		this.next=null;
	}
	}
	public  void printNode( )
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
	}
	public void insertfirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			
		}
		if(head!=null)
		{
			head.next=head;
		}
		head=newNode;
	}
	public void insertAtEnd( int newData)
	{
		Node newNode=new Node(newData);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		if(head!=null)
		{
		Node 	temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		return;
			
		}
		
	}
	
	public static void main(String[] args) {
		insertion_of_linkedList_attheEnd l1=new insertion_of_linkedList_attheEnd ();
		l1.insertAtEnd(2);
		l1.insertAtEnd(2);
		l1.insertAtEnd(2);
		l1.insertAtEnd(2);
		l1.insertfirst(8);
		l1.insertAtEnd(2);
		l1.printNode();
	}
	

}
