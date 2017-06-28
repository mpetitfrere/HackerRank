package linkedList;
class Node {
    int data;
    Node next;
 }

public class LinkedList {
	
	
	static Node initNodes()
	{
		//init objects
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		//init data
		a.data = 1;
		b.data = 2;
		c.data = 3;
		d.data = 4;
		e.data = 5;
		//init link
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		return a;
		
	}
	
	static void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data + "-> ");
			node=node.next;
		}
		System.out.print("null\n");

	}
	
	static void ReversePrint(Node head) {
		Node prev= null;
		Node loopNode = head;
		
		System.out.println("Reverse Link");
		while(loopNode!=null)
		{
			Node node = new Node();
			node.data=loopNode.data;
			loopNode= loopNode.next;
			node.next=prev;
			prev=node;
		}
		printList(prev);

		
		
		}
	public static void main(String[] args) {
		
		Node nodeList = initNodes();
		printList(nodeList);
		ReversePrint(nodeList);
	}

}
