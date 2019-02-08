package com.algorithms;

public class DoublyLinkedList {

	class Node {
		Node next;
		Node prev;
		int value;

		public Node(int value) {
			next = null;
			prev = null;
			this.value = value;
		}

		public String toString() {
			return "The value of the node is: " + this.value;
		}

	}

	Node head = null;

	public void insertNode(Node node) {
		Node temp;
		if (head == null) {
			head = node;
			// System.out.println(node);
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			temp.next.prev = temp;
			// System.out.println(temp.next);
		}
	}

	public void removeNode(int data) {
		Node temp = head;

		if (temp.value == data) {
			head = temp.next;
			temp = null;
		}

		else {
			while (temp.next != null) {
				if (temp.next.value == data) {
					System.out.println(temp);
					temp.next = temp.next.next;
					break;
				} else {
					System.out.println("Else condition::::::: " + temp);
					temp = temp.next;
				}
			}
		}

	}

	public void showLinkedList() {
		Node temp = head;

		if (temp == null) {
			System.out.println("The linked List is empty");
		} else {
			while (temp != null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}

	}

	// public void reverseLinkedList(Node head) {
	// Node temp;
	// Node next;
	// Node prev;
	// }

	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertNode(list.new Node(5));
		list.insertNode(list.new Node(4));
		list.insertNode(list.new Node(3));
		list.insertNode(list.new Node(2));
		list.insertNode(list.new Node(1));

		// list.showLinkedList();

		list.removeNode(1);

		list.showLinkedList();

	}

}
