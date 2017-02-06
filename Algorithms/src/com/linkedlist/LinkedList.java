/**
 * 
 */
package com.linkedlist;

/**
 * @author chamara
 *
 */
public class LinkedList {

	private Node head;
	private Node tail;

	public LinkedList() {
		this.head = new Node("Head");
		tail = head;
	}
	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {
		private Node next;
		private String data;
		
		public Node(String data) {
			this.data = data;
		}
		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}
		
		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}
		
		/**
		 * @return the data
		 */
		public String getData() {
			return data;
		}
		
		/**
		 * @param data the data to set
		 */
		public void setData(String data) {
			this.data = data;
		}
		
		public String toString() {
			return this.data;
		}

	}
}
