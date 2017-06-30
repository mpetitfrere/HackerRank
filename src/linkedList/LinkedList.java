package linkedList;
class Node {
    int data;
    Node next;
 }

public class LinkedList {
	
	public static void main(String[] args) {
			
			Node List1 = initList1();// 1->2-> 3->4->5
			Node List2 = initList2();// 1->2-> 3->4->5
			Node List3 = initList3();// 1->2-> 3->
			Node List4 = initList4();// 6->7-> 8->9->10
			Node List5 = initList5();// 6->7-> 8->9->10
//
//			printList(initList1(),1);
//			
//			ReversePrint(List1);
//			
//			printList(initList2(),2);
//			CompareLists(List1, List2);
//			printList(initList3(),3);
//			CompareLists(List1, List3);
//			printList(initList4(),3);
			
			//mergeLists(List1,List4);

			//GetNode(List1,2);
			RemoveDuplicates(List5);

		}
	


	static void printList(Node node, int x)
	{
		System.out.println("List: "+ x);
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
		printList(prev, 1);
}

	Node Reverse(Node head) {
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
		return prev;

	}
	static Node mergeLists(Node headA, Node headB) {
		Node node = new Node();
		Node mergeNode = new Node();
		if(headA == null || headB == null)
		{
			return null;
		}
		
		while (headA !=null && headB != null) {
			
			System.out.println(node.data);
			if (headA.data > headB.data || headA.next == null) {
				node.data = headB.data;
				
				headB = headB.next;
				node.next = new Node();
			}
			else
			{
				node.data = headA.data;
				headA = headA.next;
				node.next = new Node();

			}
		}
		printList(node, 4);
		return headB;
	     

	}
	/*
	 * Counting backwards from the tail node of the linked list, 
	 * get the value of the node at the given position. 
	 * A position of 0 corresponds to the tail, 1 corresponds to the node 
	 * before the tail and so on.
	 */
	static int GetNode(Node head,int n) {
		 Node prev= null;
			Node loopNode = head;
			int count =0;
			while(loopNode!=null)
			{
				Node node = new Node();
				node.data=loopNode.data;
				loopNode= loopNode.next;
				node.next=prev;
				prev=node;
			}
	    while(prev != null)
	    {
	        if(count == n)
	        {
	            return prev.data;
	        }
	        else
	        {
	            prev = prev.next;
	            count += 1;
	        }
	    }
	return 0;
}

static Node RemoveDuplicates(Node head) {

	//pointers
    Node node = head;// assign pointer to the list
    Node prev = node;//stores previous location of pointer
   // move the pointer ahead//

    //Base Case: when node is empty
    if(head == null)
    {
        return null;
    }
    
    printList(node, 5);

    while(node != null)
    {
    	System.out.println("Item: " + node.data);

        //when they are not the same have prev point to the current
    	//then move prev to node
        if(prev.data!=node.data)
        {
            prev.next=node;
            prev= node;

        }
        //increment nodes
        node= node.next;
    }
    //This handles cases for when duplicates like 3-3-3 are found at the end
    while(prev.next !=null)
    {
        if(prev.data==prev.next.data)
        {
            prev.next=null;
            prev=prev.next;
        }
    }
    printList(head, 5);
	return head;
    

}

	static int CompareLists(Node headA, Node headB)
	{
		int sizeA =0;
		int sizeB =0;
		//EmptyList
		if(headA == null || headB == null)
		{
			return 0;
		}
		
		//loop through headA
		while(headA != null)
		{
			
			//check headB is null
			if(headB == null)
			{
				System.out.println("Not equal"); 
				return 0;
			}
			//compare the data and increment the count, and move to next node
			else if(headA.data == headB.data)
			{
				
				sizeA +=1;
				sizeB +=1;
				headA= headA.next;
				headB= headB.next;
			}
			//The data is not equal
			else 
			{
				System.out.println("Not equal"); 
				return 0;
			}
		

		}
		//Check the size as well as check HeadB is also at the end of the list like HeadA
		if(sizeA ==sizeB && headB == null)
		{
			System.out.println("Equal List"); 
			return 1;
		}
		else
			System.out.println("Not equal"); 
			return 0;
		
	}
	
	static Node initList1()
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
	static Node initList2()
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
	static Node initList3()
	{
		//init objects
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();

		//init data
		a.data = 1;
		b.data = 2;
		c.data = 3;

		//init link
		a.next=b;
		b.next=c;

		return a;
		
	}

	private static Node initList4() {
		//init objects
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		//init data
		a.data = 6;
		b.data = 7;
		c.data = 8;
		d.data = 9;
		e.data = 10;
		//init link
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		return a;
	
	}
	private static Node initList5() {
		//init objects
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		//init data
		a.data = 1;
		b.data = 1;
		c.data = 2;
		d.data = 2;
		e.data = 3;
		//init link
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		return a;
	
	}

	

}
