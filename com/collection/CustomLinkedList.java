package com.collection;

public class CustomLinkedList {
 
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		
	}
	Node head;
	Node tail;
		public void add(int data) {
			Node node=new Node(data);
			
			if(head==null) {
				head=node;
				tail=node;
			}else {
				
				tail.next=node;
				tail=node;
			}
			
		}
		
		public void print() {
			Node d=head;
			
			if(head==null)
				return;
			
			while(d !=null) {
				System.out.println(d.data);
				d=d.next;
			}
		}
		
		public static void main(String[] args) {
			 
			CustomLinkedList cust=new CustomLinkedList();
			
			cust.add(10);
			cust.add(20);
			
			cust.print();
		}
}
 
