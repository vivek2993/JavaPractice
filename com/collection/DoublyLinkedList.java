package com.collection;

public class DoublyLinkedList {

	class Node {
		int data;
		Node pre;
		Node next;

		Node(int data) {
			this.data = data;
			this.pre = null;
			this.next = null;

		}
	}

	Node head, tail;

	public void addElement(int data) {
		Node newnode = new Node(data);

		if (head == null) {
			head = tail = newnode;
		} else {
			tail.next = newnode;
			newnode.pre = tail;
			tail=newnode;
		}
	}

	public void printElement() {
		Node node = head;

		if (head == null)
			return;

		while (node != null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		
		list.printElement();
	}
}
