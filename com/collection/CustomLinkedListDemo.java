package com.collection;

public class CustomLinkedListDemo {

	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
			
		}
		
	}
	

	Node head=null;
	Node tail=null;
	CustomLinkedListDemo instance;
	
	CustomLinkedListDemo(){
		this.head=null;
		
	}
	
//	CustomLinkedListDemo()
	public CustomLinkedListDemo add(int data) {
		
		Node newnode=new Node(data);
		
		if(head==null) {
			
			head=newnode;
			tail=newnode;
		}else {
			
			tail.next=newnode;
			tail=newnode;
			
			
		}
		return this;
	}
	
	public void print() {
		Node currentnode=head;
		
		if(head==null)
			return;
		
		while( currentnode !=null) {
			
			System.out.println(currentnode.data);
			currentnode=currentnode.next;
			
		}
	}
	
	public static void main(String[] args) {
		
		CustomLinkedListDemo customLinkedListDemo = new CustomLinkedListDemo();
		
		customLinkedListDemo.add(1).add(2).add(3);
//		customLinkedListDemo.add(2);
//		customLinkedListDemo.add(3);
		customLinkedListDemo.add(4);
		customLinkedListDemo.add(5);		
		
		customLinkedListDemo.print();
	}
}
