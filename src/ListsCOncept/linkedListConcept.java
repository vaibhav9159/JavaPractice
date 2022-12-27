package ListsCOncept;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListConcept {

	//create custom linkedlist class - 
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	
	public void printLinkedList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
	
	//create custom linkedlist class - 
		
		linkedListConcept ll = new linkedListConcept();
		Node first = ll.new Node(10);
		ll.head = first;
		
		//linkng 1st node with 2nd
		Node second = ll.new Node(20);
		first.next=second;
		
		//linkng 3rd node with 2nd
		Node third = ll.new Node(30);
		second.next=third;
		
		ll.printLinkedList();
		
		
		// using default linked list class
		LinkedList<String> l = new LinkedList<String>();
		l.add("shiva");
		l.add("shakti");
		l.add("shambhu");
		l.add("bholenath");
		l.add("linked1");
		l.add("100");
		l.add("200");
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		l.addFirst("first method");
		l.addLast("last method");
		
		l.set(0, "setFirstValue");
		System.out.println(l);
	
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		for(String s:l)
		{
			System.out.println(s);
		}

		
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
