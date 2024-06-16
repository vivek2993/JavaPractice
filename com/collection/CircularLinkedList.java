package com.collection;

public class CircularLinkedList {

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;

	public void add(int data) {
		Node newnode = new Node(data);

		if (head == null) { 
			head = newnode;
			tail = newnode;
			tail.next = head;
			
		} else {
			tail.next=newnode;
			tail=newnode;
			newnode.next=head;
			
		}

	}
	public void print() {
		Node node=head;
		
		if(head==null)
			return;
		 
		do{
			System.out.println(node.data);
			node=node.next;
		}while( node !=head);
			 
	}

	public static void main(String[] args) {
		CircularLinkedList dList = new CircularLinkedList();  
	        //Add nodes to the list  
	        dList.add(1);  
	        dList.add(2);  
	        dList.add(3);  
	        dList.add(4);  
	        dList.add(5);  
	  
	        dList.print();
	}
}
