/**
 * 
 */
package com.linkedlist;

import com.linkedlist.LinkedList.Node;

/**
 * @author chamara
 *
 */
public class MiddleElement {

	public void findMideElement() {
		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = linkedList.getHead();
		
		linkedList.add(new Node("1"));
		linkedList.add(new Node("2"));
		linkedList.add(new Node("3"));
		linkedList.add(new Node("4"));
		linkedList.add(new Node("5"));
		
		LinkedList.Node current = head;
		int length = 0;
		LinkedList.Node midle = head;
		
		while(current.getNext() != null) {
			length++;
			if(length%2==0) {
				midle = midle.getNext();
			}
			current = current.getNext();
		}
		
		if(length%2==1) {
			midle = midle.getNext();
		}
		
		System.out.println("Current Node : " + current);
		System.out.println("Midle Node : " + midle);
	}
}
